import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Book2 book=new Book2();
        System.out.print("Enter Book Title: ");
        book.setTitle(input.nextLine());
        System.out.print("Enter book price:");
        book.setPrice(input.nextDouble());
        book.pageCount();
        book.display();
        
        input.nextLine();
        Tape2 tape=new Tape2();
        System.out.print("Enter Tape Title: ");
        tape.setTitle(input.nextLine());
        System.out.print("Enter tape price:");
        tape.setPrice(input.nextDouble());
        tape.tapePlayMins();
        tape.display();
    }
}
