package homework1.StringArray;

class Author {
    private String name;
    private BookAuthor[] books;
    private long id;

    public String getName() {
        return name;
    }

    public BookAuthor[] getBooks() {
        return books;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(BookAuthor[] books) {
        this.books = books;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Id: " + this.id;
    }
}


public class BookAuthor {
    private String title;
    private Author author;
    private int pages;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString(){
        return "Title: " + this.title + ", Author: " + this.author.getName() + ", Pages: " + this.pages + ", Price: " + this.price;
    }
}
