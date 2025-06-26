public class JournalMember extends Member {
    public JournalMember(String name, String address) {
        super(name, address);
    }

    @Override
    public int getFinePerDay() {
        return 100;
    }
}