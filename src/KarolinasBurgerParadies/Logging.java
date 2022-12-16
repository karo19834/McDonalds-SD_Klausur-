package KarolinasBurgerParadies;

public class Logging {

    private static Logging instance = null;
    Logging() {}

    public static Logging getInstance() {
        if(instance == null){
            System.out.println("Class Logging created.");
            instance = new Logging();
        }
        else {
            System.out.println("Class Logging already exists!!!!! ");
        }
        return instance;
    }


    public void log(String text){
        System.out.println(text);
    }

}
