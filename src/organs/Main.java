package organs;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        this is the eye organ
        Eye left = new Eye("Left eye", "Short sighted", "blue");
        Eye right = new Eye("Right eye", "Short sighted", "blue");
//        heart details
        Heart heart = new Heart("Heart", "Normal", 65);
//        stomach
        Stomach stomach= new Stomach("Stomach","FUD");
        Organ skin= new Organ("Skin","Burned");
//        i am declareing the patient over here
        Patient patient = new Patient("Tom", 25, left, right, heart, stomach, skin);
        patient.patientDetails();

        while (true) {
            System.out.println("Choose an Organ: \n" +
                    "\t1. Left eye\n" +
                    "\t2. Right eye\n" +
                    "\t3. Heart\n" +
                    "\t4. Stomach\n" +
                    "\t5. Skin\n" +
                    "\t6. Quit");
            Scanner scanner = new Scanner(System.in);
            int choice=scanner.nextInt();
            if (choice==6){
                break;
            }else {
                switch (choice) {
                    case 1:
                        left.organDetails();
                        break;
                    case 2:
                        right.organDetails();
                        break;
                    case 3:
                        heart.organDetails();
                        break;
                    case 4:
                        stomach.organDetails();
                        break;
                    case 5:
                        skin.organDetails();
                        break;
                    case 6:
                        System.out.println("you are welcome");
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }


        }


    }

}