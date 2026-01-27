package oops;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
//        obj.greetings("Ammu");
        obj.greetings("Ammu",5);


    }
}

class Greet {
    void greetings() {
        System.out.println("Hello, Namaste");
    }

    void greetings(String name) {
        System.out.println("Hello " + name + ",Good morning");
    }

    void greetings(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name + ",Good morning");
        }
    }
}
