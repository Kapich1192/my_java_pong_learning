package game_elements;

public class GameField {
    /*fields*/
    private int heigth = 25;
    private int weigth = 80;
    private char[][] gameField;
    private char fields = 'o';
    private char line = '|';
    Rocket rocket1;
    Rocket rocket2;
    Boll boll;
    /*constructors*/
    public GameField() {

    }
    public GameField(int heigth, int weigth) {
        this.heigth = heigth;
        this.weigth = weigth;
        gameField = new char[heigth][weigth];
    }
    /*getters*/
    public int getHeigth() {
        return heigth;
    }

    public int getWeigth() {
        return weigth;
    }
    /*setters*/
    /*system*/
    /*methods*/
}
