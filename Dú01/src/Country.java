
public class Country {
    private String name;
    private int area;
    private int dateOfIndependence;


    public Country(String name, int area, int dateOfIndependence) {
        this.name = name;
        this.area = area;
        this.dateOfIndependence = dateOfIndependence;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", dateOfIndependence=" + dateOfIndependence +
                '}';
    }

    public void metod1() {
        System.out.println("Hold elections");
    }

    public void metod2() {
        System.out.println("Change social benefits");
    }

    public void metod3() {
        System.out.println("Increase spending on education");
    }
}