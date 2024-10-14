
public class DebogueJauge {

    void testDansIntervalle(){
        Jauge jauge1 = new Jauge(5, 3);
        System.out.println("\nMéthode 1" + "\nVert : " + jauge1.estVert() + "\nRouge : " + jauge1.estRouge());
    }

    public static void main(String[] args) {

        new DebogueJauge().testDansIntervalle();

        Jauge jauge2 = new Jauge(3, 5);
        System.out.println("\nMéthode 2" + "\nVert : " + jauge2.estVert() + "\nRouge : " + jauge2.estRouge());
        
        int n = 5;
        while(n > 0){
        Jauge jauge3 = new Jauge(3, n);
        System.out.println("\nMéthode 3 n = " + n + "\nVert : " + jauge3.estVert() + "\nRouge : " + jauge3.estRouge());
        n = n - 1;
        }
    }
}