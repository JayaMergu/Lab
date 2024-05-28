/** Create a class name book with attributes title, author,ISBN, and price. Include methods to get and set the attributes
*/
import java.util.Scanner;
class Book{ // creating class as book
    String title; // attributes of book that are required
    String author;
    long isbn;
    float price;
    void getData(){ // method to get the details from user 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        title=sc.nextLine();
        System.out.println("Enter author name of the book:");
        author=sc.nextLine();
        System.out.println("Enter isbn no of book:");
        isbn=sc.nextLong();
        System.out.println("Enter price of the book:");
        price=sc.nextFloat();
    }
    void setData(){ // method to display the data and set the data 
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.price=price;
        System.out.println("The title of book is:"+this.title);
        System.out.println("The author of the book is:"+this.author);
        System.out.println("The isbn no of book is:"+this.isbn);
        System.out.println("The price of book is:"+this.price);
    }
}
class BookDemo{ // main class
    public static void main(String args[]){
        Book b1=new Book(); // object creating as b1
        b1.getData();
        b1.setData();// methods calling with object
    }
}