public class Patient implements PatientInterface {
    private String name;
    private String secondname;
    private double age;
    private String gender;
    private String zaznam;

    public Patient(String name, String secondname, double age, String gender, String zaznam){
        this.name = name;
        this.secondname = secondname;
        this.age = age;
        this.gender = gender;
        this.zaznam = zaznam;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSecondName() {
        return this.secondname;
    }

    @Override
    public double getAge() {
        return this.age;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getLekarZaznam() {
        return this.zaznam;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", zaznam='" + zaznam + '\'' +
                '}';
    }
}
