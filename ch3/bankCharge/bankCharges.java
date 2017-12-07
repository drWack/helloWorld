import java.util.Scanner;
public class bankCharges{
  public static void main(String[] args){
  Scanner stdin = new Scanner(System.in);
  System.out.println("input number of checks written");
  int checks = stdin.nextInt();
  double cost = 10;
  if(checks < 20)
    cost += checks * .1;
  if(checks >= 20 && checks <40)
    cost += checks * .08;
  if(checks >=40 && checks <60)
    cost += checks *.06;
  if(checks >= 60)
    cost = checks * .04;
System.out.println("your banks fee will be $" + cost);
  
  }}