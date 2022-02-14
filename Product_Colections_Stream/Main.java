package Product_Colections_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Product beef = new Product("Beef", 275, "Fresh", Categories.MEAT);
        Product trout = new Product("Trout", 170, "Fresh", Categories.FISH);
        Product cheese = new Product("Cheese", 130, "Spoiled", Categories.MILK);
        Product сhicken = new Product("Сhicken", 300, "Fresh", Categories.MEAT);
        Product tuna = new Product("Tuna", 175, "Fresh", Categories.FISH);
        Product kefir = new Product("Kefir", 120, "Spoiled", Categories.MILK);
        Product pork = new Product("Pork", 525, "Fresh", Categories.MEAT);
        Product salmom = new Product("Salmom", 340, "Spoiled", Categories.FISH);


        List<Product> prod = Arrays.asList(beef,trout,cheese,сhicken,tuna,kefir,pork,salmom);

        List<Product> meat = prod.stream().filter(x -> x.getCategories().equals(Categories.MEAT)).collect(Collectors.toList());
        List<Product> fish = prod.stream().filter(x -> x.getCategories().equals(Categories.FISH)).collect(Collectors.toList());
        List<Product> milk = prod.stream().filter(x -> x.getCategories().equals(Categories.MILK)).collect(Collectors.toList());

        int veryLowPrice = 150;
        String fresh = "Spoiled";

        List<Product> lowPrice = prod.stream().filter(y -> y.getPrice() < veryLowPrice).collect(Collectors.toList());
        List<Product> consistFreshWord = prod.stream().filter(y -> y.getDescription().contains(fresh)).collect(Collectors.toList());
        List<Product> sortedByPrice = prod.stream().sorted(Comparator.comparing(Product::getPrice)).collect(Collectors.toList());


        System.out.println("Товари з категорії М’ясо: " + meat);
        System.out.println("Товари з категорії Риба: " + fish);
        System.out.println("Товари з категорії Молочні продукти: " + milk);

        System.out.println("Товари за доступною ціною: " + lowPrice.size() + " шт.");
        System.out.println("Зіпсовані продукти: " + consistFreshWord.size() + " шт.");

        System.out.println("Відсортовано по ціні: " + sortedByPrice);


        //products.stream().filter(x -> x.getPrice() < 150).forEach(System.out::println);
        //products.stream().filter(y -> y.getDescription().contains("Fresh")).forEach(System.out::println);

        //int sumPrice = products.stream().collect(Collectors.summingInt(Product::getPrice));
        //List<Product> m = products.stream().filter(y -> y.getDescription().contains("Spoiled")).collect(Collectors.toList());
        //boolean n = products.stream().anyMatch(c -> c.getCategories().equals(Categories.FISH));
        //System.out.println(n);

    }
}



