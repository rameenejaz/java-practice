public class Comedy extends Movie {
    public Comedy(String rating, int ID, String movieTitle) {
        super(rating, ID, movieTitle);
    }
    @Override 
    public double calculateFees(int daysLate) {
        return daysLate*2.5;
    }
}
