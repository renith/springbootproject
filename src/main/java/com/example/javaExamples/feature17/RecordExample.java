package com.example.javaExamples.feature17;

record Product(int id, String name){

}
public class RecordExample {
    public static void main(String[] args) {

        Product product = new Product(1,"reni");
        System.out.println(product.id());
        System.out.println(product.name());

    }
}
