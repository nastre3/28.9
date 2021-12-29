import java.util.ArrayList;
import java.util.LinkedList;

public class Hw {
    public static void main(String[] args) {
        ArrayList<Animal> myArrayList = new ArrayList<Animal>();
        LinkedList<String> myLinkedList = new LinkedList<String>();

        myArrayList.add(new Cat("Vasya"));
        myArrayList.add(new Cat("Bersi"));
        myArrayList.add(new Parrot("Kesha"));

        myArrayList.remove(0);
        printAnimals(myArrayList);

        myLinkedList.add("We added 1st element to LinkedList!");
        myLinkedList.add("We added 2nd element to LinkedList!");
        System.out.println(myLinkedList.peek());
    }

    private static void printAnimals(ArrayList<Animal> myArrayList) {
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i));
    }
}
