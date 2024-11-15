class primenum{
    public static void main(String args[]){
        int n=14;
        boolean primenum=isPrime(n);
        if(primenum==true){
        System.out.println("this is a prime num");
        }else{
            System.out.println("this is not a prime num");
        }
    }
    public static boolean isPrime(int n){
        
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }   
        return true;
    }
}

