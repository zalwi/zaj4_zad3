class Methods {

    double distanceOfSegment(Segment segment){
        return segment.distance();
    }

    boolean isTriangle(Point pointOne, Point pointTwo, Point pointThree){

        double distanceA = distanceOfSegment(new Segment(pointOne, pointTwo));
        double distanceB = distanceOfSegment(new Segment(pointOne, pointThree));
        double distanceC = distanceOfSegment(new Segment(pointTwo, pointThree));
        /*Nierówność trójkąta
          a<b+c,
          b<c+a,
          c<a+b */
        return ((distanceA < (distanceB + distanceC)) && (distanceB < (distanceC + distanceA)) && (distanceC < (distanceA + distanceB)));
    }

    void showPointInfo(Point point){
        System.out.println("\nPierwsza cwiartka: " + point.isFirstQuadrant());
        System.out.println("Druga cwiartka: " + point.isSecondQuadrant());
        System.out.println("Trzecia cwiartka: " + point.isThirdQuadrant());
        System.out.println("Czwarta cwiartka: " + point.isFourthQuadrant());
        System.out.println("Punkt zero osi X: " + point.isZeroX());
        System.out.println("Punkt zero osi Y: " + point.isZeroY());
        System.out.println("Początek układu współrzędnych: " + point.isOrigin());
    }
}
