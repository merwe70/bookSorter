import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //Book sınıfından nesneler üretiyoruz.

        Book b1 = new Book("Lord of the Rings",110,"J. R. R. Tolkien",1949);
        Book b2 = new Book("Harry Potter",120,"J. K. Rowling",1997);
        Book b3 = new Book("Game of Thrones",113,"George R. R. Martin",1996);
        Book b4 = new Book("Hobbit",90,"J. R. R. Tolkien",1976);
        Book b5 = new Book("Witcher",113,"Andrzej Sapkowski",1992);

        // İsime göre bir TreeSet listesi oluşturuyoruz.
        TreeSet<Book>booksName= new TreeSet<>();
        booksName.add(b1);
        booksName.add(b2);
        booksName.add(b3);
        booksName.add(b4);
        booksName.add(b5);
        System.out.println("-------Kitap İsmine Göre--------");
        System.out.println();

        for(Book book :booksName){
            System.out.println(book.infoBook());
        }
        System.out.println();

        // Sayfa sayısına göre bir TreeSet listesi oluşturuyoruz.

        TreeSet<Book> booksPageNumber = new TreeSet<>(new OrderByPageNumber());
        booksPageNumber.add(b1);
        booksPageNumber.add(b2);
        booksPageNumber.add(b3);
        booksPageNumber.add(b4);
        booksPageNumber.add(b5);
        System.out.println("-------Sayfa Numarasına Göre--------");
        System.out.println();

        for(Book book :booksPageNumber){
            System.out.println(book.infoBook());
        }
    }
}