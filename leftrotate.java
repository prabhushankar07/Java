class leftrotate{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;  
        int k=1;
         k=k%n;  
        reverse(arr,0,k-1);  // --2
        reverse(arr,k,n-1);  // --3
        reverse(arr,0,n-1);  // --1
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[],int start,int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}