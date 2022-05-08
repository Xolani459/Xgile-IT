import java.awt.print.Book;
import java.util.ArrayList;

public class book {
    protected String title;
    protected int NumPages;
    protected float price;
    protected String Publisher;

    public book(String title,int NumPages,float price,String Publisher)
    {
        this.title=title;
        this.NumPages=NumPages;
        this.price=price;
        this.Publisher=Publisher;

    }
    public static  void main(String[] args)
    {
        ArrayList<Object> bk=new ArrayList<Object>();
        bk.add(new book("Paljas",124,45,"Mr Hlabela James"));
        bk.add(new book("Love More",145,89,"Mrs Leshole"));
        bk.add(new book("Love dont cost a thing",129,55,"Dr Mabena"));
        bk.add(new book("While we were still young",112,60,"Mr Jan Van"));
        bk.add(new book("Live your dreams",157,70,"Mr Mahlangu"));
        float total=0;
        for (int x=0;x<=4;x++)
        {


        }
    }

}
