class convertingtoINR{
    public static void main(String args[]){
        int code=2;
        int amt=250;
        int x=convertToInr(code,amt);
        System.out.println(x);
    }
    public static int convertToInr(int code,int amt){
        int amount=0;
        if(code==1){
            amount=amt*84;
        }else if(code==2){
            amount=amt*54;
        }
        return amount;
    }
}
