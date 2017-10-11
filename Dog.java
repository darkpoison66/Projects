public class Dog extends Mammal {
    public void speak() {
        System.out.println("Woof, woof!");
    }

    public static void main(String[] args) {
        Dog sparky = new Dog();
        Cat huh = (Cat) sparky;
    }
}