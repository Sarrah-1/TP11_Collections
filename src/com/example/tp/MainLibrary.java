package com.example.tp;

public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("123-1121112112", "Le Comte de AMINE BOUAALI", "MAROC");
        Book b2 = new Book("123-2222232222", "L'Étranger", "HATIM AMIN");
        User u1 = new User(101, "Sara");

        library.addBook(b1, 2);
        library.addBook(b2, 1);

        library.listAvailable();
        System.out.println();
        System.out.println("Emprunt de 'Le Comte de Monte-Cristo' par Sara : " + library.lendBook(u1, b1));
        library.listLoans(u1);
        System.out.println();

        library.listAvailable();
        System.out.println();
        System.out.println("Retour du livre par Sara : " + library.returnBook(u1, b1));
        library.listAvailable();
    }
}