class a5largestelement{
    public static void main(String args[]){
        int arr[]={5,7,8,2,3};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}