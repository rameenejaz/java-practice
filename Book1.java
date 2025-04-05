public class Book1 {
    private String author;
    private String [] chapterNames=new String[100];
    public Book1() {
        author="";
        chapterNames[100]="";
    }
    public Book1(String author, String chapterNames[]) {
        this.author=author;
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
    public boolean compareBooks(Book1 secondBook) {
        boolean isSame=false;
        author.toLowerCase();
        secondBook.author.toLowerCase();
        // return author.equals(secondBook.author);
        if(author==secondBook.author) {
            isSame=true;
        }
        else {
            isSame=false;
        }
        return isSame;
    }

}
