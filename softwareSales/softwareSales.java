import java.util.Scanner;
public class softwareSales{
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
    System.out.println("input number of items bought.");
    int quantity = stdin.nextInt();
    double discount = 0;
    if(quantity >= 10 && quantity < 20)
      discount = .2;
    if(quantity >=20 && quantity < 50)
      discount =.3;
    if(quantity >=50 && quantity < 100)
      discount =.4;
    if(quantity >= 100)
      discount = .5;
    
    double saved = quantity * 99 * discount;
    double cost = quantity * 99 *(1.0-discount);
      System.out.println("you saved " + saved+ "\n your cost is" +cost);
  }
}