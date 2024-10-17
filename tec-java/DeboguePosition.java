class DeboguePosition {
    

    void test1()
    {
        
        System.out.println("Cas de test 1 : \n");
        Position position = new Position();
        afficher_etat(position);
    }

    void test2(){
        System.out.println("Cas de test 2 : \n");
        Position position = new Position().assis();
        afficher_etat(position);
    }

    void test3()
    {
        System.out.println("Cas de test 3 : \n");
        Position position = new Position().debout();
        afficher_etat(position);
    }

    void test4()
    {
        System.out.println("Cas de test 4 : \n");
        Position position = new Position();
        afficher_etat(position);

        position = new Position().assis();
        afficher_etat(position);

        position = new Position();
        afficher_etat(position);
        
    }

    void afficher_etat(Position position)
    {
        System.out.println("Assis :" + position.estAssis() + "\nDebout :" + position.estDebout() 
        + "\nDehors : " + position.estDehors() + "\nDedans : " + position.estInterieur() + "\n" + position.toString() + "\n");
    }

    public static void main(String[] args) {

        new DeboguePosition().test1();

        new DeboguePosition().test2();
        
        new DeboguePosition().test3();
        
        new DeboguePosition().test4();

    }
}
