package organs;

import java.util.Scanner;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    @Override
    public void organDetails() {
        super.organDetails();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Heart rate: "+getHeartRate());
        System.out.println("\t1. Change heart rate");
        int ans=scanner.nextInt();
        if (ans==1){
            System.out.print("Enter the new Heart rate: ");
            int hrtRate=scanner.nextInt();
            setHeartRate(hrtRate);
            System.out.println("heart rate set successfully to "+ getHeartRate());
        }
    }

}
