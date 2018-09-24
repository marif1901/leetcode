// Find the total area covered by two rectilinear rectangles in a 2D plane.

// Rectangle Area

// Example:

// Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
// Output: 45

// Note:
// Assume that the total area is never beyond the maximum possible value of int.


public class Solution {
    public int computeArea(int a, int b, int c, int d, int e, int f, int g, int h) {
        int a1=(c-a )*(d-b);
        int a2=(g-e)*(h-f);
        if(e>c || a>g && f>d || b>h) return a1+a2;
        int comm=Math.max(0,Math.min(c,g)-Math.max(a,e))*Math.max(0,Math.min(d,h)-Math.max(b,f));
        return a1+a2-comm;
    }
}