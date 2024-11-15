import java.util.*;
class palindrome{
    public static void palindromes(int a,int b){
        int count=0;
        for(int i=a;i<=b;i++){
            int num=i;
            int rem=0;
            int rev=0;

        while(num>0){
                    rem=num%10;    // 101%10=1     10%10=0    1%10=1   
                    rev=rev*10+rem; // 0+1=1       1*10+0=10    10*10+1=101     
                    num/=10;      // num=101/10=10    10/10=1   num=1/10=0      
        }
        if(i==rev){
            count+=1;
        }
        }
        System.out.println("count "+count);
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        palindromes(a,b);
    }
}