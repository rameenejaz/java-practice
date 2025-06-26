import java.time.LocalDate;

public class Transaction {
    private Book4 book;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Transaction(Book4 book) {
        this.book = book;
        this.issueDate = LocalDate.now();
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        book.setIssued(false);
    }

    public long getDaysOverdue() {
        if (returnDate == null) return 0;
        long days = java.time.temporal.ChronoUnit.DAYS.between(issueDate, returnDate);
        return days > 15 ? days - 15 : 0;
    }

    public Book4 getBook() { return book; }

    public String toString() {
        return book.getTitle() + " | Issued: " + issueDate + " | Returned: " + (returnDate == null ? "Not yet" : returnDate);
    }
}
