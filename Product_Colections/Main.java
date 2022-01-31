package Product_Colections;

import java.util.ArrayList;
import java.util.Collections;

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


        ArrayList<Product> products = new ArrayList<>();

        ArrayList<Product> meat = new ArrayList<>();
        ArrayList<Product> fish = new ArrayList<>();
        ArrayList<Product> milk = new ArrayList<>();

        ArrayList<Product> lowPrice = new ArrayList<>();
        ArrayList<Product> consistFreshWord = new ArrayList<>();

        int verylowPrice = 150;
        String fresh = "Spoiled";

        products.add(beef);
        products.add(trout);
        products.add(cheese);
        products.add(сhicken);
        products.add(tuna);
        products.add(kefir);
        products.add(pork);
        products.add(salmom);

        for (Product product:products) {
            if (product.getCategories().equals(Categories.MEAT)){
                meat.add(product);
            }
            if (product.getCategories().equals(Categories.FISH)){
                fish.add(product);
            }
            if (product.getCategories().equals(Categories.MILK)){
                milk.add(product);
            }
            if (product.getPrice() < verylowPrice){
                lowPrice.add(product);
            }
            if (product.getDescription().contains(fresh)){
                consistFreshWord.add(product);
            }
        }

        Collections.sort(products);
        System.out.println(products);

        System.out.println("Товари з категорії М’ясо: " + meat);
        System.out.println("Товари з категорії Риба: " + fish);
        System.out.println("Товари з категорії Молочні продукти: " + milk);

        System.out.println("Товари за доступною ціною: " + lowPrice.size() + " шт.");
        System.out.println("Зіпсовані продукти: " + consistFreshWord.size() + " шт.");

        Collections.sort(products);
        System.out.println(products);
    }
}
