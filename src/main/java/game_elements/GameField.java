package game_elements;

public class GameField {
    /*fields*/
    private char nextStep = 'w';
    private int heigth = 25;
    private int weigth = 80;
    private final char[][] gameField ;
    private final char fields = 'o';
    private final char line = '|';
    Rocket rocket1;
    Rocket rocket2;
    Boll boll;
    Player player1;
    Player player2;
    /*constructors*/
    public GameField() {
        gameField = new char[heigth][weigth];
        rocket1 = new Rocket();
        rocket2 = new Rocket(12,weigth - 4);
        boll = new Boll();
        player1 = new Player("Player1");
        player2 = new Player("Player2");
    }
    public GameField(int heigth, int weigth) {
        this.heigth = heigth;
        this.weigth = weigth;
        gameField = new char[heigth][weigth];
        rocket1 = new Rocket();
        rocket2 = new Rocket();
        boll = new Boll();
        player1 = new Player("Player1");
        player2 = new Player("Player2");
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
        boll.moveBoll(heigth, weigth, rocket1, rocket2);
        if (nextStep == 'a' || nextStep == 'z')
            rocket1.moveRocket(nextStep, heigth);
        if (nextStep == 'm' ||  nextStep == 'k')
            rocket2.moveRocket(nextStep, heigth);
    }
    /*system*/
    public void initializeGameField() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (i == 0 || i == heigth - 1 || j == 0 || j == weigth - 1) {
                    gameField[i][j] = fields;
                } else if ((i == rocket1.getRocketY() && j == rocket1.getRocketX()) ||
                        (i == rocket1.getRocketY() - 1 && j == rocket1.getRocketX()) ||
                        (i == rocket1.getRocketY() + 1 && j == rocket1.getRocketX()) ||
                        (i == rocket2.getRocketY() && j == rocket2.getRocketX()) ||
                        (i == rocket2.getRocketY() - 1 && j == rocket2.getRocketX()) ||
                        (i == rocket2.getRocketY() + 1 && j == rocket2.getRocketX())) {
                    gameField[i][j] = rocket1.getMarker();
                } else if (i == boll.getBollY() && j == boll.getBollX()) {
                    gameField[i][j] = boll.getBoll();
                } else if (j == weigth / 2) {
                    gameField[i][j] = line;
                } else {
                    gameField[i][j] = ' ';
                }
            }
        }
    }
    /*methods*/
    public void printGameField() {
        System.out.println("");
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Player1 points: " + player1.getPoint() + "; " +
                "Player2 points: " + player2.getPoint());
    }
    public static void printInfo() {
        System.out.print("Press 'q' for exit, 'a''z' for move rocket1 and 'k''m' for rocket2");
    }
    public static void skip() {
        System.out.println("\\e[1;1H\\e[2J");
    }
}
