package HomeWorkk5;

public class OneMoreLevel {
    private int width;
    private int height;

    public OneMoreLevel(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelTooBigException extends Exception{
    LevelTooBigException(){
        super("Level too big");
    }
}

class OneMoreLevelLoader {
    public void load(OneMoreLevel oneMoreLevel) throws LevelTooBigException {
        if(oneMoreLevel.getWidth() * oneMoreLevel.getHeight() <= 100000) {
            System.out.println("Level loaded");
        } else {
           throw new LevelTooBigException();}
    }
}

class OneMoreLevelLoaderTest {
    public static void main(String[] args) throws LevelTooBigException {
        //Level loaded
        new OneMoreLevelLoader().load(new OneMoreLevel(10, 20));

        //Level too big
        try {
            new OneMoreLevelLoader().load(new OneMoreLevel(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}