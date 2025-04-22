public class Faculty extends Employee {
    private int officeHours;
    private int rank;
    public Faculty() {
        officeHours=0;
        rank=0;
    }
    public Faculty(int officeHours, int rank) {
        this.officeHours=officeHours;
        this.rank=rank;
    }
    public void display () {
        System.out.println("Office Hours: " + officeHours + " Rank: " + rank);
    }
}
