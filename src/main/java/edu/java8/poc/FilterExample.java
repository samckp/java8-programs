package edu.java8.poc;

import java.util.stream.Collectors;
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

        List<Product> productsList = initProduct();
        productsList.stream()
                .filter(p -> p.price < 30000)
                .map(pm -> pm.price)
                .forEach(System.out::println);

        // fetching filtered data as a list
        List<Float> productPriceList =
                productsList.stream()
                        .map(x->x.price)         // fetching price
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);

        //calculate average
        Double average = productsList.stream()
                .collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Average price is: "+average);

        //Count of  elements
        Long noOfElements = productsList.stream()
                .collect(Collectors.counting());
        System.out.println("Total elements : "+noOfElements);

    }

    public static List<Product> initProduct(){

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        return productsList;
    }
}
