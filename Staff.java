public class Staff {
    private final String name;
    private final String role; // Doctor, Nurse, Admin, etc.

    public Staff(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
