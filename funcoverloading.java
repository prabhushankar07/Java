//overloading using parameters
class funcoverloading{
    public static void main(String args[]){
            int x=sum1(2,3,4);
            System.out.println(x);
    }
    public static int sum1(int a,int b){
        return a+b;
    }
    public static int sum1(int a,int b,int c){
        return a+b+c;
    }
    public static int sum1(int a,int b,int c,int d){
        return a+b+c+d;
    }
}