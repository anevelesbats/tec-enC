//source without documentation for javadoc

public class PassagerStandard extends FactoPassager{

  // constructor
  public PassagerStandard(String nom, int destination) {
    super(nom, destination); 
  }

  public void monterDans(Autobus t, int numero_arret) {  
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
  }
  public String toString() {
    
    return this.nom + " " + this.positionPassager;
  }
}

