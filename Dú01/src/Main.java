public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Pages", 1955, 123000);
        Country country = new Country("USA", 9834, 1776);
        City city = new City("New York", country, 784);
        Writer writer = new Writer("Arlu Puro", city, 1890);
        Book book = new Book("Good things", publisher, writer );

        System.out.println(publisher);
        publisher.metod1();
        publisher.metod2();
        publisher.metod3();

        System.out.println(country);
        country.metod1();
        country.metod3();
        country.metod2();

        System.out.println(city);
        city.metod1();
        city.metod2();
        city.metod3();

        System.out.println(writer);
        writer.metod1();
        writer.metod2();
        writer.metod3();

        System.out.println(book);
        book.metod1();
        book.metod2();
        book.metod3();

    }
}