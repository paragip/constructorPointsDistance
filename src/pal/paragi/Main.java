package pal.paragi;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(6,5);
        Point point2 = new Point(3,1);

        System.out.println("distance (0,0) = " + point.distance());
        System.out.println("distance point és point 2 = " + point.distance(point2.getX(), point2.getY()));

        System.out.println("distance 3 = " + point.distance(2,2));
    }



}
