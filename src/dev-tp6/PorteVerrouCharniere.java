
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
        if (estFerme()){
            System.out.println("Porte déjà fermée tocard");
        }
        else{
            if (estVerouille() == false){
                porteCharniereVerrou.fermer();
            }
            else{
                System.out.println("Porte vérouillée, tu ne peux pas la fermer");
            }
        }
    }
    
    public void ouvrir() {
        if (estFerme() == false){
            System.out.println("La porte est ouverte tocard");
        }
        else{
            if (estVerouille() == false) {
                porteCharniereVerrou.ouvrir();
            }
            else{
                System.out.println("Le verrou est lock tu dois le dévérouiller");
            }
        }
    }
}