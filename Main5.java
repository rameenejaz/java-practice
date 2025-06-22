//files used are simple, verifiedSimple and main5
public class Main5 {
    public static void main(String[] args) {
        VerifiedSimple verified=new VerifiedSimple(10, 5);
        verified.add();
        verified.sub();
        verified.mul();
        verified.div();
        VerifiedSimple verified2=new VerifiedSimple(-4,1);
        verified2.add();
    }
}
