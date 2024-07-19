public class Doctor {
    private String name;
    private String specialty;
    private int experience;

    public Doctor(String name, String specialty, int experience) {
        this.name = name;
        this.specialty = specialty;
        this.experience = experience;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Doctor{name='%s', specialty='%s', experience=%d}", name, specialty, experience);
    }
}