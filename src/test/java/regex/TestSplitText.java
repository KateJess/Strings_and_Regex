package regex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice.regex.SplitText;

@DisplayName("Разбивка текста")
public class TestSplitText {

  public static final String EMPTY_STRING = "";

  @Test
  @DisplayName("Текст из файла InputText")
  void splitText() throws IOException, URISyntaxException {
    String text = getText("/src/test/resources/InputText.txt", " ");
    String expectedResult = getText("/src/test/resources/Result.txt", System.lineSeparator());
    String actualResult = SplitText.splitTextIntoWords(text)
            .replaceAll("\r", "")
            .replaceAll("\n", System.lineSeparator());
    assertEquals(expectedResult, actualResult);
  }

  @Test
  @DisplayName("Пустая строка")
  void emptyString() {
    String actualResult = SplitText.splitTextIntoWords(EMPTY_STRING);
    assertEquals(EMPTY_STRING, actualResult);
  }


  private String getText(String file, String delimiter) throws IOException, URISyntaxException {
    URL resource = this.getClass().getResource(file);
    return String.join(delimiter, Files.readAllLines(Paths.get(resource.toURI())));
  }

}