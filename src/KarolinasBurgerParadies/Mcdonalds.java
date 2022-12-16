package KarolinasBurgerParadies;

import java.util.LinkedList;
import java.util.Queue;

public class Mcdonalds {


    public Mcdonalds() {
        System.out.println("Mcdonalds created.");
    }

    private Queue<CommandClass> myQueue = new LinkedList<>();

    public void add(CommandClass c) {
        myQueue.add(c);
        if (myQueue.size() >= 2)
        {
            System.out.println("Retaurant cooking");
            c.create();
            c.cook();
            while (!myQueue.isEmpty()) {
                myQueue.remove().cook();
            }
        }

    }
}
