class Solution {
    public int[] decrypt(int[] code, int k) {
        int a=code.length;
        int arr[]=new int[a];
        if(k==0) return arr;
        for(int i=0;i<a;i++){
            if(k>0){
            for(int j=i+1;j<=(i+k);j++){
                arr[i]+=code[(j%a)];
            }
            }
            else{
                for(int j=i-1;j>=i+k;j--){
                    arr[i]+=code[((a+j)%a)];
                }
            }
        }
        return arr;
    }
}