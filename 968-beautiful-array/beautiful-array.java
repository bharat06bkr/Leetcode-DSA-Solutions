
class Solution {
    public int[] beautifulArray(int n) {
        ArrayList <Integer>res=new ArrayList<>();
        res.add(1);
        while(res.size()<n){
            ArrayList<Integer>next=new ArrayList<>();
            for(int i=0;i<res.size();i++){
                int x=res.get(i);
                if(2*x-1<=n){
                    next.add(2*x-1);
                }
            }
              for(int i=0;i<res.size();i++){
                int x=res.get(i);
                if(2*x<=n){
                    next.add(2*x);
                }
            }
          res=next;
        }
           // convert ArrayList<Integer> to int[]
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
    return ans;
        
    }
}