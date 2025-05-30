import java.util.Date;

public class Treatment {
    private final String description;
    private final Date date;
    private final Staff doctor;

    public Treatment(String description, Date date, Staff doctor) {
        this.description = description;
        this.date = date;
        this.doctor = doctor;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Staff getDoctor() {
        return doctor;
    }
}
