package Product;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product Beef = new Product("Beef", 275, "Fresh", Categories.MEAT);
        Product Trout = new Product("Trout", 170, "Fresh", Categories.FISH);
        Product Cheese = new Product("Cheese", 130, "NotFresh", Categories.MILK);
        Product Сhicken = new Product("Сhicken", 300, "Fresh", Categories.MEAT);
        Product Tuna = new Product("Tuna", 195, "Fresh", Categories.FISH);
        Product Kefir = new Product("Kefir", 120, "NotFresh", Categories.MILK);
        Product Pork = new Product("Pork", 525, "Fresh", Categories.MEAT);
        Product Salmom = new Product("Salmom", 340, "Fresh", Categories.FISH);


        Product[] products = {Beef, Trout, Cheese, Сhicken, Tuna, Kefir, Pork, Salmom};

        Product[] MEAT = new Product[products.length];
        Product[] FISH = new Product[products.length];
        Product[] MILK = new Product[products.length];

        int SmallPrice = 175;
        int NeedPrice = 0;
        int NeedWord = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategories().equals(Categories.MEAT)) {
                MEAT[i] = products[i];
            }
            if (products[i].getCategories().equals(Categories.FISH)) {
                FISH[i] = products[i];
            }
            if (products[i].getCategories().equals(Categories.MILK)) {
                MILK[i] = products[i];
            }

            if (products[i].getPrice() < SmallPrice){
                NeedPrice = NeedPrice + 1;
            }
            if (products[i].getDescription().equals("NotFresh")){
                NeedWord = NeedWord + 1;
            }

        }
        System.out.println("Категорія м’ясо: " + Arrays.toString(MEAT));
        System.out.println("Категорія риба: " + Arrays.toString(FISH));
        System.out.println("Категорія молоко: " + Arrays.toString(MILK));
        System.out.println("Ціна менше 170 грн: " + NeedPrice);
        System.out.println("Кількість несвіжих продуктів: " + NeedWord);
    }
}
