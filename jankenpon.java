import java.util.Scanner;
import java.util.Random;

public class jankenpon {
 public double player;
 public double cpu;

 public double getCpu() {
  return cpu;
 }

 public void setCpu(double cpu) {
  this.cpu = cpu;
 }

 public double getPlayer() {
  return player;
 }

 public void setPlayer(double player) {
  this.player = player;
 }

 Scanner input = new Scanner(System.in);
public void userInput(){
 System.out.println("Hello, welcome to a little game of rock, paper, scissors.\n Pick 0 for rock \n Pick 1 for paper" +
         "\n Pick 2 for scissors.");
setPlayer(input.nextDouble());
if(getPlayer() > 3 ){
 System.out.println("Error in input, please exit and try again. ");
 System.exit(1);
}
}
public void cpuChoice(){
 Random r = new Random();
 setCpu((int)r.nextDouble(3
 ));
}
public void runGame(){
 if (getCpu() == getPlayer()){
 System.out.println("It's a tie!!");
 }
 if (getCpu() == 2 && getPlayer() == 1){
  System.out.println("The computer chose scissors, and won.");
 }
 if (getCpu() == 1 && getPlayer() == 0){
  System.out.println("The computer chose paper, and won.");
 }
 if (getCpu()== 0  && getPlayer() == 2){
  System.out.println("THe computer chose rock, and won.");
 }
 if (getPlayer() == 0 && getCpu() == 2){
  System.out.println("Computer chose scissors, you win!");
 }
 if (getPlayer() == 1 && getCpu() == 0){
  System.out.println("Computer chose rock, you win!");
 }
 if (getPlayer() == 2 && getCpu() == 1){
  System.out.println("Computer chose paper, you win!");
 }
}
public static void main(String[] args){
jankenpon i = new jankenpon();
i.userInput();
i.cpuChoice();
i.runGame();
}
}