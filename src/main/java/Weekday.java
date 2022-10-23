public class Weekday {
    String weekday;

    public Weekday(String weekday) {
        this.weekday = weekday;
    }

    public String isItFriday() {
        return weekday.equals("Friday") ? "TGIF" : "Nope";
    }
}
