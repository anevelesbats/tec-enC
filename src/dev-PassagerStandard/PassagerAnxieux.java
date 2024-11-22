//source without documentation for javadoc

public class PassagerAnxieux implements Passager {
  
    Position positionPassager;
    String nom;
    int destination;
  
    // constructor
    public PassagerAnxieux(String nom, int destination) {
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
  
    public void monterDans(Autobus t, int numeroArret) {  
      if(destination > (numeroArret + 1))
        if (t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
      }
  
    }
  
    public void nouvelArret(Autobus t, int numeroArret) {
      if (numeroArret == destination - 1) {
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