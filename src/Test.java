import javax.sound.midi.Soundbank;

class Test {
    public static void main(String[] args) {
        Point quadrant1 =   new Point(1,1);
        Point quadrant2 =   new Point(-1,1);
        Point quadrant3 =   new Point(-1,-1);
        Point quadrant4 =   new Point(1,-1);
        Point zeroY =       new Point(1,0);
        Point zeroX =       new Point(0,1);
        Point zeroZero =    new Point(0,0);
        Segment segment =   new Segment(quadrant1, quadrant2);
        Methods method =    new Methods();

        // Wyświetl informacje o punktach
        method.showPointInfo(quadrant1);
        method.showPointInfo(quadrant2);
        method.showPointInfo(quadrant3);
        method.showPointInfo(quadrant4);
        method.showPointInfo(zeroX);
        method.showPointInfo(zeroY);
        method.showPointInfo(zeroZero);
        // Oblicz długość odcinka
        System.out.println("\nDługość odcinka: " + method.distanceOfSegment(segment));
        //Sprawdz trójkąty
        System.out.println("\nTrójkąt?: " + method.isTriangle(quadrant1,quadrant4,quadrant3));
        System.out.println("\nTrójkąt?: " + method.isTriangle(quadrant1,quadrant1,quadrant3));
        System.out.println("\nTrójkąt?: " + method.isTriangle(quadrant1,zeroZero,quadrant3));
    }
}
