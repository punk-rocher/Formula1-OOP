//Student Name - S.R.S Fernando
//IIT Number - 2019404
//uow Number - w1809768


import java.util.ArrayList;

public interface ChampionshipManager {

    void createDriver(ArrayList<Formula1Driver> arr);

    void deleteDriver(ArrayList<Formula1Driver> arr);

    void changeDriver(ArrayList<Formula1Driver> arr);

    void singledriverStats(ArrayList<Formula1Driver> arr);

    void displayingStats(ArrayList<Formula1Driver> arr);

    void addaRace(ArrayList<Formula1Driver> arr, ArrayList<Race> rr);

    void storeProgram(ArrayList<Formula1Driver> arr);

    void loadProgram(ArrayList<Formula1Driver> arr);

    void storeProgram2(ArrayList<Race> rr);

    void loadProgram2(ArrayList<Race> rr);

}
