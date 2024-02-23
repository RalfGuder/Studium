package hoffmann.nele.aufgabe1;

public class PunktTester {

  public static void main(String[] args) {
    Punkt p1 = new Punkt(5, 7);
    System.out.println("Punkt 1 erzeugt");

    System.out.println("x = " + p1.getX());
    System.out.println("y = " + p1.getY());

    Punkt p2 = new Punkt(3, 14);
    System.out.println("2. Punkt: " + p2.toString());

    p2.versetzen(3, 3);
    System.out.println("2. Punkt versetzt auf: " + p2.toString());

    p2.verschieben(2, 4);
    System.out.println("2. Punkt verschoben nach: " + p2.toString());


    System.out.println("1. und 2. Punkt vergleichen: ");
    if (p1.equals(p2)) {
      System.out.println("p1 und p2 zeigen auf gleiches Punkt-Objekt");
    } else {
      System.out.println("p1 und p2 zeigen auf verschiedene Punkt-Objekte");
    }
  }


}
