public class Book1 {
    private String author;
    private String [] chapterNames=new String[100];
    public Book1() {
        author="";
        chapterNames[100]="";
    }
    public Book1(String author, String chapterNames[]) {
        this.author=author;
        for(int i=0; i<100; i++) {
            this.chapterNames[i]=chapterNames[i];
        }
    }
    public Book1 compareBooks(Book1 secondBook) {
        boolean isSame=false;
        author.toLowerCase();
        secondBook.author.toLowerCase();
        if(author==secondBook.author) {
            isSame=true;
        }
        else {
            isSame=false;
        }
        return new Book1(author,chapterNames);
        // bool isSame=false;
        // author1.toLowerCase();
        // author2.toLowerCase();
        // if(author1==author2) {
        //     isSame=true;
        // }
    }
}
