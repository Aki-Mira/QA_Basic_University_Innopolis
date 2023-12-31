import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 /* 
Задача 4.2
Найти сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a)
  */
    System.out.println("===========");
    System.out.println("Задача 4.2. Найти сумму всех целых чисел от a до b (b>=a)");
    Scanner sc = new Scanner(System.in);
       System.out.println("Введите число a:");
       int a = sc.nextInt();
       System.out.println("Введите число b:");
       int b = sc.nextInt(); 
       if (b>=a)
         {
           int sum = 0;
           for (int i = a; i <= b; i++)
             {
               sum = sum + i;
             }
           System.out.printf("Сумма всех целых чисел в диапазоне %d - %d равна %d\n", a, b, sum);
         }
      else 
         {
           System.out.printf("Значение b (%d) должно быть больше a (%d)\n", b, a);
         }
/* 
Задача 6
Последовательность Фибоначчи образуется так: первый и второй члены
последовательности равны 1, каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5, 8, 13, ...). Дано натуральное число n. 
1. Найти k-й член последовательности Фибоначчи. 
2. Получить первые n членов последовательности Фибоначчи. 
3. Верно ли, что сумма первых n членов последовательности Фибоначчи есть четное число?
  */
    System.out.println("===========");
    System.out.println("Задача 6. Дана последовательность Фибоначчи. Дано натуральное число n.\n  1. Найти n-й член последовательности Фибоначчи.\n  2. Получить первые n членов последовательности Фибоначчи.\n  3. Верно ли, что сумма первых n членов последовательности Фибоначчи есть четное число?");
    System.out.println("Введите число n:");
       int n = sc.nextInt();
       long [] f = new long [n];
       f[1] = 1;
       for (int j = 2; j < n; j++)
         {           
           f[j] = f[j-1]+f[j-2];
         }
    System.out.printf("1. %d-й член последовательности Фиббоначи равен %d\n", n, f[n-1]);
    System.out.println("2. Первые n членов последовательности Фибоначчи следующие:");
      for (int k = 0; k < n; k++)
        {
          System.out.println(f[k]);
        }
      long sum1 = 0;
      for (int l = 0; l < n; l++)
        {
          sum1 = sum1 + f[l];
        }
      long s = sum1%2;
      if (s == 0)
        System.out.printf("3. Cумма первых n членов последовательности Фибоначчи есть четное число\n");
      else
        System.out.printf("3. Cумма первых n членов последовательности Фибоначчи НЕчетное число\n");
/*
Задача 8.
Дано натуральное число. Определить: 
1. количество цифр 3 в нем; 
2. сколько раз в нем встречается последняя цифра; 
3. количество четных цифр в нем;
4. сумму его цифр, больших пяти; 
5. произведение его цифр, больших семи; 
6. сколько раз в нем встречаются цифры 0 и 5 (всего).
*/
    System.out.println("===========");
    System.out.println("Задача 8. Дано натуральное число. Определить:\n1. количество цифр 3 в нем;\n2. сколько раз в нем встречается последняя цифра;\n3. количество четных цифр в нем;\n4. сумму его цифр, больших пяти;\n5. произведение его цифр, больших семи;\n6. сколько раз в нем встречаются цифры 0 и 5 (всего).");
    System.out.println("Введите натуральное число:");
       int m = sc.nextInt();
    int m1 = m;
    int count1 = 0;
    while (m1 != 0)
      {
        if (m1%10 == 3)
        {
          count1++;
        }
        m1=m1/10; 
      }
      System.out.printf("1. Количество цифр 3 в числе равно %d;\n", count1);
    int m2 = m;
    int count2 = 0;
    int last2 = m2%10;
    while (m2 != 0)
      {
        if (m2%10 == last2)
        {
          count2++;
        }
        m2=m2/10;
      }
    System.out.printf("2. Последняя цифра встречается в числе %d раз(а);\n", count2);
    int m3 = m;
    int count3 = 0;
    while (m3 != 0)
      {
        int last = m3%10;
        if (last%2 == 0)
        {
          count3++;
        }
        m3 = m3/10;
      }
    System.out.printf("3. Количество четных цифр в числе равно %d;\n", count3);
    int m4 = m;
    int sum = 0;
    while (m4 != 0)
      {
        if (m4%10 > 5)
        {
          sum = sum + m4%10;
        }
        m4 = m4/10;
      }
    System.out.printf("4. Сумма цифр числа больших 5 равна %d;\n", sum);
    int m5 = m;
    int prd = 1;
    while (m5 !=0)
      {
        if (m5%10 > 7)
        {
          prd = prd * (m5%10);
        }
        m5 = m5/10;
      } 
    if (prd < 8)
    {
      System.out.println("5. Число не содержит цифр больше 7;");
    }
    else
    {
      System.out.printf("5. Произведение цифр, больших 7 равно %d;\n", prd);
    }
    int m6 = m;
    int count4 = 0;
    while (m6 != 0)
      {
        if ((m6%10 == 0) || (m6%10 == 5))
          {
           count4++;
          }
        m6 = m6/10;
      }
    System.out.printf("6. Цифры 0 и 5 (всего) встречаются в числе %d раз(а);\n", count4);
