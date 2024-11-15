class linearsearch{
    public static void main(String args[]){
        int num[]={1,3,223,32,44,43,54,66,56,76};
        int key=22;
        linearSearch(num,key);
    }
    public static void linearSearch(int num[],int key){
        int flag=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                flag=1;
                System.out.println("the element is found at "+i);
            }   
        }
        if(flag==0){
            System.out.println("the element is not found");
        }
    }
}