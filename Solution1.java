class Solution {
    public String countAndSay(int n) {
        String s="1";
        n--;
        while(n-->0)
        {
            char c=s.charAt(0);
            String x="";
            int cnt=1;
            for(int i=1;i<s.length();i++)
            {
                if(s.charAt(i)!=c)
                {
                    x+=cnt;
                    x+=c;
                    cnt=1;
                    c=s.charAt(i);
                }
                else
                    cnt++;
            }
            x+=cnt;
            x+=c;
            s=new String(x);
        }
        return s;
    }
}