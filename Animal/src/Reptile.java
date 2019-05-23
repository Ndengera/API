public class Reptile extends Animal implements AnimalInterface {

    private int numberOfScales;

    public Reptile(String name, String color, int numberOfScales) {
        super(name, color);
        this.numberOfScales = numberOfScales;
    }

    public int getNumberOfScales() {
        return numberOfScales;
    }

    public void setNumberOfScales(int numberOfScales) {
        this.numberOfScales = numberOfScales;
    }

    @Override
    public void printAnimalDetails(){

        System.out.println("Type: "+Reptile.class.getName()+"Name: "+getName()+"Color: "+getColor());

    }

    @Override
    public void communicate() {
        System.out.println("Reptiles communicate by hissing....");
    }

    @Override
    public void move() {
        System.out.println("Reptiles move by crawling....");
    }
}
