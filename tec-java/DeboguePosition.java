public class DeboguePosition {


    void testDehorsInitial ()
    {
        Position position = new Position();
        System.out.println("Assis :" + position.estAssis() + "\nDebout :" + position.estDebout() 
        + "\nDehors : " + position.estDehors() + "\nDedans : " + position.estInterieur());
    }

    void testDehorsAssis(){
        Position position2 = new Position().assis();
        System.out.println("Position : " + position2.estAssis());
    }

    public static void main(String[] args) {
        new DeboguePosition().testDehorsInitial();
        new DeboguePosition().testDehorsAssis();
    }
}
