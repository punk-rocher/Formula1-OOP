//Student Name - S.R.S Fernando
//IIT Number - 2019404
//uow Number - w1809768

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;


public class F1interface {

    JFrame j = new JFrame("F1 Championship");    //Get a JFrame as F1 championship

    void viewFrame(ArrayList<Formula1Driver> arr, ArrayList<Race> rr) {

        JButton button1 = new JButton(" \uD83C\uDFC1 Championship drivers descending Order");
        JButton button2 = new JButton(" \uD83C\uDFC1 Championship drivers ascending Order");
        JButton button3 = new JButton(" \uD83C\uDFC1 Championship first position ascending Order");
        JButton button4 = new JButton(" \uD83C\uDFC1 Championship random race generator");
        JButton button5 = new JButton(" \uD83C\uDFC1 Championship results");
        JButton button6 = new JButton(" \uD83C\uDFC1 Championship ascending for the data");
        JButton button7 = new JButton(" \uD83C\uDFC1 Search");

        button1.setBounds(80, 60, 400, 25);  //Set bounds for  buttons
        j.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driversDescendingOrder(arr);
            }
        });


        button2.setBounds(80, 120, 400, 25);
        j.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                driversAscendingOrder(arr);
            }
        });


        button3.setBounds(80, 180, 400, 25);
        j.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstpositionAscending(arr);
            }
        });


        button4.setBounds(80, 240, 400, 25);
        j.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomRace(arr, rr);

            }
        });


        button5.setBounds(80, 300, 400, 25);
        j.add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                championshipresults(arr, rr);

            }
        });


        button6.setBounds(80, 360, 400, 25);
        j.add(button6);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ascendingDate(rr);

            }
        });

        button7.setBounds(80, 420, 400, 25);
        j.add(button7);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search(arr);
            }
        });

        button1.setBackground(Color.yellow);
        button2.setBackground(Color.yellow);  //add a colours for buttons
        button3.setBackground(Color.yellow);
        button4.setBackground(Color.yellow);
        button5.setBackground(Color.yellow);
        button6.setBackground(Color.yellow);
        button7.setBackground(Color.yellow);

        j.setSize(600, 550);
        j.setLayout(null);
        j.setVisible(true);                  //Visible the j frame

    }


    private void driversDescendingOrder(ArrayList<Formula1Driver> arr) {   //Make the driver descendingOrder method

        j = new JFrame();      //Create a new j frame

        Formula1Driver[] point = new Formula1Driver[arr.size()];
        Formula1Driver temp;                                          //perform the bubble short

        for (int i = 0; i < arr.size(); i++) {

            point[i] = arr.get(i);
        }

        for (int j = 0; j < arr.size(); j++) {                      //Loop compare to array elements

            for (int k = j + 1; k < arr.size(); k++) {

                if (point[j].getCurrentPoints() < point[k].getCurrentPoints()) {

                    temp = point[j];
                    point[j] = point[k];
                    point[k] = temp;

                }
            }
        }

        String rowviewData[][] = new String[arr.size()][6];
        for (int i = 0; i < arr.size(); i++) {

            rowviewData[i][0] = point[i].getDriverName();
            rowviewData[i][1] = point[i].getTeam();
            rowviewData[i][2] = Integer.toString(point[i].getCurrentPoints());
            rowviewData[i][3] = Integer.toString(point[i].getFirstPosition());
            rowviewData[i][4] = Integer.toString(point[i].getSecondPosition());
            rowviewData[i][5] = Integer.toString(point[i].getThirdPosition());

            System.out.println("");

        }

        String coloumViewData[] = {"Name", "Team", "Current Points", "First Position", "Second Position", "Third Position"};

        JTable jTable1 = new JTable(rowviewData, coloumViewData);
        jTable1.setBounds(80, 100, 150, 50);
        JScrollPane p1 = new JScrollPane(jTable1);
        j.add(p1);
        j.setSize(650, 400);
        j.setVisible(true);

        jTable1.setGridColor(Color.magenta);
        jTable1.setBackground(Color.yellow);
    }


    private void driversAscendingOrder(ArrayList<Formula1Driver> arr) {      //Make the driver AscendingOrder method

        j = new JFrame();     //create a new j frame

        Formula1Driver[] point = new Formula1Driver[arr.size()];
        Formula1Driver temp;

        for (int i = 0; i < arr.size(); i++) {

            point[i] = arr.get(i);
        }

        for (int j = 0; j < arr.size(); j++) {

            for (int k = j + 1; k < arr.size(); k++) {

                if (point[j].getCurrentPoints() > point[k].getCurrentPoints()) {

                    temp = point[j];
                    point[j] = point[k];
                    point[k] = temp;

                }
            }
        }

        String rowviewData[][] = new String[arr.size()][6];
        for (int i = 0; i < arr.size(); i++) {

            rowviewData[i][0] = point[i].getDriverName();
            rowviewData[i][1] = point[i].getTeam();
            rowviewData[i][2] = Integer.toString(point[i].getCurrentPoints());
            rowviewData[i][3] = Integer.toString(point[i].getFirstPosition());
            rowviewData[i][4] = Integer.toString(point[i].getSecondPosition());
            rowviewData[i][5] = Integer.toString(point[i].getThirdPosition());

            System.out.println("");

        }

        String coloumViewData[] = {"Name", "Team", "Current Points", "First Position", "Second Position", "Third Position"};

        JTable jTable1 = new JTable(rowviewData, coloumViewData);
        jTable1.setBounds(80, 100, 150, 50);
        JScrollPane p1 = new JScrollPane(jTable1);
        j.add(p1);
        j.setSize(650, 400);
        j.setVisible(true);

        jTable1.setGridColor(Color.magenta);
        jTable1.setBackground(Color.yellow);

    }


    private void firstpositionAscending(ArrayList<Formula1Driver> arr) {      //Make the driver first position Ascending method

        j = new JFrame();   //Create a new j frame

        Formula1Driver[] point = new Formula1Driver[arr.size()];
        Formula1Driver temp;

        for (int i = 0; i < arr.size(); i++) {     //

            point[i] = arr.get(i);
        }
        for (int j = 0; j < arr.size(); j++) {

            for (int k = j + 1; k < arr.size(); k++) {


                if (point[j].getFirstPosition() < point[k].getFirstPosition()) {

                    temp = point[j];        //Swap elem
                    point[j] = point[k];
                    point[k] = temp;
                }
            }
        }

        String rowviewData[][] = new String[arr.size()][6];
        for (int i = 0; i < arr.size(); i++) {

            rowviewData[i][0] = point[i].getDriverName();
            rowviewData[i][1] = point[i].getTeam();
            rowviewData[i][2] = Integer.toString(point[i].getCurrentPoints());
            rowviewData[i][3] = Integer.toString(point[i].getFirstPosition());
            rowviewData[i][4] = Integer.toString(point[i].getSecondPosition());
            rowviewData[i][5] = Integer.toString(point[i].getThirdPosition());

            System.out.println("");

        }
        String coloumViewData[] = {"Name", "Team", "Current Points", "First Position", "Second Position", "Third Position"};

        JTable jTable1 = new JTable(rowviewData, coloumViewData);
        jTable1.setBounds(80, 100, 150, 50);
        JScrollPane p1 = new JScrollPane(jTable1);
        j.add(p1);
        j.setSize(650, 400);
        j.setVisible(true);

        jTable1.setGridColor(Color.magenta);
        jTable1.setBackground(Color.yellow);

    }


    private void randomRace(ArrayList<Formula1Driver> arr, ArrayList<Race> rr) {   //Make the random race method

        j = new JFrame();

        ArrayList<String> temp = new ArrayList<>();

        GregorianCalendar gc = new GregorianCalendar();    //https://stackoverflow.com/questions/3985392/generate-random-date-of-birth/3985644
        int year = 2021;
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        String date = (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
        Collections.shuffle(arr);

        for (int i = 0; i < arr.size(); i++) {

            int races = arr.get(i).getParticipatedRaces();
            int raceplus = races + 1;
            arr.get(i).setParticipatedRaces(raceplus);

        }

        for (int j = 0; j < arr.size(); j++) {

            temp.add(arr.get(j).getDriverName());

        }

        for (int i = 0; i < arr.size(); i++) {

            if (i == 0) {
                int first = arr.get(i).getCurrentPoints();
                int pointplusone = first + 25;
                arr.get(i).setCurrentPoints(pointplusone);

                int firstpo = arr.get(i).getFirstPosition();
                int posiplusOne = firstpo + 1;
                arr.get(i).setFirstPosition(posiplusOne);

            } else if (i == 1) {
                int second = arr.get(i).getCurrentPoints();
                int pointplustwo = second + 18;
                arr.get(i).setCurrentPoints(pointplustwo);

                int secondpo = arr.get(i).getSecondPosition();
                int posiplusTwo = secondpo + 1;
                arr.get(i).setSecondPosition(posiplusTwo);

            } else if (i == 2) {
                int third = arr.get(i).getCurrentPoints();
                int pointplusthree = third + 15;
                arr.get(i).setCurrentPoints(pointplusthree);

                int thirdpo = arr.get(i).getThirdPosition();
                int posiplusthree = thirdpo + 1;
                arr.get(i).setThirdPosition(posiplusthree);

            } else if (i == 3) {
                int fourth = arr.get(i).getCurrentPoints();
                int pointplusfour = fourth + 12;
                arr.get(i).setCurrentPoints(pointplusfour);

            } else if (i == 4) {
                int fifth = arr.get(i).getCurrentPoints();
                int pointplusfive = fifth + 10;
                arr.get(i).setCurrentPoints(pointplusfive);

            } else if (i == 5) {
                int sixth = arr.get(i).getCurrentPoints();
                int pointplussix = sixth + 8;
                arr.get(i).setCurrentPoints(pointplussix);

            } else if (i == 6) {
                int seventh = arr.get(i).getCurrentPoints();
                int pointplusseventh = seventh + 6;
                arr.get(i).setCurrentPoints(pointplusseventh);

            } else if (i == 7) {
                int eighth = arr.get(i).getCurrentPoints();
                int pointpluseigth = eighth + 4;
                arr.get(i).setCurrentPoints(pointpluseigth);

            } else if (i == 8) {
                int ninetht = arr.get(i).getCurrentPoints();
                int pointplusnineth = ninetht + 2;
                arr.get(i).setCurrentPoints(pointplusnineth);

            } else if (i == 9) {
                int tenth = arr.get(i).getCurrentPoints();
                int pointplustenth = tenth + 1;
                arr.get(i).setCurrentPoints(pointplustenth);

            } else {
                System.out.println("Point not added..no drivers in there..!");
            }
        }

        String rowData[][] = new String[arr.size()][7];

        for (int j = 0; j < arr.size(); j++) {

            rowData[j][0] = date;
            rowData[j][1] = arr.get(j).getDriverName();
            rowData[j][2] = arr.get(j).getTeam();
            rowData[j][3] = Integer.toString(arr.get(j).getCurrentPoints());
            rowData[j][4] = Integer.toString(arr.get(j).getFirstPosition());
            rowData[j][5] = Integer.toString(arr.get(j).getSecondPosition());
            rowData[j][6] = Integer.toString(arr.get(j).getThirdPosition());

            System.out.println("");
        }

        String column[] = {"Date", "Name", "Team", "Points", "First Positions", "Second Positions", "Third Positions"};

        JTable jTable1 = new JTable(rowData, column);
        jTable1.setBounds(100, 100, 100, 100);
        JScrollPane sp = new JScrollPane(jTable1);
        j.add(sp);
        j.setSize(800, 400);
        j.setVisible(true);

        jTable1.setGridColor(Color.magenta);
        jTable1.setBackground(Color.yellow);

        Race r1 = new Race(gc.get(gc.YEAR), gc.get(gc.MONTH) + 1, gc.get(gc.DAY_OF_MONTH), temp);
        rr.add(r1);

    }

    public static int randBetween(int start, int end) {

        return start + (int) Math.round(Math.random() * (end - start));

    }

    /*-------------------------------------------------------------------------------------------------*/

    private void championshipresults(ArrayList<Formula1Driver> arr, ArrayList<Race> rr) {  //Make the driver champion results  Ascending method

        j = new JFrame();               // create a new j Frame

        ArrayList<Formula1Driver> champ1 = new ArrayList<>();          //Make a array for formula 1 driver
        ArrayList<Formula1Driver> tempChamp = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        Collections.shuffle(arr);           //Shuffle the main array
        tempChamp.addAll(arr);

        GregorianCalendar gc = new GregorianCalendar();
        int year = 2021;
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));    //Set date,month, year
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        String date = (gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));


        int probChance = (int) (Math.random() * 100);

        if (0 <= probChance && probChance < 40) {
            System.out.println();
        } else if (40 < probChance && probChance <= 70) {      //Add the win probability
            Collections.swap(arr, 0, 1);
        } else if (70 < probChance && probChance <= 80) {
            Collections.swap(arr, 0, 2);
        } else if (80 < probChance && probChance <= 90) {
            Collections.swap(arr, 0, 3);
        } else if (90 < probChance && probChance <= 92) {
            Collections.swap(arr, 0, 4);
        } else if (92 < probChance && probChance <= 94) {
            Collections.swap(arr, 0, 5);
        } else if (94 < probChance && probChance <= 96) {
            Collections.swap(arr, 0, 6);
        } else if (96 < probChance && probChance <= 98) {
            Collections.swap(arr, 0, 7);
        } else if (98 < probChance && probChance <= 100) {
            Collections.swap(arr, 0, 8);
        }

        for (int i = 0; i < arr.size(); i++) {

            int races = arr.get(i).getParticipatedRaces();
            int raceplus = races + 1;
            arr.get(i).setParticipatedRaces(raceplus);

        }

        for (int j = 0; j < arr.size(); j++) {

            temp.add(arr.get(j).getDriverName());

        }

        for (int i = 0; i < arr.size(); i++) {

            if (i == 0) {

                int first = tempChamp.get(i).getCurrentPoints();
                int pointplusone = first + 25;
                tempChamp.get(i).setCurrentPoints(pointplusone);

                int firstpo = tempChamp.get(i).getFirstPosition();
                int posiplusOne = firstpo + 1;
                tempChamp.get(i).setFirstPosition(posiplusOne);

            }
        }

        champ1.add(tempChamp.get(0));
        tempChamp.remove(0);
        Collections.shuffle(tempChamp);

        for (int i = 0; i < arr.size() - 1; i++) {

            if (i == 0) {
                int second = tempChamp.get(i).getCurrentPoints();
                int pointplustwo = second + 18;
                tempChamp.get(i).setCurrentPoints(pointplustwo);

                int secondpo = tempChamp.get(i).getSecondPosition();
                int posiplusTwo = secondpo + 1;
                tempChamp.get(i).setSecondPosition(posiplusTwo);

            } else if (i == 1) {
                int third = tempChamp.get(i).getCurrentPoints();
                int pointplusthree = third + 15;
                tempChamp.get(i).setCurrentPoints(pointplusthree);

                int thirdpo = tempChamp.get(i).getThirdPosition();
                int posiplusthree = thirdpo + 1;
                tempChamp.get(i).setThirdPosition(posiplusthree);

            } else if (i == 2) {
                int fourth = tempChamp.get(i).getCurrentPoints();
                int pointplusfour = fourth + 12;
                tempChamp.get(i).setCurrentPoints(pointplusfour);   //extract the add race

            } else if (i == 3) {
                int fifth = tempChamp.get(i).getCurrentPoints();
                int pointplusfive = fifth + 10;
                tempChamp.get(i).setCurrentPoints(pointplusfive);

            } else if (i == 4) {
                int sixth = tempChamp.get(i).getCurrentPoints();
                int pointplussix = sixth + 8;
                tempChamp.get(i).setCurrentPoints(pointplussix);

            } else if (i == 5) {
                int seventh = tempChamp.get(i).getCurrentPoints();
                int pointplusseventh = seventh + 6;
                tempChamp.get(i).setCurrentPoints(pointplusseventh);

            } else if (i == 6) {
                int eighth = tempChamp.get(i).getCurrentPoints();
                int pointpluseigth = eighth + 4;
                tempChamp.get(i).setCurrentPoints(pointpluseigth);

            } else if (i == 7) {
                int ninetht = tempChamp.get(i).getCurrentPoints();
                int pointplusnineth = ninetht + 2;
                tempChamp.get(i).setCurrentPoints(pointplusnineth);

            } else if (i == 8) {
                int tenth = tempChamp.get(i).getCurrentPoints();
                int pointplustenth = tenth + 1;
                tempChamp.get(i).setCurrentPoints(pointplustenth);

            } else {
                System.out.println("Point not added..no drivers in there..!");
            }
        }

        champ1.addAll(tempChamp);
        arr.clear();
        arr.addAll(champ1);

        String rowData[][] = new String[arr.size()][7];

        for (int j = 0; j < arr.size(); j++) {

            rowData[j][0] = date;
            rowData[j][1] = arr.get(j).getDriverName();
            rowData[j][2] = arr.get(j).getTeam();
            rowData[j][3] = Integer.toString(arr.get(j).getCurrentPoints());
            rowData[j][4] = Integer.toString(arr.get(j).getFirstPosition());
            rowData[j][5] = Integer.toString(arr.get(j).getSecondPosition());
            rowData[j][6] = Integer.toString(arr.get(j).getThirdPosition());

            System.out.println("");
        }

        String column[] = {"Date", "Name", "Team", "Points", "First Positions", "Second Positions", "Third Positions"};

        JTable jTable1 = new JTable(rowData, column);
        jTable1.setBounds(100, 100, 100, 100);
        JScrollPane sp = new JScrollPane(jTable1);
        j.add(sp);
        j.setSize(800, 400);
        j.setVisible(true);

        jTable1.setGridColor(Color.magenta);
        jTable1.setBackground(Color.yellow);

        Race r1 = new Race(gc.get(gc.YEAR), gc.get(gc.MONTH) + 1, gc.get(gc.DAY_OF_MONTH), temp);
        rr.add(r1);

    }


    private void ascendingDate(ArrayList<Race> rr) {        //Make the ascending date method

        j = new JFrame();    //Create new j frame

        Race[] date = new Race[rr.size()];

        String rowData[][] = new String[rr.size()][11];
        String column[] = {"Date", "F1 Driver1", "F1 Driver2", "F1 Driver3", "F1 Driver4", "F1 Driver5", "F1 Driver6", "F1 Driver7", "F1 Driver8", "F1 Driver9", "F1 Driver10"};

        for (int i = 0; i < rr.size(); i++) {

            date[i] = rr.get(i);

        }
        Race temp1;
        for (int j = 0; j < rr.size(); j++) {

            for (int k = j + 1; k < rr.size(); k++) {

                if (date[j].getMonth() > date[k].getMonth()) {

                    temp1 = date[j];
                    date[j] = date[k];
                    date[k] = temp1;

                } else if (date[j].getMonth() == date[k].getMonth()) {

                    if (date[j].getDate() > date[k].getDate()) {

                        temp1 = date[j];
                        date[j] = date[k];
                        date[k] = temp1;
                    }
                }
            }
        }

        for (int j = 0; j < rr.size(); j++) {

            String day = date[j].getYear() + "/" + date[j].getMonth() + "/" + date[j].getDate();
            rowData[j][0] = day;

            if (date[j].getArrrace().size() > 10) {
                for (int k = 0; k < 10; k++) {
                    rowData[j][k + 1] = date[j].getArrrace().get(k);
                }
            } else {
                for (int k = 0; k < date[j].getArrrace().size(); k++) {
                    rowData[j][k + 1] = date[j].getArrrace().get(k);
                }
            }

            System.out.println("");
        }

        JTable jTable1 = new JTable(rowData, column);
        jTable1.setBounds(100, 100, 100, 100);
        JScrollPane sp = new JScrollPane(jTable1);
        j.add(sp);
        j.setSize(800, 400);
        j.setVisible(true);

        jTable1.setGridColor(Color.magenta);
        jTable1.setBackground(Color.yellow);

    }


    private void search(ArrayList<Formula1Driver> arr) {

        j = new JFrame();

    }
}








