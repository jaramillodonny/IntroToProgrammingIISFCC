//DJ
import java.util.Scanner;

public class letterCounter {

    public void countLetters(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input the string, to have its letters counted: ");
        String s = input.nextLine(); //Scan in the input as a string to variable s
        int count = 0;
        System.out.println("String: " +s);
        for (int i = 0; i < s.length(); i++) { //counts through the string using a for loop
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        System.out.println("Letters: " +count);
    }

    public static void main(String[] args){
    letterCounter i = new letterCounter();
    i.countLetters();
    }}