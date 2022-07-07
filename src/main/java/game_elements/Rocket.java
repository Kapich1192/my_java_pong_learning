package game_elements;

public class Rocket {
    /*fields*/
    private int rocketY = 5;
    private int rocketX = 5;
    private char marker = '0';
    /*constructors*/
    public Rocket() {}
    public Rocket(int rocketY, int rocketX) {
        this.rocketY = rocketY;
        this.rocketX = rocketX;
    }
    /*getters*/

    public int getRocketY() {
        return rocketY;
    }

    public int getRocketX() {
        return rocketX;
    }

    public char getMarker() {
        return marker;
    }
    /*setters*/
    /*methods*/
}
