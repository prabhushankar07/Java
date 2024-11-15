//library management 
class user{
    String name;
    int id;
    int no_of_books_taken;
}
class Book{
    String booktitle;
    int num;
    String author;
}
class card{
    String username;
    String bookname;

}
class Remaindermessage{
    int duedate;
    String username;

}
class classdemo{
    public static void main(String args[]){
        user obj1=new user();
        obj1.name="sathya";
        System.out.println(obj1.name);
        obj1.id=2;
    }
}