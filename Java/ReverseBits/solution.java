// Reverse bits of a given 32 bits unsigned integer.

// Example:

// Input: 43261596
// Output: 964176192
// Explanation: 43261596 represented in binary as 00000010100101000001111010011100, 
//              return 964176192 represented in binary as 00111001011110000010100101000000.


public class Solution {
// you need treat n as an unsigned value
public int reverseBits(int n) {
    String op = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
    op = new StringBuilder(op).reverse().toString();
    int num = Integer.parseUnsignedInt(op,2);
    return num;
}}
