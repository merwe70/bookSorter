public class Book implements Comparable<Book> {
    String name;
    int pageNumber;
    String authorName;
    int publicationDate;

    public Book(String name, int pageNumber, String authorName, int publicationDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    // Comparable Interface'inden alfabetik sıralama metodunu override ediyoruz.
    @Override
    public int compareTo(Book otherBook) {
        // Kitapları A'dan Z'ye isme göre sırala
        return this.getName().compareTo(otherBook.getName());
    }


    public String infoBook(){
        return "Kitabın Adı : " + getName() +
                " -\tKitabın Sayfa Sayısı : " + getPageNumber() +
                " -\tKitabın Yazarı : " + getAuthorName() +
                " -\tKitabın Basım Tarihi : " + getPublicationDate()+
                "\n---------------------------------------------------------------------------------------------------------------------------------";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
}
