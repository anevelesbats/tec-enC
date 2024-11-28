class TestPorteVerrouCharniere {

    void test_porte_ouverte() {
        System.out.println("Cas de test 1 : ");
        PorteVerrouCharniere porte1 = new PorteVerrouCharniere();
        porte1.ouvrir();
        etat_porte(porte1);
    }

    void test_tocard(){
        System.out.println("Cas de test 3 : ");
        PorteVerrouCharniere porte2 = new PorteVerrouCharniere();
        etat_porte(porte2);
        porte2.ouvrir();
        etat_porte(porte2);
        porte2.fermer();
        porte2.verrouiller();
        etat_porte(porte2);
        porte2.fermer();
        etat_porte(porte2);
        porte2.ouvrir();
        etat_porte(porte2);
    }

    void test_porte_ferme() {
        System.out.println("Cas de test 2 : ");
        PorteVerrouCharniere porte2 = new PorteVerrouCharniere();
        porte2.fermer();
        etat_porte(porte2);
        porte2.verrouiller();
        etat_porte(porte2);
        porte2.deverouiller();
        etat_porte(porte2);
        porte2.ouvrir();
        etat_porte(porte2);
    }

    void etat_porte(PorteVerrouCharniere porte) {
        if (porte.estFerme() && porte.estVerouille()) {
            System.out.println("Porte fermée et vérouillée\n");
        } else if (porte.estFerme() == false) {
            System.out.println("Porte ouverte et déverouillée\n");
        } else if (porte.estFerme() && (porte.estVerouille()) == false) {
            System.out.println("Porte fermée et déverouillée\n");
        }
    }

    public static void main(String[] args) {
        new TestPorteVerrouCharniere().test_porte_ouverte();
        new TestPorteVerrouCharniere().test_porte_ferme();
        new TestPorteVerrouCharniere().test_tocard();
    }
}
