package game_elements;

public class Boll {
    /*fields*/
    private char boll = 'o';
    private int bollX = 40;
    private int bollY = 12;
    private int bollVectorX = -1;
    private int bollVectorY = -1;
    private int speed = 1;
    /*constructors*/
    public Boll() {}
    /*getters*/
    public char getBoll() { return boll; }
    public int getBollX() {
        return bollX;
    }

    public int getBollY() {
        return bollY;
    }

    public int getBollVectorX() {
        return bollVectorX;
    }

    public int getBollVectorY() {
        return bollVectorY;
    }

    public int getSpeed() {
        return speed;
    }

    /*setters*/
    /*system*/
    public void moveBoll(GameField gameField) {

    }
    /*methods*/
    /*static methods*/
}
