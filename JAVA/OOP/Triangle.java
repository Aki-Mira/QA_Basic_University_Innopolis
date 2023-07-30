class Triangle {
  double a;
  double b;
  double c;
  public Triangle (double a, double b, double c) {
     if((a + b > c) && (a + c > b) &&(c + b > a) && (a > 0) && (b > 0) && (c > 0)){
      this.a = a;
      this.b = b;
      this.c = c;
     }
    else {
      System.out.println("Такой треугольник не может быть создан");
      }
  }
  public double perimetr (){
    return this.a + this.b + this.c;
  }
  public double square (){
    return Math.sqrt(this.perimetr ()/2*(this.perimetr ()/2-a)*(this.perimetr ()/2-b)*(this.perimetr ()/2-c));
  }
}