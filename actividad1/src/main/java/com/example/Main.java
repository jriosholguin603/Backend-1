package com.example;

public class Main {
    public static void main(String[] args) {
        
        Product product1 = new Product("P101", "Laptop", 1200.0, 15);
        Product product2 = new Product("P102", "Mouse Inalámbrico", 25.0, 50);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(product1);
        System.out.println(product2);


        product1.setPrice(1100.0);
        product1.setStock(20);

        product2.setName("Mouse Gaming Ergónomico");
        product2.setPrice(35.5);

        System.out.println("\n--- VALORES OBTENIDOS CON GETTERS ---");
        
        System.out.println("Producto 1 - Nombre: " + product1.getName() + " | Nuevo Precio: $" + product1.getPrice());
        System.out.println("Producto 2 - Nombre: " + product2.getName() + " | Nuevo Precio: $" + product2.getPrice());

        System.out.println("\n--- ESTADO FINAL (toString) ---");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}