# Library Management System
Console tabanlı basit bir Library Management System 

## 🚀 Özellikler
* **Mantıksal Ayrım (Separation of Concerns):** Veri modelleri (`Book`, `Member`) ile iş mantığı (`LibraryManager`) birbirinden ayrılmıştır.
* **Dinamik Veri Yönetimi:** Kitap envanteri, Java Collections framework'ünden `ArrayList` kullanılarak dinamik olarak yönetilmektedir.
* **İnteraktif CLI:** `Scanner`, `while` döngüsü ve `switch-case` yapıları kullanılarak sonsuz döngülü, kullanıcı dostu bir konsol menüsü tasarlanmıştır.
* **Temel İşlevler:**
  * Kütüphaneye yeni kitap ekleme.
  * Güncel kitap listesini ve anlık durumlarını (Mevcut / Ödünç Verildi) görüntüleme.
  * ISBN numarası baz alınarak kitap ödünç verme işlemleri.

 ## 🛠️ Kullanılan Teknolojiler
* Java (Core)
* Object-Oriented Programming (OOP)
* Git & GitHub

## 🖥️ Örnek Uygulama Çıktısı (Console Output)

Aşağıda uygulamanın temel akışını gösteren bir konsol çıktısı bulunmaktadır:

'''text
Sisteme eklendi: İnsanın Anlam Arayışı
Sisteme eklendi: Hamlet
Sisteme eklendi: Satranç
Sisteme eklendi: İrade Terbiyesi
Sisteme eklendi: Kendime Düşünceler
Sisteme eklendi: Sokrates'in Savunması
Sisteme eklendi: Savaş Sanatı
KÜTÜPHANE SİSTEMİNE HOŞ GELDİNİZ

--- MENÜ ---
1 - Kitap Ekle
2 - Kitapları Listele
3 - Kitap Ödünç Al
0 - Çıkış Yap
Lütfen bir işlem seçiniz: 1
Eklenecek Kitabın ISBN Numarası: 555
Kitabın Adı: Nutuk
Yazarın Adı: Atatürk
Sisteme eklendi: Nutuk

--- MENÜ ---
1 - Kitap Ekle
2 - Kitapları Listele
3 - Kitap Ödünç Al
0 - Çıkış Yap
Lütfen bir işlem seçiniz: 2

--- Güncel Kütüphane Kitap Listesi ---
ISBN: 978 | Kitap: İnsanın Anlam Arayışı | Yazar: Viktor E. Frankl | Durum: Mevcut
ISBN: 605 | Kitap: Hamlet | Yazar: William Shakespeare | Durum: Mevcut
ISBN: 206 | Kitap: Satranç | Yazar: Stefan Zweig | Durum: Mevcut
ISBN: 101 | Kitap: İrade Terbiyesi | Yazar: Jules Payot | Durum: Mevcut
ISBN: 201 | Kitap: Kendime Düşünceler | Yazar: Marcus Aerelius | Durum: Mevcut
ISBN: 301 | Kitap: Sokrates'in Savunması | Yazar: Platon | Durum: Mevcut
ISBN: 999 | Kitap: Savaş Sanatı | Yazar: Sun Tzu | Durum: Mevcut
ISBN: 555 | Kitap: Nutuk | Yazar: Atatürk | Durum: Mevcut

--- MENÜ ---
1 - Kitap Ekle
2 - Kitapları Listele
3 - Kitap Ödünç Al
0 - Çıkış Yap
Lütfen bir işlem seçiniz: 3
Ödünç Alınacak Kitabın ISBN Numarası: 555
Nutuk başarıyla ödünç verildi.

--- MENÜ ---
1 - Kitap Ekle
2 - Kitapları Listele
3 - Kitap Ödünç Al
0 - Çıkış Yap
Lütfen bir işlem seçiniz: 2

--- Güncel Kütüphane Kitap Listesi ---
ISBN: 978 | Kitap: İnsanın Anlam Arayışı | Yazar: Viktor E. Frankl | Durum: Mevcut
ISBN: 605 | Kitap: Hamlet | Yazar: William Shakespeare | Durum: Mevcut
ISBN: 206 | Kitap: Satranç | Yazar: Stefan Zweig | Durum: Mevcut
ISBN: 101 | Kitap: İrade Terbiyesi | Yazar: Jules Payot | Durum: Mevcut
ISBN: 201 | Kitap: Kendime Düşünceler | Yazar: Marcus Aerelius | Durum: Mevcut
ISBN: 301 | Kitap: Sokrates'in Savunması | Yazar: Platon | Durum: Mevcut
ISBN: 999 | Kitap: Savaş Sanatı | Yazar: Sun Tzu | Durum: Mevcut
ISBN: 555 | Kitap: Nutuk | Yazar: Atatürk | Durum: Ödünç Verildi

--- MENÜ ---
1 - Kitap Ekle
2 - Kitapları Listele
3 - Kitap Ödünç Al
0 - Çıkış Yap
Lütfen bir işlem seçiniz: 0
Sistemden çıkılıyor...

Process finished with exit code 0
'''
