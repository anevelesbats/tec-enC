
public class PorteVerrouCharniere {
    private boolean estDeverouille;
    private PorteCharniere porteCharniere;


    public PorteVerrouCharniere() {
        porteCharniere = new PorteCharniere(); 
        estDeverouille = true;
      }

      public boolean estVerrouille() {
        return estDeverouille == false;
      }
    
      public void verrouiller() {
        estDeverouille = false;
      }
    
      public void deverouiller() {
        estDeverouille = true;
      }
    
      public boolean estFerme() {
        return porteCharniere.estFerme();
      }
    
      public void fermer() {
        porteCharniere.fermer();
      }
    
      public void ouvrir() {
        if(this.estVerrouille()==false){
          porteCharniere.ouvrir();
        }
      }
    
}