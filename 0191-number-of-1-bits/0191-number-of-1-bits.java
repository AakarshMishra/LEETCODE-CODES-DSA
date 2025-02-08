class Solution {
    public int hammingWeight(int n) {
    if(n==0)
    return 0;
    return hammingWeight(n>>1)+ (n&1);
    }
}