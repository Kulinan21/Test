public class Coala extends Animal{

    public Coala(String name, int weight) {
        super(name, weight);
    }

    String Voice = "Скільки живу, не бачив, щоб коали говорили";

    @Override
    public void eat() {
        System.out.println("Евкаліпт");
    }

    @Override
    public void sleep() {
        System.out.println("більшу частину життя(Хочу як він)");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(Voice);
    }
}
