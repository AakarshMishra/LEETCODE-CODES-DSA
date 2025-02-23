class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x=0;x<edges.length;x++)
        {
            hm.put(edges[x][0],hm.getOrDefault(edges[x][0],0)+1);
            hm.put(edges[x][1],hm.getOrDefault(edges[x][1],0)+1);
            
        }
        for(Map.Entry<Integer,Integer> map:hm.entrySet())
        {
            System.out.print(map.getKey()+","+map.getValue()+"");
            if(map.getValue()==hm.size()-1)
            return map.getKey();
        }
        return -1;
    }
}