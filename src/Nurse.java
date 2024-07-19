public class Nurse {
    private String name;
    private int experience;
    private String department;

    public Nurse(String name, int experience, String department) {
        this.name = name;
        this.experience = experience;
        this.department = department;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("Nurse{name='%s', experience=%d, department='%s'}", name, experience, department);
    }
}