package KarolinasBurgerParadies;

public class Burger3Command implements CommandClass{
    @Override
    public void create() {
        System.out.println("Burger3Command created");
    }

    @Override
    public void cook() {
        System.out.println("Burger3 is being cooked");
    }
}
