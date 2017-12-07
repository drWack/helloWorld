import java.util.Scanner;
import java.io.*;
public class letterCounter{
public static void main(String[] args){
  Scanner stdin = new Scanner(System.in);
  System.out.println("input filename to count (include extension)");
  Scanner input = new Scanner(stdin.next());
  int count = 0;
  while(input.hasNext())
  {
    String curr = input.next();
  count+= curr.length();
  }
  System.out.println("the file had a length of "+ count);
}}