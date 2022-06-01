import java.util.ArrayList;

public class Race {

    private int date;
    private int month;
    private int year;


    ArrayList<String> arrrace = new ArrayList<>();

    public Race(int year, int month, int date, ArrayList<String> arrrace) {
        this.date = date;
        this.month = month;
        this.year = year;
        this.arrrace = arrrace;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<String> getArrrace() {
        return arrrace;
    }

    public void setArrrace(ArrayList<String> arrrace) {
        this.arrrace = arrrace;
    }














}
