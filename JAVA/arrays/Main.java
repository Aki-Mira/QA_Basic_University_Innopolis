import java.util.Random;
import java.util.Scanner;
class Main {
  public static double NextDouble (double max, double min)
        {
          Random r = new Random();
            return min + r.nextDouble() * (max - min);
       }
 
        public static double NextDouble (double max)
        {
          Random r = new Random();
            return r.nextDouble() * max;  
        }
  public static double[] generateArray()
    {
      double[] array = new double[10];
      System.out.print("Дан случайный массив [ ");
      for(int i = 0; i < array.length; i++)
      {
        array[i] = NextDouble (-20, 20);
        System.out.print(array[i] + " ");
      }
      System.out.print("]");
      return array;
      }
  public static double[] generate12Array()
    {
      double[] array = new double[12];
      System.out.print("Дан массив из 12 последовательных элементов: [ ");
      for(int i = 0; i < array.length; i++)
      {
        array[i] = i + 1;
        System.out.print(array[i] + " ");
      }
      System.out.print("]");
      return array;
      }
  public static double[] generateВackArray(double array[])
    {
      System.out.print("Обратный массив выглядит следующим образом: [ ");
      for(int i = 0; i < array.length; i++)
      {
        double[] temp = new double[array.length];
        temp[i] = array[(array.length-1)-i];
        System.out.print(temp[i] + " ");
      }
      System.out.print("]");
      return array;
      }
   public static double[][] generateDoubleArray()
    {
      double[][] array2 = new double[5][5];
      Random r = new Random();   
      System.out.println("Дан случайный двумерный массив:");
      for(int i = 0; i < array2.length; i++)
      {
        for (int j = 0; j < array2[i].length; j++)
          {
        array2[i][j] = NextDouble (-20, 20);;
        System.out.print(array2[i][j] + "\t");
      }
        System.out.println("");
      }
      return array2;
      }
  public static double[][] generateNewDoubleArray(int n,int m)
    {
      Scanner s = new Scanner(System.in);
      double[][] array3 = new double[n][m];  
      System.out.println("");
      System.out.println("Дан пустой двумерный массив, заполните данный массив вручную:");
      for(int i = 0; i < array3.length; i++)
      {
        for (int j = 0; j < array3[i].length; j++)
          {
        System.out.print(array3[i][j] + "\t");
      }
        System.out.println("");
      }
      for(int i = 0; i < array3.length; i++)
      {
        for (int j = 0; j < array3[i].length; j++)
          {
        System.out.println("");
        System.out.printf("Введите элемент массива с индексом [%d][%d]:", i, j);
        array3[i][j] = s.nextDouble();
      }
      }
      System.out.println("");
      System.out.println("Ваш массив следующий:");
      for(int i = 0; i < array3.length; i++)
      {
        for (int j = 0; j < array3[i].length; j++)
          {
        System.out.print(array3[i][j] + "\t");
      }
        System.out.println("");
      }
      return array3;
      }
  public static double minLineArray (double[][] array, int a ){
    double min = array[a][0];
    for (int p = 0; p < array[a].length; p++) {
        if (array[a][p] < min){
          min = array[a][p];
        }
      }
    return min;
  }
  public static double maxColumnArray (double[][] array, int a ){
    double max = array[0][a];
    for (int p = 0; p < array[0].length; p++) {
        if (array[p][a] > max){
          max = array[p][a];
        }
      }
    return max;
  }
  public static void printPositiveArray (double[] ar) {
    System.out.print("[ ");
    for (int j = 0; j < ar.length; j++) {
      if (ar[j] >= 0) {
        System.out.print(ar[j] + " ");
      }
    }
    System.out.print("]");
  }
  public static void printNegativeArray (double[] ar) {
    System.out.print("[ ");
    for (int j = 0; j < ar.length; j++) {
      if (ar[j] < 0) {
        System.out.print(ar[j] + " ");
      }
    }
    System.out.print("]");
  }
  public static void print100Array (double[] arr) {
    System.out.print("[ ");
    for (int k = 0; k < arr.length; k++) {
      if (arr[k] < 100) {
        System.out.print(arr[k] + " ");
      }
    }
    System.out.print("]");
  }
  public static double summArray (double[] array) {
    double summ = 0;
    for (int k = 0; k < array.length; k++) {
        summ = summ + array[k];
    }
    System.out.println(summ);
    return summ;
    }
  public static double summ6Array (double[] array) {
    double summ = 0;
    for (int k = 0; k < 6; k++) {
        summ = summ + array[k];
    }
    System.out.println(summ);
    return summ;
    }
  public static double summPowArray (double[] array) {
    double summ = 0;
    for (int k = 0; k < array.length; k++) {
        summ = summ + Math.pow(array[k],2);
    }
    System.out.println(summ);
    return summ;
    }
  public static double compArray (double[] array) {
    double comp = 1;
    for (int k = 0; k < array.length; k++) {
        comp = comp * array[k];
    }
    System.out.println(comp);
    return comp;
    }
  public static double minArray (double[] array) {
    double min = array[0];
    for (int k = 0; k < array.length; k++) {
      if(array[k] < min) {
        min = array[k];
        }
    }
    return min;
    }
  public static double maxArray (double[] array) {
    double max = array[0];
    for (int k = 0; k < array.length; k++) {
      if(array[k] > max) {
        max = array[k];
        }
    }
    return max;
    }
  public static int howManyArray (double[] array, double a) {
    int count = 0;
    for (int k = 0; k < array.length; k++) {
      if(a ==  array[k]) {
        count++;
        }
    }
    return count;
    }
  public static void main(String[] args) {
/*
Задача 3. Дан массив. Составить программу: 
1. расчета квадратного корня из любого элемента массива; 
2. расчета среднего арифметического двух любых элементов массива
Предусмотреть возможность ошибочных обращений вне границ массива
*/
    System.out.println("Задача 3");
    System.out.println("===========");
    double[] Array = generateArray (); 
    System.out.println("");
    Scanner s = new Scanner(System.in);
    System.out.print("1. Введите порядковый номер элемента массива, из которого необходимо извлечь квадратный корень: ");
    try {
    int a = s.nextInt();
      if (Array[a-1]>=0){
    double a1 = Math.sqrt(Array[a-1]);
    System.out.printf("Квадратный корень из %.1f равен %.3f\n", Array[a-1], a1);
        }
      else {
        System.out.printf("Квадратный корень из отрицательного числа %.1f нельзя извлечь\n", Array[a-1]);
      }
    System.out.println("");
    System.out.println("2. Введите порядковые номера двух элементов массива, для которых необходимо рассчитать среднее арифметическое:");
    System.out.print("первый номер: ");
    int b = s.nextInt();
    System.out.print("второй номер: ");
    int b1 = s.nextInt();
    double b2 = ((Array[b-1]+Array[b1-1])/2);
    System.out.printf("Среднее арифметическое чисел %.1f и %.1f равно %.3f\n", Array[b-1], Array[b1-1], b2);
/*
Задача №5
Дан массив. Напечатать: 
1. все неотрицательные элементы
2. все элементы, не превышающие число 100
*/
    System.out.println("");
    System.out.println("Задача 5");
    System.out.println("===========");
    System.out.println("1. Напечатайте все неотрицательные элементы массива:");
    printPositiveArray (Array);
    System.out.println("");
    System.out.println("");
    System.out.println("2. Напечатайте все элементы, не превышающие число 100:");
    print100Array (Array);
/*
Задача №8
Дан двумерный массив. 
1. Вывести на экран элемент, расположенный в правом верхнем углу массива
2. Вывести на экран элемент, расположенный в левом нижнем углу массива
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 8");
    System.out.println("===========");
    double[][] array2 = generateDoubleArray();
    System.out.println("1. Вывести на экран элемент, расположенный в правом верхнем углу массива:");
    System.out.println(array2[0][4]);
    System.out.println("2. Вывести на экран элемент, расположенный в левом нижнем углу массива:");
    System.out.println(array2[4][0]);
/*
Задача №9
Дан двумерный массив из m строк и n столбцов. 
Заполнить его значениями, вводимыми с консоли. 
Заполнение проводить по строкам, начиная с первой (а в ней — начиная с первого
элемента).
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 9");
    System.out.println("===========");
    System.out.println("1. Введите количество строк и столбцов массива:");
    System.out.print("Количество строк:");
    int n = s.nextInt();
    System.out.print("Количество столбцов:");
    int m = s.nextInt();
    double Array3[][] = generateNewDoubleArray(n, m);
/*
Задача №10
Дан двумерный массив. Определить: 
1. сумму всех элементов третьей строки массива
2. сумму всех элементов второго столбца массива
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 10");
    System.out.println("===========");
    double[][] Array4 = generateDoubleArray();
    double summ = 0;
    System.out.println("");
    System.out.print("1. Сумма всех элементов третей строки равна: ");
      for (int p = 0; p < Array4[2].length; p++) {
        summ = summ + Array4[2][p];
      }
    System.out.println(summ);
    System.out.println("");
    System.out.print("2. Сумма всех элементов второго столбца равна: ");
    double summ1 = 0;
     for (int l = 0; l < Array4.length; l++) {
        summ1 = summ1 + Array4[l][1];
       
      }
    System.out.println(summ1);
/*
1. Заполнить массив из двенадцати элементов 1, 2, ... 12
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 1.1");
    System.out.println("===========");
    generate12Array();
/*
2. Вывести элементы массива на экран в обратном порядке
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 1.2");
    System.out.println("===========");
    double Array5[] = generate12Array();
    System.out.println("");
    System.out.println("");
    generateВackArray(Array5);
/*
3. Определить: 
1. сумму всех элементов массива; 
2. произведение всех элементов массива; 
3. сумму квадратов всех элементов массива;
4. сумму шести первых элементов массива
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 1.3");
    System.out.println("===========");
    double Array6[] = generateArray();
    System.out.println("");
    System.out.print("1. Сумма всех элементов массива равна: ");
    summArray (Array6);
    System.out.println("");
    System.out.println("");
    System.out.print("2. Произведение всех элементов массива равно: ");
    compArray (Array6);
    System.out.println("");
    System.out.println("");
    System.out.print("3. Сумма квадратов всех элементов массива равна: ");
    summPowArray (Array6);
    System.out.println("");
    System.out.println("");
    System.out.print("4. Сумма шести первых элементов массива равна: ");
    summ6Array (Array6);
/*
4. Дан массив. Вывести на экран сначала его неотрицательные элементы, затем
отрицательные
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 1.4");
    System.out.println("===========");
    double Array7[] = generateArray();
    System.out.println("");
    System.out.println("");
    System.out.println("1. Напечатайте все неотрицательные элементы массива:");
    printPositiveArray (Array7);
    System.out.println("");
    System.out.println("");
    System.out.println("2. Напечатайте все отрицательные элементы массива:");
    printNegativeArray (Array7);
/*
5. Дан массив. Определить: 
1. количество максимальных элементов в массиве; 
2. количество минимальных элементов в массиве
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 1.5");
    System.out.println("===========");
    double Array8[] = generateArray();
    System.out.println("");
    System.out.println("");
    System.out.println("1. Определите колличество максимальных элементов в массиве:");
    System.out.println("");
    double max = maxArray (Array8);
    System.out.printf("Максимальный эелемент массива: %.1f, он втречается в массиве %d раз", maxArray (Array8), howManyArray(Array8, max));
    System.out.println("");
    System.out.println("");
    System.out.println("2. Определите колличество минимальных элементов в массиве:");
    System.out.println("");
    double min = minArray (Array8);
    System.out.printf("Минимальный эелемент массива: %.1f, он втречается в массиве %d раз", minArray (Array8), howManyArray(Array8, min));
/*
6. Составить программу: 
1. нахождения минимального значения среди элементов любой строки двумерного
массива;
2. нахождения максимального значения среди элементов любого столбца двумерного
массива
*/
    System.out.println("");
    System.out.println("");
    System.out.println("Задача 1.6");
    System.out.println("===========");
    double[][] Array9 = generateDoubleArray();
    System.out.println("");
    System.out.print("1. Введите номер строки, где необходимо найти минимальный элемент:");
    int number = s.nextInt();
    System.out.printf("Минимальный элемент %d строки равен %.3f: ", number, minLineArray(Array9, number-1));
    System.out.println("");
    System.out.print("2. Введите номер столбца, где необходимо найти максимальный элемент:");
    int number1 = s.nextInt();
    System.out.printf("Максимальный элемент %d столбца равен %.3f: ", number1, maxColumnArray(Array9, number1-1));
      }
    catch(ArrayIndexOutOfBoundsException e) {
    System.out.println("");
    System.out.println("Порядковый номер, который вы ввели неверен");
      }
      }
      }