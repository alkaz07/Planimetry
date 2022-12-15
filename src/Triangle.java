import static java.lang.Math.sqrt;

public class Triangle extends Figure{
   Point Ver1;
   Point Ver2;
   Point Ver3;

    public Triangle(Point Ver1,Point Ver2,Point Ver3){
        this.Ver1=Ver1;
        this.Ver2=Ver2;
        this.Ver3=Ver3;
    }
      public Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
        Ver1=new Point(x1,y1);
        Ver2=new Point(x2,y2);
        Ver3=new Point(x3,y3);
      }

    public double getLength1(){
        return Point.getDistance(Ver1,Ver2);
    }
    public double getLength2(){
        return Point.getDistance(Ver2,Ver3);
    }
    public double getLength3() {
        return Point.getDistance(Ver3, Ver1);
    }

    public double getSumLength(){
        return (getLength1()+getLength2()+getLength3());
    }


    public double getArea() {
        double p=getSumLength()/2;
        return sqrt(p*(p-getLength1())*(p-getLength2())*(p-getLength3()));
    }
}
