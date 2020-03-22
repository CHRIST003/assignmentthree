package ac.za.cput.core_principles_of_oop;

public class Birds extends TypeOfAnimals {
    private String insects;

    public Birds(){

    }

    public Birds(String insects) {
        this.insects = insects;
    }

    public String getInsects() {
        return insects;
    }

    public void setInsects(String insects) {
        this.insects = insects;
    }

    @Override
    public void category() {
        System.out.println("birds are vertebrates");
    }

    @Override
    public void eat() {
        System.out.println("Birds eat"+ insects);
    }
}
