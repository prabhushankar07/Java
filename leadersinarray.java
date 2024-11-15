import java.util.*;
class leadersinarray{
    public static void main(String args[]){
        int arr[]={16,17,4,3,5,2};
        ArrayList<Integer> leaders = new ArrayList<>();
        int max=arr[arr.length-1];
        leaders.add(max);
          
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                leaders.add(arr[i]);
                max=arr[i];
            }
        }
        for(int a:leaders){
            System.out.print(a+" ");
        }
    }
}