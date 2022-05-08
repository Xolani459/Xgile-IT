import java.util.Scanner;
public class Book {

    private String Author;
    private String title;
    private String Publisher;
    private double cost;
    private int Stock_Pos;

    public Book(String Author, String title, String Publisher, double cost, int Stock_Pos) {
        this.Author = Author;
        this.title = title;
        this.Publisher = Publisher;
        this.cost = cost;
        this.Stock_Pos = Stock_Pos;

    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public double getCost() {
        return cost;
    }

    public int getStock_Pos() {
        return Stock_Pos;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public void setStock_Pos(int stock_Pos) {
        Stock_Pos = stock_Pos;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String SearchBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the title of the book you searching for?");
        title = sc.nextLine();
        if (title == getTitle()) {
            return "Book titled :" + title + " is available publisher: " + Publisher + " Author :" + Author;
        } else {
            return "Book is not available";
        }

    }

    public double CostOfBook() {
       double Tot_Cost=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of copies required?");
        Stock_Pos= sc.nextInt();
        if (Stock_Pos <=Stock_Pos)
        {
            Tot_Cost =Stock_Pos * cost;
        }
        else
        {
            System.err.println("Required copies not in stock");
        }
        return  Tot_Cost;

    }
}
