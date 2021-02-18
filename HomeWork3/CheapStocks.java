package HomeWork3;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
        StringBuilder cheapStocks = new StringBuilder();
        for (String stock: stocks){
            String[] s = stock.split(" ");
            if(Integer.parseInt(s[1]) < 200){
                cheapStocks.append(s[0]).append(" ");
            }
        }
        return cheapStocks.toString().trim();
    }
}
 class Test{
     public static void main(String[] args) {
         System.out.println(new CheapStocks().getCheapStocks(new String[] {"gun 500", "firebow 70", "pixboom 200"}));
     }
 }