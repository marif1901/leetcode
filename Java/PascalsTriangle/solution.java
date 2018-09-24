// Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it.

// Example:

// Input: 5
// Output:
// [
//      [1],
//     [1,1],
//    [1,2,1],
//   [1,3,3,1],
//  [1,4,6,4,1]
// ]


public class Solution {
     public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal =new ArrayList<List<Integer>>();
        for(int i = 1; i <= numRows ; i++) {
            List l=new ArrayList<Integer>();
            pascal.add(l);                
            for(int j=0;j<i;j++) {
                if (j==0)
                    l.add(1);
                else if (j==i-1) 
                    l.add(1);
                else if (j>0) 
                    l.add(pascal.get(i-2).get(j-1)+pascal.get(i-2).get(j));
            }
        }
        return pascal;
    }
}