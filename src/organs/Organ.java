package organs;

public class Organ {
    private String name;
    private String medicalCondition;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public void organDetails(){
        System.out.println("Organ: "+this.name +"\nMedical Condition: "+ this.medicalCondition);
    }
}
