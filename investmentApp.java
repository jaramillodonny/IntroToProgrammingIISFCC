//DJ
import java.util.Scanner;
import java.lang.Math;

public class investmentApp {
 public double principle;
 public double interest;
 public double years;
 public double futureValue;
 public double profit;

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getFutureValue() {
        return futureValue;
    }

    public void setFutureValue(double futureValue) {
        this.futureValue = futureValue;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    Scanner input = new Scanner(System.in);
 //This asks for initial amount, interest in whole numbers, and years of investment.
 public void userInput() {
     System.out.print("Please enter the amount of capital you wish to invest: ");
     setPrinciple(input.nextDouble());
     System.out.print("Please enter your monthly interest rate: ");
     setInterest(input.nextDouble());
     System.out.print("Please enter how many years you wish to invest: ");
     setYears(input.nextDouble());
 }
 //This is to convert the interest to a usable number, but if the user inputs an already usable number the program won't fail.
 //Only takes in monthly interest so if you really wanted to you could add different if loops to ask the user if the interest is yearly or monthly.
    
 public void convertInterest(){
     if( getInterest() > 1){
         setInterest(getInterest() / 100);
     }
    setInterest(getInterest()/12);
 }
 //First is the investment formula followed by a simple profit equaiton
 public void calculate(){
     setFutureValue(getPrinciple() * (Math.pow(1 + getInterest(),(getYears() * 12))));
     setProfit(getFutureValue()-getPrinciple());
 }
 //Prints the total money once finished, as well as returns. Formatted to two decimals points for ease to the user.
 public void printResults(){
     System.out.print("The future value of your investments is: ");
     System.out.println(String.format(("%.2f"),getFutureValue()));
     System.out.print("The profit you made is: ");
     System.out.print(String.format("%.2f",getProfit()));
     System.out.print("\n");
     System.exit(0);
 }
//calls
 public static void main(String[] args){
    investmentApp i = new investmentApp();
    i.userInput();
    i.convertInterest();
    i.calculate();
    i.printResults();
}
}