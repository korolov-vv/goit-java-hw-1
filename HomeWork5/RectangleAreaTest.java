package HomeWork5;

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

class RectangleArea {
    int[] coords;
    int area;
    public RectangleArea(int[] coords){
        this.coords = coords;
    }
    public int getArea(){
        int a = Math.abs(coords[2] - coords[0]);
        int b = Math.abs(coords[3] - coords[1]);
        area = a * b;
        return area;
    }
}