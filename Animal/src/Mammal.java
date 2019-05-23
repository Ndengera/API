public class Mammal extends Animal implements AnimalInterface {

    private int numberOfFur;
    private int numberOfLegs;

    public Mammal(String name, String color, int numberOfFur, int numberOfLegs) {
        super(name, color);
        this.numberOfFur = numberOfFur;
        this.numberOfLegs = numberOfLegs;
    }


    public int getNumberOfFur() {
        return numberOfFur;
    }

    public void setNumberOfFur(int numberOfFur) {
        this.numberOfFur = numberOfFur;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void printAnimalDetails() {
        System.out.println("Type :"+Mammal.class.getName()+"Name: "+getName()+"Color: "+getColor()+
                "Number of Legs: "+getNumberOfLegs()+"Number of Fur: "+getNumberOfFur());
    }

    @Override
   public void communicate() {
        System.out.println("Mammal communicate by talking");
    }

    @Override
    public void move() {
        System.out.println("Mammals move by walking");
    }
}
