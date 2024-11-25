
public class PorteCharniere {
  private boolean estFerme;

  public PorteCharniere() {
    estFerme = false;
  }

  public boolean estFerme() {
    return estFerme;
  }

  public void fermer() {
    estFerme = true;
  }

  public void ouvrir() {
    estFerme = false;
  }
}