/*
Задача №9
Имеется фрагмент программы в виде оператора цикла с параметром, обеспечивающий
вывод на экран "столбиком" всех целых чисел от 10 до 30. Оформить этот фрагмент в виде: 
1. оператора цикла с предусловием; 
2. оператора цикла с постусловием.
*/
    int p = 10;
    System.out.println("===========");
    System.out.println("Задача №9. Имеется фрагмент программы в виде оператора цикла с параметром, обеспечивающий вывод на экран столбиком всех целых чисел от 10 до 30. Оформить этот фрагмент в виде:");
    System.out.println("1. оператора цикла с предусловием:");
      while (p <= 30)
      {
        System.out.println(p);
        p++;
      }
    System.out.println("2. оператора цикла с постусловием:");
    int z = 10;
    do 
      {
        System.out.println(z);
        z++;
      }
    while (z<=30);
  /*
Задача №10
Дано натуральное число. 
1. Определить его максимальную цифру
2. Определить его минимальную цифру
*/
    System.out.println("===========");
    System.out.println("Задача №10. Дано натуральное число.\n1. Определить его максимальную цифру\n2. Определить его минимальную цифру");
    System.out.println("Введите натуральное число:");
  int v = sc.nextInt();
  int v1 = v;
  int max=v1%10;
  while (v1 != 0)
    {
      v1 = v1/10;
      if(v1%10 > max)
      {
        max = v1%10;
      }
    } 
    System.out.printf("1. Максимальная цифра числа %d равна %d;\n", v, max);
  int v2 = v;
  int min = v2%10;
  while (v2 != 0)
    {
      v2 = v2/10;
      if((v2%10 < min)&&(v2 != 0))
      {
        min = v2%10;
      }
    }
    System.out.printf("2. Минимальная цифра числа %d равна %d.\n", v, min);
/*
Задача №12
Гражданин 1 марта открыл счет в банке, вложив 1000 руб. Через каждый месяц размер
вклада увеличивается на 2% от имеющейся суммы. Определить:
1. за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
2. через сколько месяцев размер вклада превысит 1200 руб.
*/
  System.out.println("===========");
  System.out.println("Задача №12. Гражданин 1 марта открыл счет в банке, вложив 1000 руб. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:\n1. за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;\n2. через сколько месяцев размер вклада превысит 1200 руб.");
    double deposit = 1000;
    double deposit1 = deposit;
    int count7 = 0;
    double cash1 = (deposit1/100)*2;
    while (cash1 <=30)
      {  
      deposit1 = deposit1 + cash1;
      count7++;
      cash1 = (deposit1/100)*2;
      }
  System.out.println("===========");
  System.out.printf("1. Через %d месяц(ев) величина ежемесячного увеличения вклада превысит 30 руб.\n", count7);
    double deposit2 = deposit;
    double cash2 = (deposit2/100)*2;
    int count8 = 0;
    while (deposit2 <= 1200)
      {
      deposit2 = deposit2 + cash2;
      count8++;
      cash2 = (deposit2/100)*2; 
      } 
    System.out.printf("2. Через %d месяц(ев) размер вклада превысит 1200 руб.\n", count8);
/* 1.1 Составить программу вывода любого числа любое заданное число раз */
    System.out.println("===========");
    System.out.println("1.1 Составить программу вывода любого числа любое заданное число раз");
    System.out.println("Введите любое число:");
    double ch = sc.nextDouble();
    System.out.println("Введите сколько раз его вывести:");
    int count9 = sc.nextInt();
    for (int y = 1; y <= count9; y++)
      {
       System.out.println(ch); 
      }
/*
2. Напечатать числа следующим образом:
25 25.5 24.8
26 26.5 25.8
…
35 35.5 34.8
*/
   System.out.println("===========");
   System.out.println("1.2 Напечатать числа следующим образом:\n25 25.5 24.8\n26 26.5 25.8\n…\n35 35.5 34.8"); 
   System.out.println("===========");
   for (int q = 25; q <= 35; q++)
     {
       System.out.printf("%d %d.5 %d.8\n", q, q, q-1);
     }
/*
3. Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для
значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
*/
   System.out.println("===========");
   System.out.println("1.3 Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).");  
   for (double lb = 1; lb <= 10; lb++)
     {
       System.out.printf("%.0f фунт(ов) равен %.3f килограмм\n", lb, (lb*453)/1000);
     }
/*
4. Вычислить сумму 1+1/2+1/3+...+1/n
*/
   System.out.println("===========");
   System.out.println("1.4 4. Вычислить сумму 1+1/2+1/3+...+1/nn"); 
   System.out.println("Введите натуральное число nn:");
   int nn = sc.nextInt();
   double ss = 0;
    for (double bb = 1; bb <= nn; bb++)
     {
       ss = ss + 1/bb;
     }
    System.out.printf("Сумма 1+1/2+1/3+...+1/nn равна %.3f\n", ss);
}
}