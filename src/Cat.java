public class Cat implements Comparable{
    int age;
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Comparable compare) {
        Cat compareCat = (Cat) compare;

        if (age > compareCat.age) {
            return 1;
        } else if (age < compareCat.age) {
            return -1;
        }

        return name.compareTo(compareCat.name);
    }

    public String toString() {
        return name + " " + age;
    }
}
