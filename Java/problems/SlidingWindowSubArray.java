public class SlidingWindowSubArray {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6};
        int currsum = 0;
        int k=3;
        for(int i=0;i<k;i++){
            currsum += arr[i]; 
        }

        for(int i=1;i<=k;i++){
            currsum = currsum - arr[i-1];
            currsum = currsum + arr[i+k-1];
        }

        System.out.println("Sum: "+ currsum);
    }
}