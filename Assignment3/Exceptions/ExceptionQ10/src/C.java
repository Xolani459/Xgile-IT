public class C {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        String s="";
         int a= 1;
        try {a= Integer.parseInt(s);}
        catch (NumberFormatException nfe) {}
        System.out.println("Enter another number: ");
        int b= 1;
        try {b= Integer.parseInt(s);}
        catch (NumberFormatException nfe) {}
        System.out.println("Product: " + a*b);
    }

}
