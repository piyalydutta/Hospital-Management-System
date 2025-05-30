import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private final String name;
    private final List<Patient> patients;
    private final List<Staff> staffMembers;

    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
        this.staffMembers = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Staff> getStaffMembers() {
        return staffMembers;
    }

    public Patient findPatientByName(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Staff findDoctorByName(String name) {
        for (Staff s : staffMembers) {
            if (s.getRole().equalsIgnoreCase("Doctor") && s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }
}
