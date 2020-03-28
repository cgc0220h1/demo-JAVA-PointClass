public class Main {
    public static void main(String[] args) {
        //Test Point2D class
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(1.5f,2.5f);
        System.out.println(point2D);
        System.out.println();

        //Test Point3D class
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(1.5f,2.5f,3.5f);
        System.out.println(point3D);
        System.out.println();

        //Test MovablePoint class
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(3f,2f);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(1.5f,1.5f,0f,3f);
        System.out.println(movablePoint);
        movablePoint.move(movablePoint);
        System.out.println(movablePoint);
        movablePoint.move(movablePoint);
        System.out.println(movablePoint);
    }
}
