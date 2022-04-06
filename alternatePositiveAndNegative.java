package src.BasicCode.arrays;

public class alternatePositiveAndNegative {
    static void rearrange(int arr[] ,int n){
        int i=0;
        int j=n-1;
        while(i<j){
            while(i< n && arr[i] >0){
                i++;
            }
            while(j>=0 && arr[j] <0){
                j--;
            }
            if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        if(i==0 || i==n){
            return;

        }

        int k=0;
        while(k<n && i<n){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

                i=i+1;
                k=k+2;
            }
        for(int m=0;m<n;m++){
            System.out.print(arr[m]+" ");

        }
        }

    public static void main(String[] args) {
        int arr[] ={-4,2,-1,3,-9,6};
        int n= arr.length;

        rearrange(arr,n);
    }
}
