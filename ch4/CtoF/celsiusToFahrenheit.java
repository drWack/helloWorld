public class celsiusToFahrenheit{
  public static void main(String[] args){
    double Fahr = 0;
    System.out.println("Celsuis       Fahrenheit");
  for(double c = 0; c < 20; c++)
  {
   Fahr = c*((double)9/5) + 32;
   System.out.println(c + "          "+Fahr);
  }
  }}