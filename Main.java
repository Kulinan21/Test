

public class Main {
    public static void main(String[] args) {
        Coala coala = new Coala("Bill", 27);
        System.out.println("Знайомтесь це " + coala.name + " він коала");
        System.out.println("Його вага складає " + coala.weight + " кілограмів");
        System.out.print(coala.name + " спить ");
        coala.sleep();
        System.out.print(coala.name + " їсть ");
        coala.eat();
        coala.makeSound();

        System.out.println();

        Cat cat = new Cat("Марко", 7, 4);
        System.out.println("Знайомтесь це " + cat.name + " він кіт");
        System.out.println("Його вага складає " + cat.weight + " кілограмів");
        System.out.print(cat.name + " спить ");
        cat.sleep();
        System.out.print(cat.name + " їсть ");
        cat.eat();
        System.out.println(cat.name + " ловить " + cat.MousePerDay + " миші за день");
        cat.makeSound();

        System.out.println();

        Horse horse = new Horse("Маргоша", 410, 75);
        System.out.println("Знайомтесь це " + horse.name + " вона кінь");
        System.out.println("Її вага складає " + horse.weight + " кілограмів");
        System.out.print(horse.name + " спить ");
        horse.sleep();
        System.out.print(horse.name + " їсть ");
        horse.eat();
        System.out.println(horse.name + " розганяється до " + horse.speed + " кілометрів за годину");
        horse.makeSound();

        System.out.println();

        System.out.print(horse.equals(cat));


    }
}



