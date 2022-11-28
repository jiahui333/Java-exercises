package assignment2;

public class Zoo {
    public int calculatePrice (Person person) {
        int price = 0;
        if (person.getAge() <= 5) {
            price = 0;
        } else if (person.getAge() <= 12) {
            price = 5;
        } else if (person.getAge() > 12) {
            price = 15;
        }

        return price;
    }
}

