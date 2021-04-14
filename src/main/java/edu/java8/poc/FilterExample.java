package edu.java8.poc;

import java.util.ArrayList;
import java.util.List;

class Product{
      int prodId;
      String prodName;
      float price;

    public Product(int prodId, String prodName, float price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
}

public class FilterExample {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        productsList.stream()
                .filter(p -> p.price < 30000)
                .map(pm -> pm.price)
                .forEach(System.out::println);
    }
}
