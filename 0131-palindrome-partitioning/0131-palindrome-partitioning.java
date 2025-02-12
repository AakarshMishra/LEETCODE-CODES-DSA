class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> path=new ArrayList<>();
        solve(0,path,ans,s);
        return ans;
    }
    public static void solve(int i,List<String> path,List<List<String>> ans,String s)
    {
        if(i==s.length())
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int ind=i;ind<s.length();ind++)
        {
            if(palimdrome(i,ind,s))
            {
                path.add(s.substring(i,ind+1));
                solve(ind+1,path,ans,s);
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean palimdrome(int start,int end,String s)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            return false;
        }
        return true;
    }
}