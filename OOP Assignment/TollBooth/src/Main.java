public class Main {
    public static void main(String[] args) {
        TollBooth tb=new TollBooth(13,"Bakwena",0.50,13);
        char c='Y';
        tb.PayingCar();
        tb.NonPayingCar();
        tb.Display();
    }
}
