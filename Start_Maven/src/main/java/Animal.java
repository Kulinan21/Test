import java.util.Objects;

public abstract class Animal {

    String name;
    int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract String makeSound();

    public abstract String eat();
    public abstract void sleep();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}





