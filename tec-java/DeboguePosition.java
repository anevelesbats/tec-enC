public class DeboguePosition {


    void testDehorsInitial ()
    {
        Position position = new Position();
        System.out.println("Assis :" + position.estAssis() + "\nDebout :" + position.estDebout()
        + "\nDehors : " + position.estDehors() + "\nDedans : " + position.estInterieur());
    }


    public static void main(String[] args) {
        new DeboguePosition().testDehorsInitial();
    }
}
