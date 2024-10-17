public class DeboguePosition {


    void testDehorsInitial ()
    {
        System.out.println("Cas de test 1 : \n");
        Position position = new Position();
        afficher_etat(position);
    }

    void testDehorsAssis(){
        System.out.println("Cas de test 2 : \n");
        Position position2 = new Position().assis();
        afficher_etat(position2);
    }

    void testDehorsDebout()
    {
        System.out.println("Cas de test 3 : \n");
        Position position3 = new Position().debout();
        afficher_etat(position3);
    }

    void afficher_etat(Position position)
    {
        System.out.println("Assis :" + position.estAssis() + "\nDebout :" + position.estDebout() 
        + "\nDehors : " + position.estDehors() + "\nDedans : " + position.estInterieur() + "\n");
    }

    public static void main(String[] args) {
        new DeboguePosition().testDehorsInitial();
        new DeboguePosition().testDehorsAssis();
        new DeboguePosition().testDehorsDebout();
    }
}
