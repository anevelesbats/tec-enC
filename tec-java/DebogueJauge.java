
public class DebogueJauge {

    void testDansIntervalle(){
        Jauge jauge = new Jauge(5, 3);
        System.out.println("Vert : " + jauge.estVert() + "\nRouge : " + jauge.estRouge());
    }

    public static void main(String[] args) {

        new DebogueJauge().testDansIntervalle();
    }
}