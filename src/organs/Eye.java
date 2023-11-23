package organs;

import java.util.Scanner;

public class Eye extends Organ{
    private String color;

    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void organDetails() {
        Scanner scanner= new Scanner(System.in);
        super.organDetails();
        System.out.println("Color: "+ getColor());
        System.out.println("\t1. Close eye: ");
        int ans=scanner.nextInt();
        if (ans==1){
            System.out.println("Eye closed");
        }


    }
}
