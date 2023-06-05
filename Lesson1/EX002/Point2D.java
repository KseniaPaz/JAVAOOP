package EX002;


/**
 * это точка 2D
 */
public class Point2D {
    private int x, y;
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
        
    }

    /**
     *это конструктор
     * @param valueX это координата X
     * @param valueY это координата Y 
     */
    public Point2D() {
        this(10, 11);
    }
    

    public Point2D(int value) {
        this(value, value);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x=value;
    }

    public void setY(int value){
        this.y=value;
    }



    private String getInfo(){
        return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
    
}
