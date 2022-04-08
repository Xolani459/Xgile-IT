import java.util.Scanner;
import java.lang.Math;

public class VowelConsonant {
  public static void main(String[] args) {
    char Alphabet; 
    
    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask user to enter the the alphabet
    System.out.println("Enter the alphabet ");
    Alphabet = input.nextLine().charAt(0);
	
	switch (Alphabet){
	
	case 'a', 'e', 'i', 'o', 'u':
	System.out.println("The Alphabet "+Alphabet+ " is a vowel");
	
	break;
	
	case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
	System.out.println("The Alphabet " + Alphabet+" is Consonant");
	break;
	
	default:
	
	System.out.println();
	
	break;
	
	}
    input.close();
  }
}