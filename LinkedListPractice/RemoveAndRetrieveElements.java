package com.LinkedListPractice;

import java.util.LinkedList;
import java.util.List;

public class RemoveAndRetrieveElements {
    public static void main(String[] args) {
        LinkedList <String> clothes = new LinkedList<>(List.of("Shirt", "Jeans", "T-shirt", "Caps"));

        // Retrieve first item without removing
        System.out.println(clothes.peekFirst());
        // Retrieve last item without removing
        System.out.println(clothes.peekLast());
        // Remove first item
        clothes.pop();
        System.out.println(clothes);
        //Remove last item
        clothes.removeLast();
        System.out.println(clothes);

    }
}
