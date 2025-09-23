import java.util.*;

public class Library2 {
    private ArrayList<Book4> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public void addBook(Book4 b) {
        books.add(b);
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public void issueBook(String bookId, Member member) {
        for (Book4 book : books) {
            if (book.getId().equals(bookId) && !book.isIssued()) {
                book.setIssued(true);
                Transaction t = new Transaction(book);
                member.addTransaction(t);
                System.out.println("Book issued to " + member.getName());
                return;
            }
        }
        System.out.println("Book not found or already issued.");
    }

    public void returnBook(String bookId, Member member) {
        for (Transaction t : member.getTransactions()) {
            if (t.getBook().getId().equals(bookId) && t.toString().contains("Not yet")) {
                t.returnBook();
                long overdue = t.getDaysOverdue();
                if (overdue > 0) {
                    int fine = (int) overdue * member.getFinePerDay();
                    System.out.println("Overdue by " + overdue + " days. Fine: Rs. " + fine);
                    System.out.println("Fine slip sent to " + member.getAddress());
                }
                return;
            }
        }
        System.out.println("No such transaction found.");
    }

    public void searchBook(String keyword) {
        for (Book4 b : books) {
            if (b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b);
            }
        }
    }

    public Member findMember(String name) {
        for (Member m : members) {
            if (m.getName().equalsIgnoreCase(name)) return m;
        }
        return null;
    }
}
