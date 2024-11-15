class mergesortedarray{
    public static void main(String args[]){
        int arr1[]={2,3,5,6};      
        int arr2[]={1,4,7,8};       
        int n=arr1.length;
        int m=arr2.length;
        int ans[]=new int[n+m];   
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
        if(arr1[i]<arr2[j]){
            ans[k]=arr1[i];
            i++;k++;
        }else if(arr2[j]<arr1[i]){
            ans[k]=arr2[j];
            j++;k++;
        }
        else{
            ans[k]=arr1[i];
            i++;j++;k++;
        }
        }
         // Add remaining elements from arr1 (if any)
        while (i < n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        // Add remaining elements from arr2 (if any)
        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        for(int x=0;x<n+m;x++){
            System.out.print(ans[x]+" ");
        }
    }
}