
public class DebogueJauge {

    void testDansIntervalle(){
        Jauge jauge1 = new Jauge(5, 3);
        System.out.println("\nMéthode 1" + "\nVert : " 
        + jauge1.estVert() + "\nRouge : " + jauge1.estRouge());
    }

    void testHorsIntervalle(){
        Jauge jauge2 = new Jauge(3, 5);
        System.out.println("\nMéthode 2" + "\nVert : " 
        + jauge2.estVert() + "\nRouge : " + jauge2.estRouge());

    }

    void testSup(int n){
        while(n > -2){
            Jauge jauge3 = new Jauge(3, n);
            System.out.println("\nMéthode 3 n = " + n + "\nVert : " + jauge3.estVert() + "\nRouge : " + jauge3.estRouge());
            if(jauge3.estVert() == jauge3.estRouge() && jauge3.estVert() == true){
                System.out.println("Il y a une anomalie\n");
            }else{
                System.out.println("Il n'y a pas d'anomalie\n");
            }
            n = n - 1;
        }
    }

    void testInf(int m){
        while(m < 6){
            Jauge jauge4 = new Jauge(3, m);
            System.out.println("\nMéthode 4 m = " + m + "\nVert : " + jauge4.estVert() + "\nRouge : " + jauge4.estRouge());
            if(jauge4.estVert() == jauge4.estRouge() && jauge4.estVert() == true){
                System.out.println("Il y a une anomalie\n");
            }else{
                System.out.println("Il n'y a pas d'anomalie\n");
            }
            m = m + 1;
        }
    }

    public static void main(String[] args) {

        new DebogueJauge().testDansIntervalle();
        new DebogueJauge().testHorsIntervalle();

        int n = 5;
        new DebogueJauge().testSup(n);

        int m = -2;
        new DebogueJauge().testInf(m);
        
    }
}