package hoffmann.nele.aufgabe1;

public class Rechteck {

  private Punkt startpunkt;
  private double hoehe;
  private double breite;

  public Rechteck(Punkt start, double h, double b) {
    this.startpunkt = start;
    this.hoehe = h;
    this.breite = b;
  }


  public Rechteck(double xstart, double ystart, double h, double b) {
    this(new Punkt(xstart, ystart), h, b);
  }


  public Punkt getStartpunkt() {
    return startpunkt;
  }


  public double getHoehe() {
    return hoehe;
  }


  public double getBreite() {
    return breite;
  }

  public double berechneFlaeche() {
    return hoehe * breite;
  }

  public double brechneUnfang() {
    return 2 * (hoehe + breite);
  }

  public void versetzen(double xNeu, double yNeu) {
    startpunkt.versetzen(xNeu, yNeu);
  }

  public void verschieben(double dx, double dy) {
    startpunkt.verschieben(dx, dy);
  }

  public String toString() {
    return "(" + startpunkt.getX() + ", " + startpunkt.getY() + ", " + hoehe + ", " + breite + ")";
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(breite);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(hoehe);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((startpunkt == null) ? 0 : startpunkt.hashCode());
    return result;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Rechteck other = (Rechteck) obj;
    if (Double.doubleToLongBits(breite) != Double.doubleToLongBits(other.breite)) {
      return false;
    }
    if (Double.doubleToLongBits(hoehe) != Double.doubleToLongBits(other.hoehe)) {
      return false;
    }
    if (startpunkt == null) {
      if (other.startpunkt != null) {
        return false;
      }
    } else if (!startpunkt.equals(other.startpunkt)) {
      return false;
    }
    return true;
  }
  
  
}
