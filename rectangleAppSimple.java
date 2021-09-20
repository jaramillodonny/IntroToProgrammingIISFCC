import java.util.Scanner;

public class rectangleAppSimple {
double length;
double width;
double perimeter;
double area;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    Scanner input = new Scanner(System.in);
public void userInput(){
    System.out.print("Please enter your rectangle's length: ");
    setLength(input.nextDouble());
    System.out.print("Please enter your rectangle's width: ");
    setWidth(input.nextDouble());
}
public void calculations(){
    setPerimeter((getLength()*2) + (getWidth()*2));
    setArea(getLength()*getWidth());
}
public void printResults(){
    System.out.print("The perimter of your rectangle is: ");
    System.out.println(String.format("%,.0f", getPerimeter()));
    System.out.print("The area of your rectangle is: ");
    System.out.println(String.format("%,.0f", getArea()));
    System.out.print("\n");
}
    public static void main(String[] args){
    rectangleAppSimple i = new rectangleAppSimple();
    i.userInput();
    i.calculations();
    i.printResults();
}

}