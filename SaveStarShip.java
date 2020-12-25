import java.util.*;

public class SaveStarShip {

    // Zadacha 21
    int power;
    public void calculateMaxPower(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c) {power = a;
        } else if(b > c){power = b;} else {power = c;}
        SaveStarShip.multiplyPower(power);
        sc.close();
    }

    private static void multiplyPower(float power) {
        if(power < 10){power *= 0.7f;
        }else if(power < 100){power *= 1.2f;
        }else{power *= 2.1f;}
        System.out.println(power);
    }
    // Zadacha 20
    public int calculateNeededFuel(int distance){
        if (distance < 20) {return 1000;
        }else return 1000 + (distance - 20) * 5;
    }
    // Zadacha 19
    public int roundSpeed(int speed) {
        if ((speed % 10) < 5) {
            return (speed / 10) * 10;
        } else return (speed / 10 + 1) * 10;
    }

    //Zadacha 18
    public int calculateFuelPrice(String fuel, int count) {
        int price = 50;
        if (fuel.equals("STAR100")) {
            price = 70;
        } else if (fuel.equals("STAR500")) {
            price = 120;
        } else if (fuel.equals("STAR1000")) {
            price = 200;
        }
        int amount = price * count;
        return amount;
    }

    // Zadacha 17
    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else return "Pern";
    }

    // Zadacha 16
    public String[] getPlanets(String galaxy) {
        String[] planets;
        if (galaxy == "Miaru") {
            planets = new String[]{"Maux", "Reux", "Piax"};
        } else if (galaxy == "Milkyway") {
            planets = new String[]{"Earth", "Mars", "Jupiter"};
        } else if (galaxy == "DangerBanger") {
            planets = new String[]{"Fobius", "Demius"};
        } else planets = new String[0];
        return planets;
    }

    //Zadacha 15
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }
        return distance;
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(21));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();
    }
}
