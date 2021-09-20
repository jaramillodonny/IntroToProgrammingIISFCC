import java.util.Scanner;

public class tipCalculatorApp {

    public double subtotal;
    public double total;
    public double tipRate;
    public double tip;

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTipRate() {
        return tipRate;
    }

    public void setTipRate(double tiprate) {
        this.tipRate = tiprate;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    Scanner input = new Scanner(System.in);
    public void userInput(){
        System.out.print("This is an application used to calculate your tip. \n Please enter your subtotal: ");
        setSubtotal(input.nextDouble());
        System.out.print("Now enter the percentage you would like to tip (no need to include % sign, just the number): ");
        setTipRate(input.nextDouble());
    }
    public void calculations(){
        setTip((getTipRate()/100) * getSubtotal());
        setTotal(getSubtotal() + getTip());
    }
    public void printResults(){
        System.out.print("The tip is: ");
        System.out.println(String.format("%,.00f", getTip()));
        System.out.print("The total is: ");
        System.out.print(String.format("%,.00f", getTotal()));
        System.out.println("\n");
    }
    public static void main(String[] args) {
    tipCalculatorApp i = new tipCalculatorApp();
    i.userInput();
    i.calculations();
    i.printResults();
    System.out.println("Remember to include your tax, if you live in the US where it isn't already included.\n");
    }
}