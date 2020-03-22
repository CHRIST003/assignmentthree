package ac.za.cput.core_principles_of_oop;

public class Lion extends TypeOfAnimals {

    private String redMead;

    public Lion(String redMead) {
        this.redMead = redMead;
    }

    public void setRedMead(String redMead) {
        this.redMead = redMead;
    }

    public String getRedMead() {
        return redMead;
    }

    @Override
    public void eat(){
        System.out.println("A lion eats "+ redMead);
    }

    @Override
    public void category(){
        System.out.println("The lion is a mammal");
    }
}
