//Student Name - S.R.S Fernando
//IIT Number - 2019404
//uow Number - w1809768


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Formula1ChampionshipManager implements ChampionshipManager {

    @Override
    public void createDriver(ArrayList<Formula1Driver> arr) {        //Make the createDriver method

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driver name : ");
        String driverName = input.next();

        System.out.println("Enter the driver location: ");
        String location = input.next();

        System.out.println("Enter the driver team: ");
        String team = input.next();

        Formula1Driver all = new Formula1Driver(driverName, location, team);   //Call the constructor for the driver details
        arr.add(all);

    }


    @Override
    public void deleteDriver(ArrayList<Formula1Driver> arr) {       //Make the deleteDriver method

        System.out.println("Driver Names are");
        for (int i = 0; i < arr.size(); i++) {

            System.out.println(" Driver " + i + " Named by : " + arr.get(i).getDriverName());   //Display the driver names

        }

        Scanner input = new Scanner(System.in);
        String deldriver;
        System.out.println("Enter the  driver name want to delete:");    //Enter the delete driver name
        deldriver = input.next();
        int driverPos = 0;
        boolean examining = false;

        for (int x = 0; x < arr.size(); x++) {
            if (deldriver.equals(arr.get(x).getDriverName())) {

                driverPos = x;

                System.out.println("Driver in list  " + x);             //Check the driver name whether the name is there or not
                examining = true;
            }
        }
        if (!examining) {

            System.out.println("There are no driver on that name \n Please enter the correct name again ! \n");

        }
        arr.remove(driverPos);                    //Using remove method for delete the driver
    }


    @Override
    public void changeDriver(ArrayList<Formula1Driver> arr) {        //Make the changeDriver method

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the team do want to change:");    //Enter the team name to user want to change
        String teamName = input.next();

        System.out.println("Enter the driver`new name : ");        //Add the new driver details
        String driverName = input.next();

        System.out.println("Enter the driver new location: ");
        String location = input.next();

        int driverpo = 0;
        boolean examining = false;

        for (int x = 0; x < arr.size(); x++) {
            if (teamName.equals(arr.get(x).getTeam())) {

                driverpo = x;

                examining = true;
            }
        }
        if (!examining) {

            System.out.println("There are no driver on that name \n Please enter the correct name again ! \n");

        }

        arr.get(driverpo).setDriverName(driverName);
        arr.get(driverpo).setLocation(location);
        arr.get(driverpo).setCurrentPoints(0);               //Set the new driver details for last array
        arr.get(driverpo).setParticipatedRaces(0);
        arr.get(driverpo).setFirstPosition(0);
        arr.get(driverpo).setSecondPosition(0);
        arr.get(driverpo).setThirdPosition(0);

    }


    @Override
    public void singledriverStats(ArrayList<Formula1Driver> arr) {    //Make the singerdriverStats method

        System.out.println("Driver Names are");
        for (int x = 0; x < arr.size(); x++) {

            System.out.println(" Driver " + x + " Named by : " + arr.get(x).getDriverName());  //Display the drivers

        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the driver name want to see his data:");   //Enter name to see the driver details
        String ffName = scan.next();

        int findDriver = 0;
        boolean Checker = false;
        for (int x = 0; x < arr.size(); x++) {
            if (ffName.equals(arr.get(x).getDriverName())) {
                findDriver = x;

                System.out.println(" Driver Name : " + arr.get(findDriver).getDriverName());
                System.out.println(" Driver Location :" + arr.get(findDriver).getLocation());
                System.out.println(" Driver Team : " + arr.get(findDriver).getTeam());
                System.out.println(" Driver Current Points: " + arr.get(findDriver).getCurrentPoints());
                System.out.println(" Races the driver participated: " + arr.get(findDriver).getParticipatedRaces()); //Display the single driver stats
                System.out.println(" Driver First Position Archived: " + arr.get(findDriver).getFirstPosition());
                System.out.println(" Driver Second Position Archived: " + arr.get(findDriver).getSecondPosition());
                System.out.println(" Driver Third Position Archived: " + arr.get(findDriver).getThirdPosition());
                System.out.println();
                Checker = true;
            }
        }
        if (Checker == false) {

            System.out.println("There are no Driver on that name \nPlease enter the correct name again !");   //Check the correct name whether its not run it again

        }
    }


    @Override
    public void displayingStats(ArrayList<Formula1Driver> arr) {    //Make the displayingStats method

        Formula1Driver[] point = new Formula1Driver[arr.size()];
        Formula1Driver temp;                                          //Perform the bubble sort

        for (int i = 0; i < arr.size(); i++) {                       //Access each array element

            point[i] = arr.get(i);
        }

        for (int j = 0; j < arr.size(); j++) {                      //Compare the array elements

            for (int k = j + 1; k < arr.size(); k++) {

                if (point[j].getCurrentPoints() < point[k].getCurrentPoints()) {

                    temp = point[j];
                    point[j] = point[k];
                    point[k] = temp;


                } else if (point[j].getCurrentPoints() == point[k].getCurrentPoints()) {

                    if (point[j].getFirstPosition() < point[k].getFirstPosition()) {

                        temp = point[j];
                        point[j] = point[k];
                        point[k] = temp;
                    }
                }
            }
        }

        //Display as a table using print formatter

        System.out.println("-     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -");
        System.out.printf("%11s %21s %21s %22s %25s %21s %23s %19s", "Name", "Location", "Team", "Points", "First positions", "Second positions", "Third position", "Number of Races");
        System.out.println();
        System.out.println("-     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -");
        for (int i = 0; i < arr.size(); i++) {

            System.out.format("%12s %20s %20s %20d %20d %20d %20d %20d", point[i].getDriverName(), point[i].getLocation(), point[i].getTeam(), point[i].getCurrentPoints(), point[i].getFirstPosition(), point[i].getSecondPosition(), point[i].getThirdPosition(), point[i].getParticipatedRaces());
            System.out.println();
        }
        System.out.println("-     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -     -     -     -     -      -     -     -");

    }


    @Override
    public void addaRace(ArrayList<Formula1Driver> arr, ArrayList<Race> rr) {  //Make the addRace method

        ArrayList<String> temp = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Day ( Date: ");   //Getting the full date
        int day = input.nextInt();

        System.out.println("Enter the month ( Month: ");
        int month = input.nextInt();

        System.out.println("Enter the year ( Year: ");
        int year = input.nextInt();


        System.out.println("Driver Names are");
        for (int i = 0; i < arr.size(); i++) {

            System.out.println(" Driver " + i + " Named by : " + arr.get(i).getDriverName());  //Display the all drivers

        }

        for (int i = 0; i < arr.size(); i++) {

            int races = arr.get(i).getParticipatedRaces();
            int raceplus = races + 1;
            arr.get(i).setParticipatedRaces(raceplus);

            String poDriver;
            System.out.println("Enter the name to add position :");
            poDriver = input.next();
            int x;
            int eleDriver = 0;
            boolean examining = false;

            for (x = 0; x < arr.size(); x++) {

                if (poDriver.equals(arr.get(x).getDriverName())) {

                    eleDriver = x;

                    examining = true;
                }
            }
            if (!examining) {

                System.out.println("There are no driver on that name \nPlease enter the correct name again ! \n");
                break;

            }

            System.out.println("Enter the driver won position (1/10) :");
            int poWon = input.nextInt();

            if (poWon == 1) {

                int one = arr.get(eleDriver).getCurrentPoints();
                int one1 = one + 25;
                arr.get(eleDriver).setCurrentPoints(one1);        // get the driver points and add the position 1 points 0+25 and set
                temp.add(arr.get(eleDriver).getDriverName());

                int count1 = arr.get(eleDriver).getFirstPosition();
                int countOne = count1 + 1;
                arr.get(eleDriver).setFirstPosition(countOne);

            } else if (poWon == 2) {

                int two = arr.get(eleDriver).getCurrentPoints();
                int two2 = two + 18;
                arr.get(eleDriver).setCurrentPoints(two2);
                temp.add(arr.get(eleDriver).getDriverName());

                int count2 = arr.get(eleDriver).getSecondPosition();
                int counttwo = count2 + 1;
                arr.get(eleDriver).setSecondPosition(counttwo);

            } else if (poWon == 3) {

                int three = arr.get(eleDriver).getCurrentPoints();
                int three3 = three + 15;
                arr.get(eleDriver).setCurrentPoints(three3);
                temp.add(arr.get(eleDriver).getDriverName());

                int count3 = arr.get(eleDriver).getThirdPosition();
                int countthree = count3 + 1;
                arr.get(eleDriver).setThirdPosition(countthree);

            } else if (poWon == 4) {

                int four = arr.get(eleDriver).getCurrentPoints();
                int four4 = four + 12;
                arr.get(eleDriver).setCurrentPoints(four4);
                temp.add(arr.get(eleDriver).getDriverName());

            } else if (poWon == 5) {

                int five = arr.get(eleDriver).getCurrentPoints();
                int five5 = five + 10;
                arr.get(eleDriver).setCurrentPoints(five5);
                temp.add(arr.get(eleDriver).getDriverName());

            } else if (poWon == 6) {

                int six = arr.get(eleDriver).getCurrentPoints();
                int six6 = six + 8;
                arr.get(eleDriver).setCurrentPoints(six6);
                temp.add(arr.get(eleDriver).getDriverName());

            } else if (poWon == 7) {

                int seven = arr.get(eleDriver).getCurrentPoints();
                int seven7 = seven + 6;
                arr.get(eleDriver).setCurrentPoints(seven7);
                temp.add(arr.get(eleDriver).getDriverName());

            } else if (poWon == 8) {

                int eight = arr.get(eleDriver).getCurrentPoints();
                int eight8 = eight + 4;
                arr.get(eleDriver).setCurrentPoints(eight8);
                temp.add(arr.get(eleDriver).getDriverName());

            } else if (poWon == 9) {

                int nine = arr.get(eleDriver).getCurrentPoints();
                int nine9 = nine + 2;
                arr.get(eleDriver).setCurrentPoints(nine9);
                temp.add(arr.get(eleDriver).getDriverName());

            } else if (poWon == 10) {

                int ten = arr.get(eleDriver).getCurrentPoints();
                int ten10 = ten + 1;
                arr.get(eleDriver).setCurrentPoints(ten10);
                temp.add(arr.get(eleDriver).getDriverName());

            }
        }
        Race r1 = new Race(year, month, day, temp);    //Call the race class for save the date
        rr.add(r1);
    }


    @Override
    public void storeProgram(ArrayList<Formula1Driver> arr) {  //Make the store method

        try {
            FileWriter myWriter = new FileWriter("F1 store.txt");    //Using file writer and add a text file for save the

            for (int i = 0; i < arr.size(); i++) {

                myWriter.write(arr.get(i).getDriverName() + " ");
                myWriter.write(arr.get(i).getLocation() + " ");
                myWriter.write(arr.get(i).getTeam() + " ");
                myWriter.write(arr.get(i).getCurrentPoints() + " ");  //get the data for txt file
                myWriter.write(arr.get(i).getFirstPosition() + " ");
                myWriter.write(arr.get(i).getSecondPosition() + " ");
                myWriter.write(arr.get(i).getThirdPosition() + " ");
                myWriter.write(arr.get(i).getParticipatedRaces() + "\n");

            }
            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    @Override
    public void loadProgram(ArrayList<Formula1Driver> arr) {      //Make the load method

        try {

            File fomula1details = new File("F1 store.txt");  //Get the same file for load
            Scanner reader = new Scanner(fomula1details);

            String name;
            String location;
            String team;
            int points;
            int num_of_racess;
            int f_position;
            int s_position;
            int t_position;


            while (reader.hasNext()) {

                name = reader.next();
                location = reader.next();
                team = reader.next();
                points = reader.nextInt();
                f_position = reader.nextInt();
                s_position = reader.nextInt();
                t_position = reader.nextInt();
                num_of_racess = reader.nextInt();

                Formula1Driver Driver = new Formula1Driver(name, team, location, f_position, s_position, t_position, points, num_of_racess);
                arr.add(Driver);
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    @Override
    public void storeProgram2(ArrayList<Race> rr) {    //Make the store method for date
        try {

            FileWriter myWriter = new FileWriter("F1 store 2.txt");   //creating a file writer and giving the path

            for (int i = 0; i < rr.size(); i++) {
                myWriter.write(i + "_" + rr.get(i).getYear());
                myWriter.write("_" + rr.get(i).getMonth());
                myWriter.write("_" + rr.get(i).getDate());
                myWriter.write("_" + rr.get(i).getArrrace().size());
                for (int k = 0; k < rr.get(i).getArrrace().size(); k++) {
                    myWriter.write("_" + rr.get(i).getArrrace().get(k));
                }

                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }


    @Override
    public void loadProgram2(ArrayList<Race> rr) {  //Make the Load method for date

        try {

            File fomula1details = new File("F1 store 2.txt");    //creating file called mydetails and setting the path
            Scanner reader = new Scanner(fomula1details);
            int year;
            int month;
            int day;

            while (reader.hasNextLine() != false) {

                ArrayList<String> Arrayrace = new ArrayList<>();
                String data = reader.nextLine();
                String[] splitRecords = data.split("_");
                year = Integer.parseInt(splitRecords[1]);
                month = Integer.parseInt(splitRecords[2]);
                day = Integer.parseInt(splitRecords[3]);
                int arrsize = Integer.parseInt(splitRecords[4]);
                for (int i = 0; i < arrsize; i++) {
                    String dname = splitRecords[i + 5];
                    Arrayrace.add(dname);
                }

                Race race = new Race(year, month, day, Arrayrace);
                rr.add(race);

            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}







