import java.util.Scanner;
import java.math.RoundingMode;


public class Room {

    protected  double Height;
    protected  double Width;
    protected  double Breadth;
    public static void main(String[] args)
    {
        RoomDemo rd= new RoomDemo();
        rd.Display();
    }
    public double CalcVolume(double Height,double Width, double Breadth)
    {
        double Volume;
        Volume =Height * Width * Breadth;
        return Volume;
    }
}
 class RoomDemo extends Room {
     //Declare room object
     Room rm = new Room();
    public  void  Display(){
         //Declare the scanner object
         Scanner input = new Scanner(System.in);

         System.out.println("Please enter Height");
         rm.Height = input.nextDouble();

         System.out.println("Please enter Width");
         rm.Width = input.nextDouble();

         System.out.println("Please enter Breadth");
         rm.Breadth = input.nextDouble();

          System.out.println("The volume of the room is :" + Math.round(rm.CalcVolume(rm.Height,rm.Width,rm.Breadth)));

     }
 }
