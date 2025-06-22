public class Movie {
    private String rating; //PG, R, etc..
    private int ID;
    private String movieTitle;
    public Movie() {
        rating="";
        ID=0;
        movieTitle="";
    }
    public Movie(String rating, int ID, String movieTitle) {
        this.rating=rating;
        this.ID=ID;
        this.movieTitle=movieTitle;
    }
    public String getTitle() {
        return rating;
    }
    public int getID() {
        return ID;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setRating(String rating) {
        this.rating=rating;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle=movieTitle;
    }
    @Override
    public boolean equals(Object obj) {
        if (this.ID==obj.ID) {
            return true;
        }
        if (obj==null) {
            return false;
        }
        if (getClass()!=obj.getClass()) {
            return false;
        }
        Movie other=(Movie) obj; //safe to cast now
        return this.ID==other.ID; //comparing the ID
    }
    public double calculateFees(int daysLate) {
        return daysLate*2;
    }
    @Override 
    public void displayDetails() {
        System.out.println("Title: " + movieTitle + ", Rating: " + rating + ", ID: " +ID );
    }

}