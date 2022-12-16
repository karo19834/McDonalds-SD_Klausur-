package KarolinasBurgerParadies;

public class Burger2Command implements CommandClass{
    @Override
    public void create() {
        System.out.println("Burger2Command created");
    }

    @Override
    public void cook() {
        System.out.println("Burger2 is being cooked");
    }
}
