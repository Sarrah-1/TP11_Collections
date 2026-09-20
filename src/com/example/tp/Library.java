package com.example.tp;

import java.util.*;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final Map<Book, Integer> stock = new HashMap<>();
    private final Map<User, List<Book>> loans = new HashMap<>();
    public void addBook(Book b, int quantity) {
        if (!books.contains(b)) {
            books.add(b);
            stock.put(b, quantity);
        } else {
            stock.put(b, stock.get(b) + quantity);
        }
    }
    public boolean lendBook(User u, Book b) {
        Integer qty = stock.getOrDefault(b, 0);
        if (qty <= 0) return false;

        loans.computeIfAbsent(u, k -> new ArrayList<>());
        List<Book> userLoans = loans.get(u);

        if (!userLoans.contains(b)) {
            userLoans.add(b);
            stock.put(b, qty - 1);
            return true;
        }
        return false;
    }
    public boolean returnBook(User u, Book b) {
        List<Book> userLoans = loans.get(u);
        if (userLoans != null && userLoans.remove(b)) {
            stock.put(b, stock.getOrDefault(b, 0) + 1);
            return true;
        }
        return false;
    }
    public void listAvailable() {
        System.out.println("Livres disponibles en stock");
        stock.forEach((book, qty) -> {
            if (qty > 0) {
                System.out.println(book + " — Stock: " + qty);
            }
        });
    }
    public void listLoans(User u) {
        List<Book> userLoans = loans.getOrDefault(u, Collections.emptyList());
        System.out.println("Emprunts de " + u.getName());
        if (userLoans.isEmpty()) {
            System.out.println("(Aucun emprunt)");
        } else {
            userLoans.forEach(b -> System.out.println("- " + b));
        }
    }
}