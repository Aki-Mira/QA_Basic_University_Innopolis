package logical_mathematical_and_conditional_operators;
class Main {
  public static void main(String[] args) {
/* 
Задача 2.
Известно значение температуры по шкале Цельсия 36,6. Найти соответствующее значение
температуры по шкале:
1. Фаренгейта;
2. Кельвина. 
*/
    System.out.println("");
    System.out.println("Задача 2.");
      double x = 36.6;
      System.out.printf("Температура равна %.1f\u00B0C или %.1f\u00B0F или %.1fK\n", x, x*1.8+32, x+273.15);
/*
Задача 4.
Известны площади круга и квадрата. Определить:
1. уместится ли круг в квадрате?
2. уместится ли квадрат в круге?
*/
    System.out.println("");
    System.out.println("Задача 4.");
      double Sсi = 120;
      double Ssq = 36;
      double a = Math.sqrt(Ssq);
      double d = 2*Math.sqrt(Sсi/Math.PI);
      double di = a*Math.sqrt(2);
      boolean y = (d<=a);
      boolean z = (di<=d);
      System.out.print("1. ");
      if (y)
        {
          System.out.printf("Круг площадью %.1f см\u00B2 уместится в квадрате площадью %.1f см\u00B2\n", Sсi, Ssq);
        }
      else
        {
          System.out.printf("Круг площадью %.1f см\u00B2 НЕ уместится в квадрате площадью %.1f см\u00B2\n", Sсi, Ssq);
        }
      System.out.print("2. ");
      if (z)
        {
          System.out.printf("Квадрат площадью %.1f см\u00B2 уместится в круге площадью %.1f см\u00B2\n", Ssq, Sсi);
        }
      else
        {
          System.out.printf("Квадрат площадью %.1f см\u00B2 НЕ уместится в круге площадью %.1f см\u00B2\n", Ssq, Sсi);
        }
/*Задача 1.1. 
В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1.
Известно количество очков, полученных командой за игру. Определить словесный результат игры (выигрыш, проигрыш или ничья).
*/
      System.out.println("");
      System.out.println("Задача 1.1.");
        int k = 1;
        switch (k)
          {
            case 0:
              System.out.println("Команда проиграла, так как получила 0 очков");
              break;
            case 1:
              System.out.println("Команда сыграла вничью, так как получила 1 очко");
              break;
            case 3:
              System.out.println("Команда выграла, так как получила 3 очка");
              break;
          }
/*Задача 1.2.
Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
*/
      System.out.println("");
      System.out.println("Задача 1.2.");
      double r1 = 5.641895835477563;
      double a1 = 10;
      double Sci1 = Math.ceil(Math.PI*Math.pow(r1,2));
      double Ssq1 = Math.ceil(Math.pow(a1,2));
      boolean l = (Sci1<Ssq1);
      boolean m = (Sci1>Ssq1);
      if(l)
        {
            System.out.println("Площадь квадрата больше");
        }
      else
        {
        if (m)
          {
            System.out.println("Площадь круга больше");
          }
          else
          {
            System.out.println("Площади фигур равны");
          }
        }
/*Задача 1.3.
Дано двузначное число. Определить, является ли сумма его цифр двузначным числом
*/
      System.out.println("");  
      System.out.println("Задача 1.3."); 
      int o = 18;
      boolean p = ((o/10+o%10)>=10);//так как сумма чисел самого большого двузначного числа "99" равна 18 нет необходимости добавлять условие <=99
      if(p)
        {
          System.out.printf("Сумма цифр числа %d равна %d и является двузначным числом\n", o, o/10+o%10);
        }
      else
        {
          System.out.printf("Сумма цифр числа %d равна %d и НЕ является двузначным числом\n", o, o/10+o%10);
        }
/*Задача 1.4.
Даны три вещественных числа r, s и t. Определить, какая из сумм цифр этих чисел наибольшая. (числа целые, трехзначные)
*/
      System.out.println("");
      System.out.println("Задача 1.4.");  
      int v=999, s=875, t=111;
      double v1=v/100+(v/10)%10+v%10;
      double s1=s/100+(s/10)%10+s%10;
      double t1=t/100+(t/10)%10+t%10;
      System.out.printf("Сумма цифр числа %d равна %.0f, cумма цифр числа %d равна %.0f, cумма цифр числа %d равна %.0f. ", v, v1, s, s1, t, t1);
      double max = v1;
      if (s1>max)
        {
          max = s1;
        }
      else
        if (t1>max)
          {
            max = t1;
          }
      System.out.printf("%.0f является наибольшей суммой цифр\n", max);
/*Задача 1.5.
Даны два числа. Если квадратный корень из второго числа меньше первого числа, то увеличить второе число в пять раз.
*/
      System.out.println("");
      System.out.println("Задача 1.5.");
      int first = 55;
      int second = 144;
      boolean comp = (Math.sqrt(second)<first);
      if (comp)
        {
          int second1 = second*5;
          System.out.printf("Квадратный корень из числа %d меньше числа %d, значит второе число увеличивается в 5 раз и становится равно %d", second, first, second1);
        }
      else 
        {
          System.out.printf("Квадратный корень из числа %d больше числа %d, значит второе число остается неизменным", second, first);
        }
  }
}