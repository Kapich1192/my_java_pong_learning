package game_field;

public class GameField {
    /*fields*/
    private int heigth;
    private int weigth;
    private char[][] gameField;
    private char fields = 'o';
    private char line = '|';
    /*constructors*/
    public GameField() {}
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
