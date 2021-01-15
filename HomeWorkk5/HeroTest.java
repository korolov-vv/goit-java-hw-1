package HomeWorkk5;

public class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}

class Hero {
    private String name;
    private int hp;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Hero() {
        this("Paratrooper", 100);
//Refactored
//        name = "Paratrooper";
//        hp = 100;
    }

    public Hero(String name, int hp) {
        this.name = name;
        if(hp < 0) {this.hp = 0;}else
        if(hp > 200) {this.hp = 200;}else
            this.hp = hp;
    }

}
