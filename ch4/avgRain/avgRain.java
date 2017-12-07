import java.util.Scanner;
public class avgRain{
  public static void main(String []args){
  Scanner stdin = new Scanner(System.in);
  System.out.println("input number of years");
  int years = -1;
  while(years < 0){
  years = stdin.nextInt();
  }
  double rain = 0;
  int curr = 1;
  for(int i = 0; i < years; i++){
    for(int j = 0; j <12; j++)
     {
    System.out.println("input number of inches of rain this month");
    curr = -1;
    while(curr < 0){
    curr = stdin.nextInt();
    }
     rain += curr;
     }
  }
  double numMonths = 1;
   numMonths = years *12;
  double avgRain = rain/numMonths;
  System.out.println(numMonths+" months have passed, with "+rain+" inches of rain. making an average rain per month of " + avgRain);
  
  }}