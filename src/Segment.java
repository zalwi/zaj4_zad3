class Segment {
    Point pointOne;
    Point pointTwo;

    public Segment(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    double distance(){
        return Math.sqrt((Math.pow((pointTwo.x - pointOne.x), 2) + Math.pow((pointTwo.y - pointOne.y), 2))); // potega
    }
}

