package be.pxl.ja.herhalingsoefening;

public class Attraction implements Item , Comparable<Attraction>{

    private String n;
    private double days;
    private int rating;

    public Attraction(String n, double days, int rating) {
        this.n = n;
        this.days = days;
        this.rating = rating;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public double getWeight() {
        return days;
    }

    @Override
    public int compareTo(Attraction o) {
        return o.getRating() - this.getRating();
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "n='" + n + '\'' +
                ", days=" + days +
                ", rating=" + rating +
                '}';
    }


}
