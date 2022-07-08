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
    public void moveBoll(int heigth, int weigth, Rocket rocket1, Rocket rocket2) {
        if (bollY + 2 == heigth || bollY - 1 == 0){
            bollVectorY *= -1;
        }
        if ((bollX - 1 == rocket1.getRocketX() && bollY == rocket1.getRocketY()) ||
                (bollX - 1 == rocket1.getRocketX() && bollY == rocket1.getRocketY() + 1) ||
                (bollX - 1 == rocket1.getRocketX() && bollY == rocket1.getRocketY() - 1) ||
                (bollX + 1 == rocket2.getRocketX() && bollY == rocket2.getRocketY()) ||
                (bollX + 1 == rocket2.getRocketX() && bollY == rocket2.getRocketY() + 1) ||
                (bollX + 1 == rocket2.getRocketX() && bollY == rocket2.getRocketY() - 1)) {
            bollVectorX *= -1;
        }
        if (bollX > rocket2.getRocketX() || bollX < rocket1.getRocketX()) {
            bollX = weigth / 2;
            bollY = heigth / 2;
        }
        bollX = bollX + bollVectorX;
        bollY = bollY + bollVectorY;

    }
    /*methods*/
    /*static methods*/
}
