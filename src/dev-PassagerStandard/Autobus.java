//source without documentation for javadoc

class Autobus {

  private int numArret;
  private Jauge Assis;
  private Jauge Debout;
  private Passager[] Passagers;


  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    Assis = new Jauge(nbPlaceAssise, 0);
    Debout = new Jauge(nbPlaceDebout, 0);
    numArret = 0;
    Passagers = new Passager[nbPlaceAssise+nbPlaceDebout];
  }

  private int recherche_indice(Passager p)
  {
    for(int i = 0; i < Passagers.length; i++)
    {
      if(p == this.Passagers[i])
        return i;
    }
    return 0;
  }

  //methods
  public boolean aPlaceAssise() {
    return Assis.estVert();
  }

  public boolean aPlaceDebout() { 
    return Debout.estVert();
  }

  public void monteeDemanderAssis(Passager p) {
    Assis.incrementer();
    p.changerEnAssis();
    int idx = recherche_indice(null);
    Passagers[idx] = p;
  }


  public void monteeDemanderDebout(Passager p) {
    Debout.incrementer();
    p.changerEnDebout();
    int idx = recherche_indice(null);
    Passagers[idx] = p;
  }

  public void allerArretSuivant() {
    numArret += 1;
    for(int i = 0; i < Passagers.length; i++)
    {
      if (null != Passagers[i])
        Passagers[i].nouvelArret(this, numArret);
    }
  }

  public void arretDemanderAssis(Passager p) {
    Assis.incrementer();
    Debout.decrementer();
    p.changerEnAssis();
  }

  public void arretDemanderDebout(Passager p) {
    Assis.decrementer();
    Debout.incrementer();
    p.changerEnDebout();
  }

  public void arretDemanderSortie(Passager p) {
    if(p.estAssis()){
      Assis.decrementer();
    }else if (p.estDebout()){
      Debout.decrementer();
    }
    p.changerEnDehors();
    int idx = recherche_indice(p);
    Passagers[idx] = null;

  }

  public String toString(){
    return "[arret:" + numArret + ", assis: " + Assis.toString() + ", debout: " + Debout.toString() + "]";
  }
  
}