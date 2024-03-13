public class Main {
    public static void main(String[] args) {


        Patient patient1 = new Patient("Tomas",  "Wiktus", 34, "Pan", "Zdravi");
        Patient patient2 = new Patient("Viktor", "Berg", 44, "Pan", "Chronicka chripka");
        Patient patient3 = new Patient("Andrea",  "Prochazkova", 19, "Pani", "Zdrava");


        PatientDatabase patientDatabase = new PatientDatabase();

        patientDatabase.add(patient1);
        patientDatabase.add(patient2);
        patientDatabase.add(patient3);

        System.out.print("Pocet pacientu:");
        System.out.println(patientDatabase.getNumberOfPatients());



        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);

        System.out.println("Seznam pacientu:");
        System.out.println(patientDatabase);


        System.out.println(patientDatabase.prumernyVek());


        System.out.println(patientDatabase.getPatientsByNameAndSecondName("Viktor", "Berg"));

    }

}