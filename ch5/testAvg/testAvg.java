import java.util.Scanner;
public class testAvg{
  public static void main(String[] args){
    double[] scores = new double[5];
      Scanner stdin = new Scanner(System.in);
      for(int i = 0; i <4; i++)
    {
      int j=i+1;
    System.out.println("input the test grade of test" +j+" of 5");
    scores[i]=stdin.nextDouble();
    }
      
  }
  public static  double calcAverage(double[] _tests)
  {
    double total = 0;
  for(int i = 0;i < _tests.length;i++)
  {
  total += _tests[i];
  }
  return total/_tests.length;
  } 
  public static char determineGrade(double _score)
  {
  if(_score <60)
  {return 'F';}
  else if(_score <70)
  {return 'D';}
  else if(_score <80)
  {return 'C';}
  else if(_score <90)
  {return 'B';}
  else return 'A';
  }
}