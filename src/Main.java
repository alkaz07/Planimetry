import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Triangle Ver=new Triangle(2,4,4,5,3,1);
        Double perimetr=Ver.getSumLength();
        System.out.println(perimetr);

        Double area = Ver.getArea();
        System.out.println(area);

        Point p1 = new Point(0, 1);
        Point p2 = new Point(4,1);
        Point p3 = new Point(0, 2);
        Triangle tr2 = new Triangle(p1, p3, p2);
        System.out.println("tr2 area: " +tr2.getArea());
    }

}
