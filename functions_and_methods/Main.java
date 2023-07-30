import java.util.Scanner;
class Main {
  public static int min(int a, int b) 
    {
        if(a < b)
            return a;
        else
            return b;
    }
  public static int min(int a, int b, int c)
    {
        return min(min(a, b), c);
    }
  public static int min(int a, int b, int c, int d)
    {
        return min(min(a, b), min(c, d));
    }
  public static void print(int a)
    {
      for (int i = 1; i <= a; i++)
        {
          System.out.print("*");
        }
      System.out.println();
    }
  public static boolean isTriangle(double a, double b, double c)
    {
        if((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0))
            return true;
        else
            return false;
    }
  public static double perimetr(double a, double b, double c)
    {
        if(isTriangle(a, b, c) == true)
            return a + b + c;
        else
            return 0;
    }    
    public static double square(double a, double b, double c)
    {
        if(isTriangle(a, b, c) == true)
        {
            double p = perimetr(a, b, c) / 2;
            
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        else
            return 0;
    }
  public static void main(String[] args) {
 /* 
Задача №6
Реализовать функцию нахождения минимума:
1. Из трёх чисел
2. Из четырёх чисел
*/
    Scanner sc = new Scanner(System.in);
    System.out.println("===========");
    System.out.println("Задача 6 Реализовать функцию нахождения минимума:\n 1. Из трех чисел:");
    System.out.println("Введите число a:");
    int a = sc.nextInt();
    System.out.println("Введите число b:");
    int b = sc.nextInt();
    System.out.println("Введите число c:");
    int c = sc.nextInt();
    System.out.printf("Наименьшее число из 3х чисел равно %d\n", min(a, b, c));
    System.out.println("2. Из четырех чисел:");
    System.out.println("Введите число d:");
    int d = sc.nextInt();
    System.out.printf("Наименьшее число из 4х чисел равно %d\n", min(a, b, c, d));
/* 
1. Составить процедуру, "рисующую" на экране горизонтальную линию из 10 символов "*"
*/
    System.out.println("===========");
    System.out.println("1. Составить процедуру, рисующую на экране горизонтальную линию из 10 символов *");
    for (int i = 1; i <= 10; i++)
      {
        System.out.print("*");
      }
    System.out.println();
/*
2. Составить процедуру, "рисующую" на экране горизонтальную линию из любого числа
символов "*"
*/
    System.out.println("===========");
    System.out.println("2. Составить процедуру, рисующую на экране горизонтальную линию из любого числа символов *");
    System.out.println("Введите число символов *:");
    int count = sc.nextInt();
    print(count);    
/*
3. Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей. 
(Определить процедуру для расчета периметра и площади треугольника по его
сторонам.)
*/
    System.out.println("===========");
    System.out.println("3. Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей. (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)");
    System.out.println("Введите длину сторон треугольника 1:");
    System.out.println("a1");
    double a1 = sc.nextDouble();
    System.out.println("b1");
    double b1 = sc.nextDouble();
    System.out.println("c1");
    double c1 = sc.nextDouble();
    System.out.println("Введите длину сторон треугольника 2:");
    System.out.println("a2");
    double a2 = sc.nextDouble();
    System.out.println("b2");
    double b2 = sc.nextDouble();
    System.out.println("c2");
    double c2 = sc.nextDouble();
    if (!isTriangle(a1, b1, c1) || !isTriangle(a2, b2, c2))
      {
        System.out.println("Один из треугольников задан неверно, измените длины сторон и попробуйте снова");
      }
    else
      {
        System.out.printf("Сумма периметров треугольников 1 и 2 равна %.1f, сумма площадей треугольников 1 и 2 равна %.1f\n", perimetr(a1,b1,c1)+perimetr(a2, b2, c2), square(a1, b1, c1)+square(a2, b2, c2));
      }
/*
4. Напечатать числа в виде следующей таблицы:
1 2 ... 10
1 2 ... 10
1 2 ... 10
1 2 ... 10
*/
    System.out.println("===========");
    System.out.println("34. Напечатать числа в виде следующей таблицы:\n1 2 ... 10\n1 2 ... 10\n1 2 ... 10\n1 2 ... 10");
    System.out.println("===========");
    for (int j = 1; j <= 4; j++)
      {
        System.out.println("1 2 3 4 5 6 7 8 9 10");
      }
    }
}