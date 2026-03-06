package com.model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        library.addBook(new Book("978", "İnsanın Anlam Arayışı", "Viktor E. Frankl"));
        library.addBook(new Book("605", "Hamlet", "William Shakespeare"));
        library.addBook(new Book("206", "Satranç", "Stefan Zweig"));
        library.addBook(new Book("101", "İrade Terbiyesi", "Jules Payot"));
        library.addBook(new Book("201", "Kendime Düşünceler", "Marcus Aerelius"));
        library.addBook(new Book("301", "Sokrates'in Savunması", "Platon"));
        library.addBook(new Book("999", "Savaş Sanatı", "Sun Tzu"));

        System.out.println("KÜTÜPHANE SİSTEMİNE HOŞ GELDİNİZ");

        while (isRunning) {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1 - Kitap Ekle");
            System.out.println("2 - Kitapları Listele");
            System.out.println("3 - Kitap Ödünç Al");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Lütfen bir işlem seçiniz: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Eklenecek Kitabın ISBN Numarası: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Kitabın Adı: ");
                    String title = scanner.nextLine();
                    System.out.print("Yazarın Adı: ");
                    String author = scanner.nextLine();

                    library.addBook(new Book(isbn, title, author));
                    break;

                case "2":
                    library.listBooks();
                    break;

                case "3":
                    System.out.print("Ödünç Alınacak Kitabın ISBN Numarası: ");
                    String borrowIsbn = scanner.nextLine();
                    library.borrowBook(borrowIsbn);
                    break;

                case "0":
                    System.out.println("Sistemden çıkılıyor...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Hatalı Giriş! Lütfen 0 ile 3 arasında bir seçim yapınız.");
                    break;
            }
        }


/*
        library.listBooks();

        System.out.println("\n'101' ISBN numaralı kitap isteniyor...");
        library.borrowBook("101");

        System.out.println("\n'000' ISBN  numaralı olmayan bir kitap isteniyor...");
        library.borrowBook("000");

        library.listBooks();

 */

        scanner.close();
    }
}
