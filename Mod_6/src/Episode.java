//This class will store the data for episodes of Rick and Morty

public class Episode {

    //Attributes
    private String title;
    private int season;
    private double rating;

    //Constructor
    public Episode(String title, int season, double rating) {
        this.title = title;
        this.season = season;
        this.rating = rating;
    }

    //Gettors and Settors
    public String getTitle() {
        return title;
    }
    public int getSeason() {
        return season;
    }
    public double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    //toString Method
    public String toString() {
        return "Episode{title='" + title + "', season=" + season + ", rating=" + rating + "}";
    }
}
