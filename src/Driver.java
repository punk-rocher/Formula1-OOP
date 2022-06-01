//Student Name - S.R.S Fernando
//IIT Number - 2019404
//uow Number - w1809768


public abstract class Driver {

    String driverName;
    String location;
    String team;

    public Driver(String driverName, String location, String team) {
        this.driverName = driverName;
        this.location = location;
        this.team = team;

    }

    public Driver(String driverName, String location, String team, int currentPoints, int participatedRaces) {

    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}
