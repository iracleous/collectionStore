package gr.codehub.store;

import gr.codehub.store.model.Product;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(7);
        Product product2 = new Product();
        product2.setId(8);
        Product[] products = new Product[3];

        products[0]= product;
        products[1]= product2;
        products[2]= product;
     //   products[3]= product2;

        for(Product p:products){
            System.out.println("id= "+p.getId());
        }

        for (int i=0;i < products.length; i++){
            System.out.println("id= "+products[i].getId());
        }

        Arrays.stream(products).forEach(p -> System.out.println(p.getId()));

        System.out.println("Hello world!");
    }
}