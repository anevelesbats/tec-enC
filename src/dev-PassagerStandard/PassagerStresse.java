//source without documentation for javadoc

public class PassagerStresse implements Passager {
  
  Position positionPassager;
  String nom;
  int destination;

  // constructor
  public PassagerStresse(String nom, int destination) {
    positionPassager = new Position();
    this.nom = nom;
    this.destination = destination;
  }

  //methods
  public String nom() {
    return nom;
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

  public void monterDans(Autobus t, int numeroArret) {  
    if (numeroArret + 3 == destination ){
      t.monteeDemanderDebout(this);
    }
    else if (t.aPlaceAssise()) {
        t.monteeDemanderAssis(this); //this : objet dans lequel on se trouve
    }
  }

  public void nouvelArret(Autobus t, int numeroArret) {
    if (numeroArret == destination - 3) {
      t.arretDemanderDebout(this);
    }
    else if (numeroArret == destination) {
      t.arretDemanderSortie(this);
    }
  }
  public String toString() {
    
    return this.nom + " " + this.positionPassager;
  }
}

