package com.model;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Sisteme eklendi: " + book.getTitle());
    }

    public void listBooks() {
        System.out.println("\n--- Güncel Kütüphane Kitap Listesi ---");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public void borrowBook(String isbn) {
        for (Book book : bookList) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true);
                    System.out.println(book.getTitle() + " başarıyla ödünç verildi.");
                } else {
                    System.out.println("Uyarı: Bu kitap başka birine ödünç verilmiştir.");
                }
                return;
            }
        }
        System.out.println("Hata: Kitap bulunamadı.");
    }
}
