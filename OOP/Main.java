import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Введите координаты точки A(x,y):");
    Scanner sc = new Scanner(System.in);
    System.out.print("x=");
    double x = sc.nextDouble();
    System.out.print("y=");
    double y = sc.nextDouble();
    System.out.println("");
    Point a = new Point (x,y);
    System.out.println("Введите координаты точки B(x,y):");
    System.out.print("x=");
    double x1 = sc.nextDouble();
    System.out.print("y=");
    double y1 = sc.nextDouble();
    System.out.println("");
    Point b = new Point (x1,y1);
    System.out.println("Введите координаты точки C(x,y):");
    System.out.print("x=");
    double x2 = sc.nextDouble();
    System.out.print("y=");
    double y2 = sc.nextDouble();
    System.out.println("");
    Point c = new Point (x2,y2);
    Line A = new Line (a.abscissa (), a.ordinata (), b.abscissa (), b.ordinata ());
    Line B = new Line (b.abscissa (), b.ordinata (), c.abscissa (), c.ordinata ());
    Line C = new Line (c.abscissa (), c.ordinata (), a.abscissa (), a.ordinata ());
    Triangle abc = new Triangle (A.lenght (), B.lenght (), C.lenght ());
    System.out.printf ("Периметр треугольника равен %.3f\n", abc.perimetr ());
    System.out.printf ("Площадь треугольника равна %.3f\n", abc.square ());
    }
}