import java.util.Comparator;

public class OrderByPageNumber  implements Comparator<Book> {
//Comparator Interface'inden sayfa saysısı sıralayan metodu override ediyoruz.
    @Override
    public int  compare(Book o,Book o2) {
        int pageNumberCompare = o2.getPageNumber()- o.getPageNumber();
        // sayfa sayıları aynı iste alfabetik bir sıralama yaptırıyoruz.
        if(pageNumberCompare == 0){
            return o.getName().compareTo(o2.getName());
        }
        return pageNumberCompare;
    }
}
