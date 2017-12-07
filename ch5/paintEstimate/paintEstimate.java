import java.util.Scanner;
public class paintEstimate{
  public static void main(String []args){
    Scanner stdin = new Scanner(System.in);
    System.out.println("input number of rooms");
    int rooms = stdin.nextInt();
    System.out.println("input squarefootage per room");
    int footage = stdin.nextInt();
    int[] answers = info(rooms,footage);
    System.out.println("for " + rooms+" rooms of "+footage+", it will take \n"+answers[0]+" gallons of paint \n"+answers[1]+
    " hours of labour\n it will cost" +answers[2]+" for the paint and "+answers[3]+" for the labour, for a total of"
                      +answers[4]+""); 
    //i could have done this with like 5 methods but this was easier, but i should have used an enum
  }
  public static int[] info(int _rooms, int _footagePer)
  {
  int[] answerArray = new int[5];
  int paintCost = 10;
  answerArray[0] = _rooms*_footagePer/115;// number of gallons needed
  answerArray[1] = answerArray[0]*8; //number of hours require
  answerArray[2] = answerArray[0]*paintCost;// cost of paint, problem doesnt give a cost for paint, i pick 10$
  answerArray[3] = answerArray[1]*18; //cost of labour, 18 dollars per hour
  answerArray[4] = answerArray[3] + answerArray[2];// total cost=cost of labor + cost of paint
    return answerArray;
  }

}