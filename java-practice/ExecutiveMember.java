public class ExecutiveMember extends Member {
    public ExecutiveMember(String name, String address) {
        super(name, address);
    }

    @Override
    public int getFinePerDay() {
        return 50;
    }
}