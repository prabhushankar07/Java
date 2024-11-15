import java.util.*;
class arrayinput{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int arr[]=new int[n];      // 0 1 2 3 4   arr[0]=11;  arr[1]=12;  arr[2]=13;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); // arr[0]=11    arr[1]=12    arr[2]=13
            //System.out.println(arr[i]);  //11    12    13
        }
        System.out.print("[");
       for(int i=0;i<n;i++){
            
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
    }
}