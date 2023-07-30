class Line {
  double a;
  double b;
  double c;
  double d;
  public Line (double a, double b, double c, double d) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  } 
  public double lenght () {
    return Math.sqrt(Math.pow((this.c-this.a),2)+Math.pow((this.d-this.b),2));
  } 
}