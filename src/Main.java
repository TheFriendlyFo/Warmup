import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(
                new Dog(5,4, "Mona"),
                new Dog(7, 3, "Cloe"),
                new Dog(6, 4, "Bob"),
                new Dog(8, 4, "Cob"),
                new Dog(3, 4, "Bob"),
                new Dog(0, 5, "A")
        ));

        Collections.shuffle(dogs);

        ArrayListAlgorithms.quickSort(dogs);
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

    }
}