package organs;

import java.util.Scanner;

public class Stomach extends Organ{
    public Stomach(String name, String medicalCondition) {
        super(name, medicalCondition);
    }

    @Override
    public void organDetails() {
        super.organDetails();
        System.out.println("Need to be fed\n\t1.Digest");
        Scanner scanner= new Scanner(System.in);
        int ans= scanner.nextInt();
        if(ans==1){
            System.out.println("Digesting food");
        }
    }
}
