import java.util.Scanner;
public class bookClub{
  public static void main(String []args){
    Scanner stdin = new Scanner(System.in);
    System.out.println("input number of books purchased");
    int books = stdin.nextInt();
    int points = 0;
    if(books == 1)
      points = 5;
    if(books == 2)
      points = 15;
    if(books == 3)
      points = 30;
    if(books >= 4)
      points = 60;
    System.out.println("you have earned " +points+ " points.");
  }}