package Products;

import java.util.Objects;

public class Product {

private String name;
private int price;
private String description;
private Сategories categories;

    public Product(String name, int price, String description, Сategories categories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Сategories getCategories() {
        return categories;
    }

    public void ProductCategories(){
        System.out.println(name.toString());
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name) && Objects.equals(description, product.description) && categories == product.categories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, categories);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", categories=" + categories +
                '}';
    }
}
