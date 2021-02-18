package HomeWork3;

public class TriangleDrawer {
    public String drawTriangle(int side){
        StringBuilder sb = new StringBuilder();
        int b;
        while (side > 0) {
            b = side;
                sb.append("*".repeat(b)).append("\n");
            side--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(5));
    }
}
