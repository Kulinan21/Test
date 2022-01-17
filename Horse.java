public class Horse extends Animal {
    int speed;

    public Horse(String name, int weight, int speed) {
        super(name, weight);
        this.speed = speed;
    }

    String Voice = "Я Вам що, коняка, працювати у Суботу? ";

    @Override
    public void eat() {
        System.out.println("сіно");
    }

    @Override
    public void sleep() {
        System.out.println("4 години на день(Не хочу як вона)");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(Voice);
    }
}
