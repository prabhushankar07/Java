class reversearray{
    public static void main(String args[]){
        int num[]={2,3,4,5,6,7};
        reverseArray(num);
    }
    public static void reverseArray(int num[]){
        int first=0,last=num.length-1;
        while(first<=last){
            //swap
            int temp=num[first];
            num[first]=num[last];
            num[last]=temp;

            first++;
            last--;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();

    }
}