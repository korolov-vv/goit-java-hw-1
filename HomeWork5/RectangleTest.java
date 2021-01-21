package HomeWork5;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(78, 173);
        Rectangle r2 = new Rectangle(78, 173);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println("This " + r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}

class Rectangle {
    int a;
    int b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public boolean canPlaceInto(Rectangle anotherRect){
        if((this.a <= anotherRect.a && this.a <= anotherRect.b) && (this.b <= anotherRect.a | this.b <= anotherRect.b)) {return true;}else
            return false;
    }
}