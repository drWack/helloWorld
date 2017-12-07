import java.util.Scanner;
public class speedOfSound{
  public static void main(String []args){
 Scanner stdin = new Scanner(System.in);
 System.out.println("what material are we transmitting through?");
 String material = stdin.next();
 System.out.println("how far is it going to go? (ft)");
 int distance = stdin.nextInt();
 double time =0;
 switch(material){
    case "Air":
   time = distance/1100;
   break;
    case "Water":
   time = distance/4900;
   break;
    case "Steel":
      time = distance/16400;
      break;
    default:
      System.out.println("invalid material. (try capitalizing the first letter");
      break;
 }
    System.out.println("it will take " +time+ " seconds to pass that distance in " +material);
  }}