class mergeteosortedarraywithoutextraspace{
    public static void main(String args[]){
        int a[]={1,5,8,0,0,0};
        int b[]={3,6,9};
        int n=3;
        int m=3;
        int i=n-1;
        int j=m-1;
        int k=a.length-1;                          
    while(j>=0){                                  
        if(i>=0 && a[i]<b[j]){
            a[k]=b[j];
            k--;
            j--;
        }else if(a[i]>b[j]){
            a[k]=a[i];
            k--;
            i--;
        }
    }
    for(int x=0;x<a.length;x++){
        System.out.print(a[x]+" ");
    }
    }
}