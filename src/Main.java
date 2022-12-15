import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Triangle Ver=new Triangle(2,4,4,5,3,1);
        Double Perimetr=Ver.getSumLength();
        System.out.println(Perimetr);

        Double Area = Ver.getTrianArea();
        System.out.println(Area);
    }

}
