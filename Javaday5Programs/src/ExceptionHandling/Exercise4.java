package ExceptionHandling;

class Food {
    void breakfast() {
        System.out.println("Breakfast is: Dosa");
    }
}

class Lunch extends Food {
    void lunch() {
        System.out.println("Lunch is: Meals");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Food s2 = new Food(); // Creating an object of Food class
        Lunch s1 = new Lunch(); // Creating an object of Lunch class
        
        s1.breakfast(); // Calling inherited method from Food class
        s1.lunch(); // Calling method from Lunch class
    }
}
