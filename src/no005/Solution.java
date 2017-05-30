package no005;

/**
 * Created by twb on 2017/5/29.
 */
public class Solution {

    String findLongestPalindrome(String s)
    {
        int length=s.length();
        int maxlength=1;
        int start = 0;
        boolean P[][]= new boolean[50][50];
        for(int i=0;i<length;i++)//初始化准备
        {
            P[i][i]=true;
            if(i<length-1&&s.charAt(i)==s.charAt(i+1))
            {
                P[i][i+1]=true;
                start=i;
                maxlength=2;
            }
        }

        for(int len=3;len<length;len++)//子串长度
            for(int i=0;i<=length-len;i++)//子串起始地址
            {
                int j=i+len-1;//子串结束地址
                if(P[i+1][j-1]&&s.charAt(i)==s.charAt(j))
                {
                    P[i][j]=true;
                    maxlength=len;
                    start=i;
                }
            }
        System.out.println(maxlength);

        if(maxlength>=2)
            return s.substring(start,start+maxlength);
        return null;
    }

    /**https://segmentfault.com/a/1190000003914228
     * #Python
     def manacher(s):
     #预处理
     s='#'+'#'.join(s)+'#'

     RL=[0]*len(s)
     MaxRight=0
     pos=0
     MaxLen=0
     for i in range(len(s)):
     if i<MaxRight:
     RL[i]=min(RL[2*pos-i], MaxRight-i)
     else:
     RL[i]=1
     #尝试扩展，注意处理边界
     while i-RL[i]>=0 and i+RL[i]<len(s) and s[i-RL[i]]==s[i+RL[i]]:
     RL[i]+=1
     #更新MaxRight,pos
     if RL[i]+i-1>MaxRight:
     MaxRight=RL[i]+i-1
     pos=i
     #更新最长回文串的长度
     MaxLen=max(MaxLen, RL[i])
     return MaxLen-1
     */
    /**
     *
     *
     * @param args
     */



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLongestPalindrome("abcda"));
    }

}
