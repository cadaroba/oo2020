import java.util.Random;
public class animal1{
    public String name;
    public String description;
    public int maxEnergy;
    public int energy;
    public int hunger;
    public int food;
    public Random r = new Random();

    public animal1(String name, String description, int maxEnergy, int energy, int hunger){
        this.name = name;
        this.description = description;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
        this.hunger = hunger;
        this.food = food;
    }

    public int playSeconds(){
       return r.nextInt(maxEnergy-energy + 1) + hunger;
    }

    public void animalenergyDrain(human1 human){
        int playEnergy = human.playSeconds();
        energy = (energy > playEnergy) ? energy - playEnergy:0;
        System.out.printf(" " + name + " on mängides %d kulutanud energiast(%s\n)", playEnergy, getStatus());
        if (energy == 0) {
            System.out.println(" " + name + " on väsinud");
        }
    }

    public void restoreEnergy(){
        if (food > 0){
            energy = Math.min(maxEnergy, energy + 20);
            System.out.printf(" %s sööb toitu(%s, %d toitu on järgi)\n", name, getStatus(), --food);
        } else {
            System.out.println(" Toit on on otsas..");
        }
    }

    public String getStatus() {
        return "Looma energia: " + energy;
    }

}