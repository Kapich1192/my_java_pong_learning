package game_elements;

public class GameField {
    /*fields*/
    private char nextStep = 'w';
    private int heigth = 25;
    private int weigth = 80;
    private char[][] gameField ;
    private char fields = 'o';
    private char line = '|';
    Rocket rocket1;
    Rocket rocket2;
    Boll boll;
    Player player1;
    Player player2;
    /*constructors*/
    public GameField() {
        gameField = new char[heigth][weigth];
        rocket1 = new Rocket();
        rocket2 = new Rocket();
        boll = new Boll();
    }
    public GameField(int heigth, int weigth) {
        this.heigth = heigth;
        this.weigth = weigth;
        gameField = new char[heigth][weigth];
        rocket1 = new Rocket();
        rocket2 = new Rocket();
        boll = new Boll();
    }
    /*getters*/
    public char getNextStep() {return nextStep;}
    public int getHeigth() {return heigth;}
    public int getWeigth() {return weigth;}
    public Player getPlayer1() {return player1;}
    public Player getPlayer2() {return  player2;}
    public char getFields() {return fields;}
    public char getLine() {return line;}
    public Rocket getRocket1() {return rocket1;}
    public Rocket getRocket2() {return rocket2;}
    public Boll getBoll() {return boll;}
    /*setters*/
    public void setNextStep(char nextStep) {
        this.nextStep = nextStep;
    }
    /*system*/
    void initializeGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                if (i = bo)

            }
        }
    }
    /*methods*/
    public void printGameField() {
        System.out.println("");
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                System.out.print(gameField[i][j]);
            }
            System.out.println("");
        }
    }
    public static void skip() {
        System.out.println("\\e[1;1H\\e[2J");
    }
}
