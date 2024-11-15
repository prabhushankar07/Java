import java.util.*;
class removeduplicates{
    public static void main(String args[]){
        int arr[] = {7, 2, 1, 2}; 
        Arrays.sort(arr);  // Sort the array first

        
        System.out.print(arr[0] + " ");

        
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}