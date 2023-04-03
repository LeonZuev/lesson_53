package hw53;

import cw53.Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Получите от пользователя радиус окружности.
По введённым координатам точки определите,
попадает ли она внутрь, на границу или вне окружности с
указанным радиусом и центром в точке O (0, 0).
x^2 + y^2 < r^2 - внутрь
x^2 + y^2 = r^2 - на границу
 */

public class TargetPointCircle {


  public static String targetCircle(Point point) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int x = point.getX();
    int y = point.getY();
    System.out.println("Введите радиус границы заграницы");
    int r = Integer.parseInt(bufferedReader.readLine());
    ;

    if (x * x + y * y < r * r) {
      return "Точка внутри окружности";
    }
    else if (x * x + y * y == r * r) {
      return "Точка на границе окружности";
    }
    else {
      return "Точка за границей, там тепло";
    }
  }
}

