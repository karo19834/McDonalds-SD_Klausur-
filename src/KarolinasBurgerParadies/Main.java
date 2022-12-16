package KarolinasBurgerParadies;

public class Main {
    public static void main(String[] args) {

        Mcdonalds Restaurant1 = new Mcdonalds();
        Mcdonalds Restaurant2 = new Mcdonalds();

        Logging logMe = new Logging();
        logMe.log("Programm started");

        Restaurant1.add(new Burger1Command());
        Restaurant1.add(new Burger2Command());
        Restaurant1.add(new Burger3Command());
        Restaurant2.add(new Burger1Command());
        Restaurant2.add(new Burger2Command());
        Restaurant2.add(new Burger3Command());

        facadeFunktion(Restaurant2);

        logMe.log("Programm shutting down");

    }

    public static void facadeFunktion(Mcdonalds r){
        r.add(new Burger1Command());
        r.add(new Burger2Command());
        r.add(new Burger3Command());
    }
}
