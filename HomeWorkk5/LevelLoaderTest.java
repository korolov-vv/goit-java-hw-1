package HomeWorkk5;


class LevelLoaderTest {
    public static void main(String[] args) {
        LevelLoader levelLoader = new LevelLoader();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));
    }
}
class LevelLoader{
    public String load(String levelName){
        return "Loading level " + levelName + " ...";
    }
}