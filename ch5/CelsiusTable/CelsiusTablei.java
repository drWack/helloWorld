public class CelsiusTable{
  public static void main(String[] args){
    System.out.println("Fahrenheit            Celsius");
    for(double F = 0; F <20;F++){
      System.out.println(F +"              " +celsius(F));
    }
     
  }
  public static double celsuis(double _fahrenheit){
    return (_fahrenheit -32)*5/9;
  
  }
}