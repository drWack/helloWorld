import java.util.Scanner;
import java.io.*;
public class convertToUpper{
public static void main(String[] args)throws IOException
{
  Scanner stdin = new Scanner(System.in);
  System.out.println("input filename to convert(include extension)");
  File fileName = new File(stdin.next());
  Scanner input = new Scanner(fileName);
  System.out.println("input filename to write to(include extension)");
  PrintWriter output = new PrintWriter(stdin.next());
  while(input.hasNext())
  {
    String curr = input.next();
  output.print(curr.toUpperCase());
  
  }
  output.close();
}}