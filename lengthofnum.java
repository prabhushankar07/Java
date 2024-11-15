import java.util.*;
class lengthofnum{

    public static int lengthofdigits(int n){
        int len=String.valueOf(n).length();
        return len;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=lengthofdigits(n);
        System.out.println(x);
    }
}




