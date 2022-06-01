//Student Name - S.R.S Fernando
//IIT Number - 2019404
//uow Number - w1809768


public class Formula1Driver extends Driver {
    int FirstPosition;
    int SecondPosition;
    int ThirdPosition;
    int CurrentPoints;
    int ParticipatedRaces;

    public Formula1Driver(String driverName, String location, String team, int firstPosition, int secondPosition, int thirdPosition, int currentPoints, int participatedRaces) {
        super(driverName, location, team);
        FirstPosition = firstPosition;
        SecondPosition = secondPosition;
        ThirdPosition = thirdPosition;
        CurrentPoints = currentPoints;
        ParticipatedRaces = participatedRaces;
    }


    public Formula1Driver(String driverName, String location, String team) {
        super(driverName, location, team);
    }


    public int getFirstPosition() {
        return FirstPosition;
    }

    public void setFirstPosition(int firstPosition) {
        FirstPosition = firstPosition;
    }

    public int getSecondPosition() {
        return SecondPosition;
    }

    public void setSecondPosition(int secondPosition) {
        SecondPosition = secondPosition;
    }

    public int getThirdPosition() {
        return ThirdPosition;
    }

    public void setThirdPosition(int thirdPosition) {
        ThirdPosition = thirdPosition;
    }

    public int getCurrentPoints() {
        return CurrentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        CurrentPoints = currentPoints;
    }

    public int getParticipatedRaces() {
        return ParticipatedRaces;
    }

    public void setParticipatedRaces(int participatedRaces) {
        ParticipatedRaces = participatedRaces;
    }

}
