import java.util.*;

public class SaveStarShip {
    //Zadacha 15
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }
        return distance;
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

    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
    }
}
