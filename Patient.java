import java.util.ArrayList;
import java.util.List;

public class Patient {
    private final String name;
    private final int age;
    private final List<Treatment> treatments;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.treatments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }
}
