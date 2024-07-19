import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Nurse> nurses;

    public Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.nurses = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    public void listPatients() {
        System.out.println("List of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void listDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void listNurses() {
        System.out.println("List of Nurses:");
        for (Nurse nurse : nurses) {
            System.out.println(nurse);
        }
    }

    public static void main(String[] args) {
        // Create a hospital instance
        Hospital hospital = new Hospital();

        // Create and add patients
        Patient patient1 = new Patient("Reem", 30, "Female", "Flu");
        Patient patient2 = new Patient("Saud", 40, "Male", "Diabetes");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Create and add doctors
        Doctor doctor1 = new Doctor("Dr. Saleh", "Cardiology", 15);
        Doctor doctor2 = new Doctor("Dr. Lama", "Neurology", 20);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Create and add nurses
        Nurse nurse1 = new Nurse("Nurse Shahad", 10, "ICU");
        Nurse nurse2 = new Nurse("Nurse Ruwayda", 5, "Pediatrics");
        hospital.addNurse(nurse1);
        hospital.addNurse(nurse2);

        // List all patients, doctors, and nurses
        hospital.listPatients();
        hospital.listDoctors();
        hospital.listNurses();
    }
}