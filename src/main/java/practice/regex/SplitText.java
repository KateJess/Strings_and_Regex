package practice.regex;

public class SplitText {

  public static void main(String[] args) {
  }

  public static String splitTextIntoWords(String text) {
    String replacement = text.replaceAll("[\\d;:.,!?]", "");
    String secondPhase = replacement.replaceAll("\s+", "\s");
    return secondPhase.replaceAll("[-\s]", "\n");
  }

}