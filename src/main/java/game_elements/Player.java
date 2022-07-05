package game_elements;

public class Player {
    /*fields*/
    private String name;
    private int point = 0;
    /*constructors*/
    public Player() {}
    public Player(String name) {
        this.name = name;
    }
    /*getters*/
    public String getName() {return name;}
    public int getPoint() {return point;}
    /*setters*/
    public void setName(String name) {this.name = name;}
    public void setPoint(int point) {this.point = point;}
    /*system*/
    /*methods*/
}
