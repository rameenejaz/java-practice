public class Action extends Movie{
    public Action(String rating, int ID, String movieTitle) {
        super(rating, ID, movieTitle);
    }
    @Override 
    public double calculateFees(int daysLate) {
        return daysLate*3;
    }
}
