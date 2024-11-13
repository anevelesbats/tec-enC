//source without documentation for javadoc

class Autobus {

  int numArret;
  Jauge Assis;
  Jauge Debout;
  PassagerStandard[] Passagers;

  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    Assis = new Jauge(nbPlaceAssise, 0);
    Debout = new Jauge(nbPlaceDebout, 0);
  }

  //methods
  public boolean aPlaceAssise() {
    return false;
  }

  public boolean aPlaceDebout() {
    return false;
  }

  public void monteeDemanderAssis(PassagerStandard p) {
  }

  public void monteeDemanderDebout(PassagerStandard p) {
  }

  public void allerArretSuivant() {
  }

  public void arretDemanderAssis(PassagerStandard p) {
  }

  public void arretDemanderDebout(PassagerStandard p) {
  }

  public void arretDemanderSortie(PassagerStandard p) {
  }
}
