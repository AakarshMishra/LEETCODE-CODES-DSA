class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rs =0,cs=0,re= matrix.length-1,ce = matrix[0].length-1;
        int i1;
        ArrayList<Integer> list = new ArrayList<>();
        while(cs<=ce&&rs<=re){
            if(cs<=ce&&rs<=re)
            {
            for(i1=cs;i1<=ce;i1++){
                list.add(matrix[rs][i1]);
            }
            rs++;
            }
            if(cs<=ce&&rs<=re)
            {
            for(i1=rs;i1<=re;i1++){
                list.add(matrix[i1][ce]);}
            
            ce--;
            }
            
            if(cs<=ce&&rs<=re)
            {
            for(i1=ce;i1>=cs;i1--){
                list.add(matrix[re][i1]); 
            }
            re--;
            }
            if(cs<=ce&&rs<=re)
            {
            for(i1=re;i1>=rs;i1--){
                list.add(matrix[i1][cs]);
                
            }
            cs++;
            }
        }
      
        return list;
    }
}