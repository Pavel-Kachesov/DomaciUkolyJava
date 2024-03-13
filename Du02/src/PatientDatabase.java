import java.util.HashSet;
import java.util.Set;

public class PatientDatabase {
    private Set<PatientInterface> patients;

    public PatientDatabase() {
        this.patients = new HashSet<>();
    }

    public void add(PatientInterface patientInterface) {
        this.patients.add(patientInterface);
    }

    public int getNumberOfPatients() {
        return this.patients.size();
    }

    public Set<PatientInterface> getPatientsByNameAndSecondName(String name, String secondname) {
        Set<PatientInterface> result = new HashSet<>();
        String resultError = "Mate chybu, tento pacient neexistuje.";
        for (PatientInterface patientInterface : this.patients) {
            if (patientInterface.getName().equals(name)) {
                if (patientInterface.getSecondName().equals(secondname)) {
                    result.add(patientInterface);
                }
            }
        }
        return result;
    }




    public double prumernyVek(){
        double prumer = 0;
        double sum = 0;
        for (PatientInterface patient: this.patients){
            prumer = getNumberOfPatients();
            sum += patient.getAge();
        }
        sum = sum/prumer;
        return sum;
    }



    @Override
    public String toString() {
        return "PatientDatabase{" +
                "patients=" + patients +
                '}';
    }
}
