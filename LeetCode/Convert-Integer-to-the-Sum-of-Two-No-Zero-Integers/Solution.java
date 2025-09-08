class Solution {
    public boolean checkZero(int n){
        int flag=0;
        while(n>0){
            int r = n % 10;
            if(r==0) {
                flag=1;
                break;
            }
            n = n / 10;
        }
        if(flag==1) return true;
        else return false;
    }
    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        if(n==2){
            arr[0] = 1;
            arr[1] = n-arr[0];
        }
        if(n>=3){
            arr[0] = 2;
            arr[1] = n - arr[0];
        }
        while(checkZero(arr[0])||checkZero(arr[1])){
            arr[0]++;
            arr[1]=n-arr[0];
        }
        return arr;
    }
}