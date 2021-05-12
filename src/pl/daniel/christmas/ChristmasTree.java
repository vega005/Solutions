package pl.daniel.christmas;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
  public static void main(String[] args) {
    System.out.println(getChristmasTree(6));
    // getChristmasTree(6);
  }

  public static List<String> getChristmasTree(int size) {
    if (size <= 0) {
      throw new IllegalArgumentException("Size cannot be equal or less than zero");
    }
    List<String> result = new ArrayList<>();
    StringBuilder line = new StringBuilder();
    for (int i = 1; i <= size; i++) {
      for (int k = 1; k <= size - i; k++) {
        line.append(" ");
      }
      for (int j = 1; j <= i * 2 - 1; j++) {
        line.append("*");
      }
      result.add(line.toString());
      line.delete(0, line.length());
      System.out.println();
    }
    for (int u = 1; u <= size - 2; u++) {
      line.append(" ");
    }
    line.append("**");
    result.add(line.toString());
    line.delete(0, line.length());
    return result;
  }
}
