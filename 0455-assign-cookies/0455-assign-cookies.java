class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int TotalChildCount = g.length;
        int TotalCookieCount = s.length;

        int ChildGreedFactorIndex = 0;
        int CookieSizeIndex = 0;
        int SatisfiedChildren = 0;
        while( ChildGreedFactorIndex < TotalChildCount && CookieSizeIndex < TotalCookieCount )
        {  
            //If current cookie can satisfy the Current Children
            if(s[CookieSizeIndex] >= g[ChildGreedFactorIndex]){
                ++SatisfiedChildren;  //If one children satisfied move o second children
                ++ChildGreedFactorIndex;  //Move to Second child
                ++CookieSizeIndex;           // Move to next cookie
            } else{
                ++CookieSizeIndex;            //If not satisfied move to another cookie
            }
        }
        return SatisfiedChildren;


    }
}