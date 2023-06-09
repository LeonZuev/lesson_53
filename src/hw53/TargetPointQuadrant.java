package hw53;

import cw53.Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
По введённым координатам точки определите,
в какой координатной четверти (или на какой оси) она находится.

Четверти нумеруются следующим образом:

     y
     ^
 II  |  I
------------> x
 III |  IV
     |

I  : x > 0 && y > 0
II : x < 0 && y > 0
III: x < 0 && y < 0
IV : x > 0 && y < 0

 */

public class TargetPointQuadrant {

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Point point = null;
    try {
      point = Point.read(bufferedReader);
      System.out.println(targetQuadrant(point));
    } catch (IOException e) {
      System.out.println("Ошибка: некорректный ввод" + e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("Ошибка: некорректное число");
    }
    System.out.println("Проверить положение точки относительно окружности? [y/n]");
    String checkCircleTarget = bufferedReader.readLine();
    if (checkCircleTarget.equalsIgnoreCase("y") && point != null) {
      String circleTargetResult = TargetPointCircle.targetCircle(point);
      System.out.println(circleTargetResult);//ла-ла-ла =))))
    }
  }

  public static String targetQuadrant(Point point) {
    int x = point.getX();
    int y = point.getY();

    if (x > 0 && y > 0) {
      return "Точка в четверти I";
    }
    else if (x < 0 && y > 0) {
      return "Точка в четверти II";
    }
    else if (x < 0 && y < 0) {
      return "Точка в четверти III";
    }
    else if (x > 0 && y < 0) {
      return "Точка в четверти IV";
    }
    else if (x == 0 && y != 0) {
      return "Точка на оси [Y]";
    }
    else if (x != 0 && y == 0) {
      return "Точка на оси [X]";
    }
    else {
      return "Точка ровна [0]";
    }
  }
}
