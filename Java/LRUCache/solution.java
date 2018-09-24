// Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

// get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
// put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

// Example:

// LRUCache cache = new LRUCache( 2 /* capacity */ );

// cache.put(1, 1);
// cache.put(2, 2);
// cache.get(1);       // returns 1
// cache.put(3, 3);    // evicts key 2
// cache.get(2);       // returns -1 (not found)
// cache.put(4, 4);    // evicts key 1
// cache.get(1);       // returns -1 (not found)
// cache.get(3);       // returns 3
// cache.get(4);       // returns 4

public class LRUCache {
    private HashMap <Integer,Node>map;
    private int cap;
    private int number;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        cap=capacity;
        number=0;
        head=new Node(-1,-1);
        head.pre=null;
        head.next=null;
        tail=head;
        map=new HashMap<Integer,Node>(capacity);
    }

    public int get(int key) {
        Node ret=map.get(new Integer(key));
        if(ret==null) return -1;
        refresh(ret);
        return ret.value;

    }
    public void refresh(Node node){
        if(node==head.next) return ;
        Node temp=head.next ; //head node in the map;
        Node nodePre=node.pre;
        Node nodeNext=node.next; //save
        head.next=node;
        node.pre=head;
        temp.pre=node;
        node.next=temp;
        nodePre.next=nodeNext;
        if(nodeNext!=null)   nodeNext.pre=nodePre;
            else tail=nodePre;

    }

    public void set(int key, int value) {
        Node ret=map.get(key);
        if(ret!=null) {
            refresh(ret);
            ret.value=value;
        }
        else {
            //check and delete 
            if(number==cap){
                Node temp=tail;
                tail=tail.pre;
                tail.next=null;
                map.remove(new Integer(temp.key));
                number--;
            }
            number++;
            //add in the last and refresh
            Node node=new Node(key,value);
            node.pre=tail;
            node.next=null;
            tail.next=node;
            tail=node;
            map.put(key,node);
            refresh(node);
        }

    }
    class Node{
        int key;
        int value;
        Node pre;
        Node next;
        public Node(int k,int v){
            value=v;
            key=k;
        }

    }
}