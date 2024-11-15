import java.util.*;
class sumofdigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int n=num;
        int sum=0;   //456 = 4+5+6=15
        while(n>0){
            int rem=n%10;  
            sum+=rem;   //6+5+4
            n/=10;     

        }

        System.out.println(sum);
    }
}