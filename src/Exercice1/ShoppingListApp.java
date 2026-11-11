package Exercice1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("Accessoires");
        shoppingList.add("Vetement");
        shoppingList.add("Legumes");
        
        System.out.println("Articles de la liste :");
        for (String item : shoppingList) {
            System.out.println("- " + item);
        }
        shoppingList.remove("Lait");
        boolean hasAccessoires = shoppingList.contains("Accessoires");
        System.out.println("Contient des Accessoires ? " + hasAccessoires);
        System.out.println("Taille finale de la liste : " + shoppingList.size());
    }
}

