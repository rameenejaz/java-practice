public abstract class Shape {
    private int numberOfLines;
    private String penColor;
    private String fillColor;
    public Shape() {
        numberOfLines=0;
        penColor="";
        fillColor="";
    }
    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines=numberOfLines;
        this.penColor=penColor;
        this.fillColor=fillColor;
    }
    public abstract void draw();
    
}
