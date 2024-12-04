public class Patient {
    private int id;
    private String name;
    private int birthYear ;
    private double height ;
    private double weight ;
    private String bloodGroup;
    private String phoneNumber;

    public Patient(int id,String name,int birthYear,double height, double weight, String bloodGroup, String phoneNumber ){
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    public int getAge(int currentYear){
        return currentYear - birthYear;
    }

    public double getBMI() {
        if (this.height > 0 & this.weight > 0) {
            return this.weight / ((this.height / 100)*(this.height / 100));
        }
        else return 0.0;
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        if (getAge(currentYear) > 0) System.out.println("Patient Age: " + getAge(currentYear));
        else System.out.println("Patient Age: 0.0");
        if (height > 0) System.out.println("Patient Height (cm): " + height);
        else System.out.println("Patient Height (cm): 0.0");
        if (weight > 0) System.out.println("Patient Weight (kg): " + weight);
        else System.out.println("Patient Weight (kg): 0.0");
        System.out.println("Patient BloodGroup: " + bloodGroup);
        System.out.println("Patient PhoneNumber: " + phoneNumber);
        System.out.println("Patient BMI: " + getBMI());

}
}