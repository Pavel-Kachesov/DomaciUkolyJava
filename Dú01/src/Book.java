public class Book {
    private String name;
    private Publisher publisher;
    private Writer writer;

    public Book(String name, Publisher publisher, Writer writer) {
        this.name = name;
        this.publisher = publisher;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publisher=" + publisher +
                ", writer=" + writer +
                '}';
    }
    public void openBook(){

    }

    public void metod1() {
        System.out.println("Open the book");
    }

    public void metod2() {
        System.out.println("Close the book");
    }

    public void metod3() {
        System.out.println("Skip a page in the book");
    }


}
