//DJ
import java.util.Scanner;

public class stringClassExamples {

    //This code uses the uppercase, lowercase, length, hashcode, and empty methods.
    //for this code I put everything in one object, since it is so small and allocation isnt really important.
    Scanner input = new Scanner(System.in);
    public void userInput(){
        System.out.print("Please enter the string you wish to have demonstrated: ");
    String custom = input.nextLine();
    System.out.print("Uppercase method; ");
    System.out.println(custom.toUpperCase());
    System.out.print("Lowercase method: ");
    System.out.println(custom.toLowerCase());
    System.out.print("Length of the string: ");
    System.out.println(custom.length());
    System.out.print("The hashcode of the string: ");
    System.out.println(custom.hashCode());
    System.out.print("Checks if string is empty: ");
    System.out.println(custom.isEmpty());
    System.out.print("\n");
    }
    public static void main(String[] args){
    stringClassExamples i = new stringClassExamples();
    i.userInput();
    }
}
