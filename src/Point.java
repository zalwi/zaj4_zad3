public class Point {
    double x;
    double y;

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
}
