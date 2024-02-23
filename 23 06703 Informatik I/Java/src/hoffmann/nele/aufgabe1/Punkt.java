package hoffmann.nele.aufgabe1;

public class Punkt {
  // innerhalb dieses Klammern-Paares wird die Klasse beschrieben

  private double x; // x-Koordinate
  private double y; // y-Koordinate

  public Punkt(double xWert, double yWert) {
    x = xWert;
    y = yWert;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public void versetzen(double xNeu, double yNeu) {
    x = xNeu;
    y = yNeu;
  }

  public void verschieben(double dx, double dy) {
    x += dx;
    y += dy;
  }

  public boolean equals(Punkt p) {
    return (x == p.x) && (y == p.y);
  }
}
