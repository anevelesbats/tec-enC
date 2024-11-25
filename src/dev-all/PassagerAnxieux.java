//source without documentation for javadoc

public class PassagerAnxieux extends FactoPassager {

  // constructor
  public PassagerAnxieux(String nom, int destination) {
    super(nom, destination);
  }


  public void monterDans(Autobus t, int numeroArret) {  
    if (numeroArret + 3 == destination ){
      if (t.aPlaceDebout()){
        t.monteeDemanderDebout(this);
      }
    }
    else if (t.aPlaceAssise()) {
        t.monteeDemanderAssis(this); //this : objet dans lequel on se trouve
    }
  }

  public void nouvelArret(Autobus t, int numeroArret) {
    if (numeroArret == destination - 1) {
      t.arretDemanderSortie(this);
    }
  }
  public String toString() {
    
    return this.nom + " " + this.positionPassager;
  }
}

