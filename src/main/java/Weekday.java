public class Weekday {
    String weekday;

    public Weekday(String weekday) {
        this.weekday = weekday;
    }

    public String isItFriday() {
        return "Friday".equals(weekday) ? "TGIF" : "Nope";
    }
}
