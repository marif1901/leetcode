// Given an array of strings, group anagrams together.

// Example:

// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note:

// All inputs will be in lowercase.
// The order of your output does not matter.


public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<List<String>>();
        HashMap <String,ArrayList<String>> hm=new HashMap<>();
        int len=strs.length;
        for(int i=0;i<len;i++)
        {
            char [] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=String.valueOf(ch);
            if(hm.containsKey(s))
            {
                ArrayList<String> t=hm.get(s);
                t.add(strs[i]);
                hm.put(s,t);
            }
            else
            {
                ArrayList<String> ar=new ArrayList<>();
                ar.add(strs[i]);
                hm.put(s,ar);
            }
        }
        for(ArrayList<String> al: hm.values())
        {
            Collections.sort(al);
            result.add(al);
        }
        return result;
    }
}
