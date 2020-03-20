public interface Cars {
    public void carTopSpeed();
    public void carWidth();
    public void carLength();
    public void carHeight();
    public void carsProduced();
}


  class FerrariSpider implements Cars {
    public void carTopSpeed() {
      System.out.println("Tippkiirus: 320km/h");
    }
    public void carsProducedYear() {
        System.out.println("Tootmisaasta: 2009-2015");
    }
    public void carsProduced() {
        System.out.println("Toodetud autode arv: 2884");
    }
    public void carWidth() {
        System.out.println("Laius: 1937mm");
    }
    public void carLength() {
        System.out.println("Pikkus: 4527mm");
    }
    public void carHeight() {
        System.out.println("Kõrgus: 1211mm");
    }
    public void weight() {
        System.out.println("Täismass: 1535kg");
    }
    
}


class LamborghiniDiablo implements Cars {
    public void carTopSpeed() {
      System.out.println("Tippkiirus: 320km/h");
    }
    public void carsProducedYear() {
        System.out.println("Tootmisaasta: 1990-2001");
    }
    public void carsProduced() {
        System.out.println("Toodetud autode arv: 15230");
    }
    public void carWidth() {
        System.out.println("Laius: 2040mm");
    }
    public void carLength() {
        System.out.println("Pikkus: 4460mm");
    }
    public void carHeight() {
        System.out.println("Kõrgus: 1105mm");
    }
    public void weight() {
        System.out.println("Täismass: 1576kg");
    }
}
