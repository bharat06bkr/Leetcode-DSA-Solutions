class RLEIterator {
    int index;
    int [] A;
    public RLEIterator(int[] A) {
        this.A = A;
        index = 0;
    }
    
    public int next(int n) {
        while(index < A.length && n > A[index]){
            n = n - A[index];
            index += 2;
        }
        
        if(index >= A.length){
            return -1;
        }
        
        A[index] = A[index] - n;
        return A[index + 1];
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(encoding);
 * int param_1 = obj.next(n);
 */