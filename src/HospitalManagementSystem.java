public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Patient patient1 = new Patient("Reem", 30, "Female", "Flu");
        Patient patient2 = new Patient("Saud", 40, "Male", "Diabetes");

        Doctor doctor1 = new Doctor("Dr. Saleh", "Cardiology", 15);
        Doctor doctor2 = new Doctor("Dr. Lama", "Neurology", 20);

        Nurse nurse1 = new Nurse("Nurse Shahad", 10, "ICU");
        Nurse nurse2 = new Nurse("Nurse Ruwayda", 5, "Pediatrics");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addNurse(nurse1);
        hospital.addNurse(nurse2);

        hospital.listPatients();
        hospital.listDoctors();
        hospital.listNurses();
    }
}
