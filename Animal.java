
public abstract class Animal {

    String name;
    int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void makeSound(){
        System.out.print("");
    }
    public abstract void eat();
    public abstract void sleep();
}





