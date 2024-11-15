public class dog{
    private String name;
    private int legs;
    public static void sound(){

    }
}

public class oopsconp{
   public static void main(String args[]){
        Scanner c=new Scanner(System.in);
        String name=c.nextLine();
        int legs=c.nextInt();
        dog dc=new dog();
   } 
}


//parent
class animal{
    String name;
    void bark(){

    }
}
//child class
class dog extends animal{

}
class main{

    dog mc=new dog();
    mc.name="john";
    mc.bark();
}



