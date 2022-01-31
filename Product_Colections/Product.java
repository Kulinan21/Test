package Product_Colections;

import java.util.Objects;

public class Product implements Comparable<Product> {

    private String name;
    private int price;
    private String description;
    private Categories categories;

    public Product(String name, int price, String description, Categories categories) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.categories = categories;
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
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
    public Categories getCategories() {
        return categories;
    }

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