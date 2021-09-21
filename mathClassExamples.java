import java.util.Scanner;

public class mathClassExamples {
    double a;
    double b;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    Scanner input = new Scanner(System.in);
    public void userInput(){
        System.out.print("Please enter the first digit to experiment with (A): ");
        setA(input.nextDouble());
        System.out.print("Please enter the second digit to experiment with (B): ");
        setB(input.nextDouble());
    }
    //the math class examples used are sqrt pow log10 exp max 
    public void performances(){
        System.out.println("Square root of A is: " + Math.sqrt(getA()));
        System.out.println("Square root of B is: " + Math.sqrt(getB()));
        System.out.println("A to the power of B is: " + Math.pow(getA(),getB()));
        System.out.println("Log base 10 of A is: " + Math.log10(getA()));
        System.out.println("Log base 10 of B is: " + Math.log10(getB()));
        System.out.println("Exponential of A is: " + Math.exp(getA()));
        System.out.println("Exponential of B is: " + Math.exp(getB()));
        System.out.println("The Maximum of A and B is: " + Math.max(getA(),getB()));
    }
    public static void main(String[] args){
    mathClassExamples i = new mathClassExamples();
    i.userInput();
    i.performances();
    }
}
