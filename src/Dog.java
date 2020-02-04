public class Dog extends Animal {
    private String dogName;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public Dog(){

    }

    @Override
    public void run() {
        System.out.println("Running...");

    }
}
