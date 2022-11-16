public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Pig pig = new Pig();
        Dog dog = new Dog();

        Animals[] action = {cat,pig,dog};

        for(Animals x : action) {
            x.go();
        }

    }
}
