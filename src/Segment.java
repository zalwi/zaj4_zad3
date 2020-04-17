class Segment {
    Point pointOne;
    Point pointTwo;

    public Segment() {
    }

    public Segment(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    double distance(){
        return Math.sqrt((Math.pow((pointTwo.getX() - pointOne.getX()), 2) + Math.pow((pointTwo.getY() - pointOne.getY()), 2))); // potega
    }

    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }
}

