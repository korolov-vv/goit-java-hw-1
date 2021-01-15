package HomeWorkk5;

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}

class Distance{
    int startX;
    int startY;
    int endX;
    int endY;
    int distance;
    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public int getDistance(){
        distance = Math.toIntExact((Math.round(Math.sqrt((startX - endX) * (startX - endX) + (startY - endY) * (startY - endY)))));
        return distance;
    }
}
