class a3leapyr{
    public static void main(String args[]){
        int n=2004;
        if(n%4==0 && n%100!=0){
            System.out.println("leap year");
        }else if(n%400==0){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
    }
}