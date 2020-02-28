import java.util.Random;
public class human1{
    public String name;
    public String description;
    public int maxEnergy;
    public int energy;
    public int hunger;
    public Random r = new Random();

    public human1(String name, String description, int maxEnergy, int energy){
        this.name = name;
        this.description = description;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
    }
        
    public void humanenergyDrain(animal1 animal1) {
        int playEnergy = animal1.playSeconds();
        energy = (energy > playEnergy) ? energy - playEnergy:0;
        System.out.printf(" " + name + " on mängides %d kulutanud energiast(%s\n)", playEnergy, getStatus());
        if (energy == 0) {
            System.out.println(" " + name + " on väsinud");
        }
    }

    public int playSeconds(){
        return r.nextInt(maxEnergy-energy + 1) + hunger;
    }
    
    public String getStatus() {
        return "inimese energia: " + energy;
    }

}