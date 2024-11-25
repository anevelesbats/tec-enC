public abstract class FactoPassager implements Passager{
    
    Position positionPassager;
    String nom;
    int destination;


    public FactoPassager(String nom, int destination) {
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
}
