public class Publisher {
    private String name;
    private int established;
    private double capitalisation;

    public Publisher(String name, int established, double capitalisation) {
        this.name = name;
        this.established = established;
        this.capitalisation = capitalisation;
    }


    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", established=" + established +
                ", capitalisation=" + capitalisation +
                '}';
    }

    public void metod1() {
        System.out.println("Release a book");
    }

    public void metod2() {
        System.out.println("Use advertising");
    }

    public void metod3() {
        System.out.println("Stop releasing the book");
    }


}

