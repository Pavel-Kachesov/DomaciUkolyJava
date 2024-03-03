public class Writer {
    private String name;
    private City city;
    // city of birth
    private int DateOfBirth;
    // date of birth


    public Writer(String name, City city, int dateOfBirth) {
        this.name = name;
        this.city = city;
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name + '\'' +
                ", city=" + city +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }

    public void metod1() {
        System.out.println("Writing a book");
    }

    public void metod2() {
        System.out.println("Go to bed");
    }

    public void metod3() {
        System.out.println("Eat");
    }
}
