public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    boolean isFirstQuadrant(){
       return (x>0 && y>0);
    }
    boolean isSecondQuadrant(){
        return (x<0 && y>0);
    }
    boolean isThirdQuadrant(){
        return (x<0 && y<0);
    }
    boolean isFourthQuadrant(){
        return (x>0 && y<0);
    }
    boolean isZeroX(){
        return (x == 0);
    }
    boolean isZeroY(){
        return (y == 0);
    }
    boolean isOrigin(){
        return (x == 0 && y ==0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
