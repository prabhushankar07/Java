class a8singlenumprbm{
    public static void main(String args[]){
        int arr[]={2,2,1,4,1};  
        int num=0;        
        for(int i=0;i<arr.length;i++){     
           num=num^arr[i];                 
        }
        System.out.println(num);
    }
}