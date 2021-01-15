package HomeWorkk5;

class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}

class CircleIntersector{
    int x1;
    int y1;
    int r1;
    int x2;
    int y2;
    int r2;
    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        this.x1 = x1;
        this.x2 = x2;
        this.r1 = r1;
        this.y1 = y1;
        this.y2 = y2;
        this.r2 = r2;
    }

    @Override
    public String toString(){
        String text;
        int distance = (int) Math.sqrt((x2 - x1) * (x2 -x1) + (y2 -y1) * (y2 -y1));
        int condition = r1 + r2;
        if(Math.abs(distance) <= condition) {text = "intersects";}else
        {text = "not intersects";}
        return text;
    }
}