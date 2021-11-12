import java.util.Scanner;
public class BMIException {
    public double weightUS;
    public double heightUS;
    public double weightEU;
    public double heightEU;
    public double BMI;

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public double getWeightEU() {
        return weightEU;
    }

    public void setWeightEU(double weightEU) {
        this.weightEU = weightEU;
    }

    public double getHeightUS() {
        return heightUS;
    }

    public void setHeightUS(double heightUS) {
        this.heightUS = heightUS;
    }

    public double getHeightEU() {
        return heightEU;
    }

    public void setHeightEU(double heightEU) {
        this.heightEU = heightEU;
    }

    public double getWeightUS() {
        return weightUS;
    }

    public void setWeightUS(double weightUS) {
        this.weightUS = weightUS;
    }
    public void userInput(){
        double feet;
        double inches;
        Scanner input = new Scanner(System.in);
        // obtains Imperial height than converts to inches for ease of BMI
        try{
        System.out.print("Please enter you height in feet: ");
        feet = input.nextDouble();
        System.out.print("Please enter your height (inches): ");
        inches = input.nextDouble();
            setHeightUS(inches + (feet*12));
        }
        catch (Exception e){
            System.out.println("Error, please try again");
        }

        //obtains Imperial weight
        try{
        System.out.print("Please enter your weight in lbs: ");
        setWeightUS(input.nextDouble());}
        catch (Exception e){
            System.out.println("Error, please try again");
        }

    }
    public void converter(){
        setHeightEU(getHeightUS() / 39.37);
        setWeightEU(getWeightUS()/2.205);
    }
    public void bmiEquation(){
        setBMI(getWeightEU()/(getHeightEU() * getHeightEU()));

    }
    public void printResults(){
        System.out.print("Your BMI is: ");
        System.out.println(String.format("%,.0f", getBMI()));
        if (getBMI() < 18.5) {
            System.out.println("You are underweight.");
        }

        else if(getBMI() < 25) {
            System.out.println("You are normal weight.");
        }
        else {
        System.out.println("You are obese.");
        }}
    public static void main(String[] args) {
        BMIException i = new BMIException();
        i.userInput();
        i.converter();
        i.bmiEquation();
        i.printResults();
    }
}



