public class HospitalManagementSystem {

    public static void main(String[] args) {
        Patient patient = new Patient("P1001", 30, "2025-05-01", "Fever", "Rafi", "Ahmed", "1995-02-15", "Male", "017XXXXXXXX");
        Doctor doctor = new Doctor("Mahmud", "Hossain", "1980-08-12", "Male", "015XXXXXXXX", "2010-01-01", "Senior Doctor", "General Medicine");
        Nurse nurse = new Nurse("Anika", "Sultana", "1990-11-22", "Female", "016XXXXXXXX", "2015-05-01", "Registered Nurse");

        doctor.prescribe(patient);
        nurse.recordVitals(patient);
    }
}

class Person {
    private String givenName;
    private String familyName;
    private String fullName;
    private String birthDate;
    private String gender;
    private String phone;

    public Person(String givenName, String familyName, String birthDate, String gender, String phone) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
        this.fullName = givenName + " " + familyName;
    }

    public String getFullName() {
        return fullName;
    }
}

class Patient extends Person {
    private String id;
    private int age;
    private String acceptedDate;
    private String sickness;

    public Patient(String id, int age, String acceptedDate, String sickness, String givenName, String familyName, String birthDate, String gender, String phone) {
        super(givenName, familyName, birthDate, gender, phone);
        this.id = id;
        this.age = age;
        this.acceptedDate = acceptedDate;
        this.sickness = sickness;
    }

    public String getSickness() {
        return sickness;
    }
}

class Staff extends Person {
    private String joinedDate;
    private String position;

    public Staff(String givenName, String familyName, String birthDate, String gender, String phone, String joinedDate, String position) {
        super(givenName, familyName, birthDate, gender, phone);
        this.joinedDate = joinedDate;
        this.position = position;
    }
}

class Doctor extends Staff {
    private String specialty;

    public Doctor(String givenName, String familyName, String birthDate, String gender, String phone, String joinedDate, String position, String specialty) {
        super(givenName, familyName, birthDate, gender, phone, joinedDate, position);
        this.specialty = specialty;
    }

    public void prescribe(Patient patient) {
        System.out.println("Dr. " + getFullName() + " is prescribing treatment for " + patient.getFullName() + " (Sickness: " + patient.getSickness() + ")");
    }
}

class Nurse extends Staff {
    public Nurse(String givenName, String familyName, String birthDate, String gender, String phone, String joinedDate, String position) {
        super(givenName, familyName, birthDate, gender, phone, joinedDate, position);
    }

    public void recordVitals(Patient patient) {
        System.out.println("Nurse " + getFullName() + " is recording vitals for patient " + patient.getFullName());
    }
}