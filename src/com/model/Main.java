package com.model;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        library.addBook(new Book("978", "İnsanın Anlam Arayışı", "Viktor E. Frankl"));
        library.addBook(new Book("605", "Hamlet", "William Shakespeare"));
        library.addBook(new Book("206", "Satranç", "Stefan Zweig"));
        library.addBook(new Book("101", "İrade Terbiyesi", "Jules Payot"));
        library.addBook(new Book("201", "Kendime Düşünceler", "Marcus Aerelius"));
        library.addBook(new Book("301", "Sokrates'in Savunması", "Platon"));
        library.addBook(new Book("999", "Savaş Sanatı", "Sun Tzu"));

        library.listBooks();

        System.out.println("\n'101' ISBN numaralı kitap isteniyor...");
        library.borrowBook("101");

        System.out.println("\n'000' ISBN  numaralı olmayan bir kitap isteniyor...");
        library.borrowBook("000");

        library.listBooks();
    }
}
