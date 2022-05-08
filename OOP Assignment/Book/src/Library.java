import java.util.ArrayList;
import java.util.Scanner;

public class Library extends book {

    public Library(String title, int NumPages, float price, String Publisher) {
        super(title, NumPages, price, Publisher);
        this.title=title;
        this.NumPages=NumPages;
        this.price=price;
        this.Publisher=Publisher;
    }
    public String AddBook(String title)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Add book: ");
        title= sc.nextLine();

        return title;
    }
    public String Delete(String title)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the book you want to delete?");
        title=sc.nextLine();

        return title;
    }
    

}
