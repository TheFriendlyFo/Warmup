public class Dog implements Comparable {
    int barkVolume;
    int age;
    String name;

    public Dog(int barkVolume, int age, String name) {
        this.barkVolume = barkVolume;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Comparable compare) {
        Dog compareDog = (Dog) compare;

        if (age > compareDog.age) {
            return 1;
        } else if (age < compareDog.age) {
            return -1;
        }

        if (name.compareTo(compareDog.name) > 0) {
            return 1;
        } else if (name.compareTo(compareDog.name) < 0) {
            return -1;
        }

        return Integer.compare(barkVolume, compareDog.barkVolume);
    }

    public String toString() {
        return age + " " + name + " " + barkVolume;
    }
}
