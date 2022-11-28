package assignment2;

public class App {

    public static void main(String[] args) {
        Person person1 = new Person("aa", 3);
        Person person2 = new Person("bb", 10);
        Person person3 = new Person("cc", 63);

        Zoo zoo = new Zoo();

        System.out.println(zoo.calculatePrice(person1));
        System.out.println(zoo.calculatePrice(person2));
        System.out.println(zoo.calculatePrice(person3));

    }

}
