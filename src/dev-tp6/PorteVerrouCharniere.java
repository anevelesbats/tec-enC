
public class PorteVerrouCharniere{
    private boolean estDeverouille;
    PorteCharniere porteCharniereVerrou;

    public PorteVerrouCharniere(){
        porteCharniereVerrou = new PorteCharniere(); 
        estDeverouille = true;
    }
    void verrouiller(){
        estDeverouille = false;
    }
    void deverouiller(){
        estDeverouille = true; 
    }
    public boolean estVerouille(){
        return estDeverouille == false; 
    }

    public boolean estFerme() {
        return porteCharniereVerrou.estFerme(); 
    }
    
    public void fermer() {
        if (estVerouille() == false){
            porteCharniereVerrou.fermer();
            verrouiller();
        }
    }
    
    public void ouvrir() {
        if (estVerouille() == false) {
            porteCharniereVerrou.ouvrir();
        }
        else{
            deverouiller();
            porteCharniereVerrou.ouvrir(); 
        }
        
    }
}