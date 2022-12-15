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
        //���� ����� this ������ ����� others,
        //�� ������� 1,
        //����� ���� ����� ����� �� ������� 0,
        //����� ������� -1
        double len1 = otherS.getLength();
        double len2 = getLength();
        if (len2>len1){            //System.out.println("������� 1 ������ ������� 2");
            return 1;}
        else
            if (len1 == len2) {    //System.out.println("������� 1 ����� ������� 2");
                return 0;
            }
            else{                 //System.out.println("������� 1 ������ ������� 2");
                return -1;
            }
    }

    public String toString() {
        return "������� ����� "+getLength();
    }
}
