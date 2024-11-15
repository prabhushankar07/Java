import java.util.*;
class Main{
    public static void findaverage(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int avg=sum/n;

        System.out.println(sum);
        System.out.println(avg);


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);//4 1 2 3 4
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        findaverage(arr,n);
    }
}