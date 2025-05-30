import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital("City Hospital");

        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Record Treatment");
            System.out.println("4. View Patient History");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter patient name: ");
                    String pname = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    hospital.addPatient(new Patient(pname, age));
                    System.out.println("Patient added.");
                }

                case 2 -> {
                    System.out.print("Enter doctor name: ");
                    String dname = scanner.nextLine();
                    hospital.addStaff(new Staff(dname, "Doctor"));
                    System.out.println("Doctor added.");
                }

                case 3 -> {
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    Patient patient = hospital.findPatientByName(patientName);
                    if (patient == null) {
                        System.out.println("Patient not found.");
                        break;
                    }

                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();
                    Staff doctor = hospital.findDoctorByName(doctorName);
                    if (doctor == null) {
                        System.out.println("Doctor not found.");
                        break;
                    }

                    System.out.print("Enter treatment description: ");
                    String description = scanner.nextLine();

                    Treatment treatment = new Treatment(description, new Date(), doctor);
                    patient.addTreatment(treatment);
                    System.out.println("Treatment recorded.");
                }

                case 4 -> {
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    Patient p = hospital.findPatientByName(name);
                    if (p != null) {
                        System.out.println("\nTreatment History for " + p.getName() + ":");
                        for (Treatment t : p.getTreatments()) {
                            System.out.println("- " + t.getDate() + ": " + t.getDescription() +
                                    " (Doctor: " + t.getDoctor().getName() + ")");
                        }
                    } else {
                        System.out.println("Patient not found.");
                    }
                }

                case 0 -> {
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid option.");
            }
        }
    }
}
