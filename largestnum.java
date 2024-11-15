class largestnum{
    public static void main(String args[]){
        int arr[]={23,45,56,67,18,44};
        int res=largestvalue(arr);
        System.out.println(res);
    }
    public static int largestvalue(int arr[]){
        int max=Integer.MIN_VALUE;    
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){      
                max=arr[i];
            }
        }
        return max;
    }
}