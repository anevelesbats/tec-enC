
class Switching {
  void go(int choice) {
    if (choice == 1) {
      A a = new A();
      a.hop();
      a.poh();
    }
    if (choice == 2) {
      new B().shazam();
    }
  }
}

class A {
  public void hop() {
    System.out.print("<Hop Hop>");
  }

  public void poh() {
    System.out.println("<Poh Poh>");
  }
}


class B {
  public void shazam() {
    System.out.println("shazammm");
  }
}


class TestSwitching {
  static public void main(String[] args) {
    Switching s = new Switching();
    s.go(2);
    s.go(1);
  }
}

