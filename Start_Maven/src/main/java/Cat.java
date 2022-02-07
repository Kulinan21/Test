public class Cat extends Animal {
    int MousePerDay;

    public Cat(String name, int weight) {
        super(name, weight);
    }
    public Cat(String name, int weight, int mousePerDay) {
        super(name, weight);
        this.MousePerDay = mousePerDay;
    }

    String Voice = "Ну, примустимо, Мяууу!!!";

    @Override
    public String eat() {
        return "Миші";
    }

    @Override
    public void sleep() {
        System.out.println("ще більше ніж коала");
    }

    @Override
    public String makeSound() {
        return Voice;
    }
}


