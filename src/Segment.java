public class Segment {
    Point start, finish;

    public Segment(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public Segment(double x1, double y1, double x2, double y2) {
        start = new Point(x1, y1);
        finish = new Point(x2, y2);
    }

    public double getLength()
    {
        //return start.getDistance(finish);
        return Point.getDistance(start, finish);
    }

    public int compare(Segment otherS)
    {
        //если длина this больше длины others,
        //то вернуть 1,
        //иначе если длины равны то вернуть 0,
        //иначе вернуть -1
        double len1 = otherS.getLength();
        double len2 = getLength();
        if (len2>len1){            //System.out.println("отрезок 1 больше отрезка 2");
            return 1;}
        else
            if (len1 == len2) {    //System.out.println("отрезок 1 равен отрезку 2");
                return 0;
            }
            else{                 //System.out.println("отрезок 1 меньше отрезка 2");
                return -1;
            }
    }

    public String toString() {
        return "отрезок длины "+getLength();
    }
}
