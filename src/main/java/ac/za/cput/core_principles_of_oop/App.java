package ac.za.cput.core_principles_of_oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String readMeat ="Lamb";
        String insects = "ants";
        TypeOfAnimals typeofanimals = new TypeOfAnimals();
        TypeOfAnimals Lion = new Lion (readMeat);
        TypeOfAnimals Birds = new Birds(insects);
        Lion.category();
        Lion.eat();
        Birds.eat();
        Birds.category();
    }
}
