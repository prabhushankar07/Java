class a7missingelement{
    public static void main(String args[]){
        int a[]={5,4,1,6,2};
        int num=a.length;
        int n=num+1;   //1 element missing
        int total=(n*(n+1)/2);
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=a[i];
        }
        int missing=total-sum;
        System.out.println(missing);
    }
}