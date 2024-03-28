package practice.regex;

import java.util.Scanner;

public class TotalEarningsCalculatorRegex {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.println(calculateSalarySum(input));
  }

  public static int calculateSalarySum(String text){
    int sum = 0;
    String regex = "[^\\d\s]";
    String earnings = text.replaceAll(regex, "").trim();

    if(!earnings.isBlank()) {
      String[] stringArray = earnings.split("\s+");
      int[] numberArray = new int[stringArray.length];

      for (int i = 0; i < stringArray.length; i++) {
        numberArray[i] = Integer.parseInt(stringArray[i]);
        sum += numberArray[i];
      }
    }
    return sum;
  }
}