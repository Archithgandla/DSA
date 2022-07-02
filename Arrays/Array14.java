//Brute Force
//Time : O(n^2) Space : O(1) 
import java.util.*;
/*
class Solution {
    public int[][] merge(int[][] intervals) {
        
    List<List<Integer>> res = new ArrayList<>();
        
      Arrays.sort(intervals,new Comparator<int[]>(){
          
          public int compare(int[] start ,int[] end ){
              
              if(start[0] != end[0])
                  return start[0]-end[0];
              return start[1]-end[1];
          }
      });
        
        
    for(int i = 0;i<intervals.length;i++){
        
        int start = intervals[i][0];
        int end = intervals[i][1];
        
        for(int j=i+1;j<intervals.length;j++){
            
            if(end>=intervals[j][0]){
                    end = Math.max(intervals[j][1],end);
                    i+=1;
            }            
            
        }
        res.add(Arrays.asList(start,end));
    }
        
    
        
    int[][] ans = new int[res.size()][2];
        
    for(int i=0;i<res.size();i++){
        
        ans[i][0] = res.get(i).get(0); 
        ans[i][1] = res.get(i).get(1);
        
    }
    return ans;
        
    }
}
*/

//Optimized
//Time : O(n) space : O(1)

class Solution {
    public int[][] merge(int[][] intervals) {
        
    List<List<Integer>> res = new ArrayList<>();
        
      Arrays.sort(intervals,new Comparator<int[]>(){
          
          public int compare(int[] start ,int[] end ){
              
              if(start[0] != end[0])
                  return start[0]-end[0];
              return start[1]-end[1];
          }
      });
        
    
        
    int start = intervals[0][0];
    int end   = intervals[0][1];
        
    for(int i = 1;i<intervals.length;i++){
                
        if(end >= intervals[i][0] ){
            end  = Math.max(end,intervals[i][1]);
        }
        
        else{
            
            res.add(Arrays.asList(start,end));
            start = intervals[i][0];
            end = intervals[i][1];
            //System.out.println(i); 
            //System.out.println(res);        
            
    
    }
        
    
    }
    res.add(Arrays.asList(start,end));
    int[][] ans = new int[res.size()][2];
        
    for(int i=0;i<res.size();i++){
        
        ans[i][0] = res.get(i).get(0); 
        ans[i][1] = res.get(i).get(1);
        
    }
    return ans;
        
    }
}

