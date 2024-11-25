//source without documentation for javadoc

public class PassagerStandard implements Passager {
  
  Position positionPassager;
  String nom;
  int destination;

  // constructor
  public PassagerStandard(String nom, int destination) {
    positionPassager = new Position();
    this.nom = nom;
    this.destination = destination;
  }

  //methods
  public String nom() {
    return nom + "RR";
  }

  public boolean estDehors() {
    return positionPassager.estDehors();
  }

  public boolean estAssis() {
    return positionPassager.estAssis();
  }

  public boolean estDebout() {
    return positionPassager.estDebout();
  }

  public void changerEnDehors() {
    positionPassager = positionPassager.dehors();
  }

  public void changerEnAssis() {
    positionPassager = positionPassager.assis();
  }

  public void changerEnDebout() {
    positionPassager = positionPassager.debout();
  }

  public void monterDans(Autobus t) {  
    if (t.aPlaceAssise()) {
      t.monteeDemanderAssis(this); //this : objet dans lequel on se trouve
    }
    else if (t.aPlaceDebout()) {
      t.monteeDemanderDebout(this);
    }

  }

  public void nouvelArret(Autobus t, int numeroArret) {
    if (numeroArret == destination) {
      t.arretDemanderSortie(this);
    }
    /*
    if (t.aPlaceDebout()){
      t.arretDemanderDebout(this);
    }
      */
  }

  public String toString() {
    return this.nom + " " + this.positionPassager;
  }
}