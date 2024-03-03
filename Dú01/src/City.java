public class City {
    private String name;
    private Country country;
    private int area;

    public City(String name, Country country, int area) {
        this.name = name;
        this.country = country;
        this.area = area;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", area=" + area +
                '}';
    }

    public void metod1() {
        System.out.println("Build new buildings");
    }

    public void metod2() {
        System.out.println("Demolish the buildings");
    }

    public void metod3() {
        System.out.println("Organize a protest");
    }

}

