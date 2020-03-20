class Proov {
    public static void main(String[] args) {
      FerrariSpider myFerrariSpider = new FerrariSpider();//Loo Ferrari objekt
      LamborghiniDiablo myLamborghiniDiablo = new LamborghiniDiablo(); //Loo LamborghiniDiablo objekt
      System.out.printf("%n");
      System.out.println("[FERRARI SPIDER 458]");
      myFerrariSpider.carTopSpeed();
      myFerrariSpider.carsProduced();
      myFerrariSpider.carsProducedYear();
      myFerrariSpider.carWidth();
      myFerrariSpider.carLength();
      myFerrariSpider.carHeight();
      myFerrariSpider.weight();


      System.out.printf("%n");
      System.out.println("[LAMBORGHINI DIABLO]");
      myLamborghiniDiablo.carTopSpeed();
      myLamborghiniDiablo.carsProduced();
      myLamborghiniDiablo.carsProducedYear();
      myLamborghiniDiablo.carWidth();
      myLamborghiniDiablo.carLength();
      myLamborghiniDiablo.carHeight();
      myLamborghiniDiablo.weight();
    }
}