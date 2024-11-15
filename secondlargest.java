class secondlargest{
    public static void main(String args[]){
        int arr[]={2,3,9,7,9,8,5};
        int first=arr[0];
        int second=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}