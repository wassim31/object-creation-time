public class CurrentTime {
    private int hours;
    private int minutes;
    private int seconds;

    public CurrentTime()
    {
        this.hours = (int) (System.currentTimeMillis() / 360000) % 24 + 3;
        this.minutes = (int) (System.currentTimeMillis() / 60000) % 60;
        this.seconds = (int) (System.currentTimeMillis() / 1000) % 60;
    }
    public String toString()
    {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }

}
