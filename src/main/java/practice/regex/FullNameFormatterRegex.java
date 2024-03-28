package practice.regex;

import java.util.Scanner;

public class FullNameFormatterRegex {

  public static final String LETTERS = "[АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя-]";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.matches(LETTERS + "+\s+" + LETTERS + "+\s+" + LETTERS + "+")) {
        String surname = input.substring(0, input.indexOf("\s")).trim();
        String name = input.substring(input.indexOf("\s"), input.lastIndexOf("\s")).trim();
        String middleName = input.substring(input.lastIndexOf("\s")).trim();

        String template = "Фамилия: %s%nИмя: %s%nОтчество: %s";

        System.out.printf(template, surname, name, middleName);

      } else {
        System.out.println("Введенная строка не является ФИО");

      }
      scanner.close();
      break;
    }
  }
}