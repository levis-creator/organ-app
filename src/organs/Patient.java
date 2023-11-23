package organs;

public class Patient {
    private String name;
    private  int age;
    private  Eye leftEye;
    private  Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private  Organ skin;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Organ skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public void patientDetails(){
        System.out.println("Patient name: "+this.name+"\nAge: "+this.age);
    }

}
