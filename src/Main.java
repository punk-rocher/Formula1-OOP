//Student Name - S.R.S Fernando
//IIT Number - 2019404
//uow Number - w1809768


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Formula1Driver> arr = new ArrayList<Formula1Driver>();         // Use  the arraylist  for FormulaDriver

        ArrayList<Race> rr = new ArrayList<>();                                  // Use  the arraylist for Race class

        Formula1ChampionshipManager method = new Formula1ChampionshipManager();  //Make a object for Formula1 champion ship

        F1interface f1interface = new F1interface();                             //Make a object for gui

        while (true) {                                                          //Create a while loop for menu

            System.out.println("<<<<<<<<       Formula 1 racing car championship       >>>>>>>>");
            System.out.println("<<<<<<<< - - - - - - - - - - >>>>>>>>\n");
            System.out.println("A: Create a new driver" + ".");
            System.out.println("D: Delete the driver.");
            System.out.println("C: Change the driver.");
            System.out.println("F: Display the driver statistics of the existing. ");
            System.out.println("E: Display the all drivers statistics.");
            System.out.println("R: Add a race.");
            System.out.println("S: Store program data in to file.");
            System.out.println("L: Load program data from file.");
            System.out.println("G: Visit to Graphical User Interface (GUI).");
            System.out.println("<<<<<<<< - - - - - - - - - - >>>>>>>>\n");

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter to Get starts -: ");

            char menu = scan.next().charAt(0);

            switch (menu) {       //Use the switch method
                case 'A':
                case 'a':
                    method.createDriver(arr);
                    break;
                case 'D':
                case 'd':
                    method.deleteDriver(arr);
                    break;
                case 'C':
                case 'c':
                    method.changeDriver(arr);
                    break;
                case 'F':
                case 'f':
                    method.singledriverStats(arr);
                    break;
                case 'E':
                case 'e':
                    method.displayingStats(arr);
                    break;
                case 'R':
                case 'r':
                    method.addaRace(arr, rr);
                    break;
                case 'S':
                case 's':
                    method.storeProgram(arr);
                    method.storeProgram2(rr);
                    break;
                case 'L':
                case 'l':
                    method.loadProgram(arr);
                    method.loadProgram2(rr);
                    break;
                case 'G':
                case 'g':
                    f1interface.viewFrame(arr, rr);
                    break;
                default:
                    System.out.println(" Invalid Character ");
                    break;
            }
        }
    }
}
