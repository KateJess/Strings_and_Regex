package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      String output = "";
      String regex = "\\D";
      String pureString = input.replaceAll(regex, "");

      if (pureString.length() == 10 && pureString.charAt(0) == '9') {
        output += "7" + pureString;
        System.out.println(output);
        scanner.close();
        break;
      } else if(pureString.length() == 11 && pureString.charAt(0) == '8') {
        output = pureString.replaceFirst("8", "7");
        System.out.println(output);
        scanner.close();
        break;
      }
      else if(pureString.length() == 11 && pureString.charAt(0) == '7') {
        output = pureString;
        System.out.println(output);
        scanner.close();
        break;
      } else {
        System.out.println("Неверный формат номера");
        scanner.close();
        break;
      }
    }
  }

}
