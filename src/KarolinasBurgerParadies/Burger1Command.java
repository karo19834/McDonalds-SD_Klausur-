package KarolinasBurgerParadies;

public class Burger1Command implements CommandClass{
    @Override
    public void create() {
        System.out.println("Burger1Command created");
    }

    @Override
    public void cook() {
        System.out.println("Burger1 is being cooked");
    }
}
