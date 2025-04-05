public class Book1 {
    private String author;
    private String [] chapterNames;
    public Book1() {
        author="";
        this.chapterNames=new String[100];
    }
    public Book1(String author, String chapterNames[]) {
        this.author=author;
        this.chapterNames=new String[100];
        for(int i=0; i<chapterNames.length; i++) {
            this.chapterNames[i]=chapterNames[i];
        }
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author=author;
    }
    public String [] getChapterNames() {
        return chapterNames;
    }
    public void setChapterNames(String [] chapterName) {
        for(int i=0; i<chapterName.length; i++) {
            this.chapterNames[i]=chapterName[i];
        }
    }
    public static boolean compareBooks(Book1 firstBook, Book1 secondBook) {
        boolean isSame=false;
        String a1=firstBook.author.toLowerCase();
        String a2=secondBook.author.toLowerCase();
        return a1.equals(a2);
    }
    public static Book1 compareChapterNames (Book1 firstBook, Book1 secondBook) {
        int count1=0;
        int count2=0;
        for (int i=0; i<firstBook.chapterNames.length; i++) {
            if(firstBook.chapterNames[i]!= null && !firstBook.chapterNames[i].equals("")) {
                count1++;
            }
        }
        for (int j=0; j<secondBook.chapterNames.length; j++) {
            if (secondBook.chapterNames[j]!=null && !secondBook.chapterNames[j].equals("")) {
                count2++;
            }
        }
        if (count1>count2) {
            return firstBook;
        }
        else {
            return secondBook;
        }
    }
    public static void main(String[] args) {
        Book1 b1=new Book1();
        String [] chapter1= {"Pilot", "Finding Mike Ross", "Lewis and his bald head"};
        b1.setAuthor("Harvey Spectar");
        b1.setChapterNames(chapter1);
        String [] chapter2= {"Once upon a time", "Pride and Prejudice"};
        Book1 b2=new Book1("Jane Austin", chapter2);
        boolean isSameAuthor=compareBooks(b1,b2);
        System.out.println("Do the two books have the same author?" + isSameAuthor);
        Book1 book=compareChapterNames(b1, b2);
        System.out.println("The author with more chapters is:" + book.getAuthor());

    }
}
