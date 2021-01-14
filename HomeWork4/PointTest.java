package HomeWork4;

import java.util.Objects;

class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        Point p3 = new Point();
        p3.setX(2);
        p3.setY(2);
        p3.setZ(3);

        Point p4 = new Point();
        p4.setX(465);
        p4.setY(823);
        p4.setZ(169);

        Point p5 = new Point();
        p5.setX(139);
        p5.setY(18);
        p5.setZ(789);

        System.out.println(p1.equals(p2)); //Should be true
        System.out.println(p1.equals(p3)); //Should be false

        StarTrack track1 = new StarTrack();
        track1.setStart(p1);
        track1.setFinish(p2);

        StarTrack track2 = new StarTrack();
        track2.setStart(p1);
        track2.setFinish(p2);

        StarTrack track3 = new StarTrack();
        track3.setStart(p1);
        track3.setFinish(p3);

        System.out.println(track1.equals(track2)); //Should be true
        System.out.println(track1.equals(track3)); //Should be false
        System.out.println();
        System.out.println(track1.hashCode() == track2.hashCode()); //Should be true

        StarTrack tr1 = new StarTrack();
        tr1.setStart(p4);
        tr1.setFinish(p5);

        StarTrack tr2 = new StarTrack();
        tr2.setStart(p4);
        tr2.setFinish(p5);
        System.out.println("Moje zadanie " + tr1.equals(tr2));
    }
}

class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y &&
                z == point.z;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}

class StarTrack {

    private Point start;
    private Point finish;

    public Point getStart() {
        return start;
    }

    public void setStart(Point point) {
        this.start = point;
    }

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point point) {
        this.finish = point;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarTrack track = (StarTrack) o;
        return this.start.equals(track.start) &&
                this.finish.equals(track.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }
}