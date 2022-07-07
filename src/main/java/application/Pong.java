package application;

import game_elements.GameField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pong {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GameField gameField = new GameField();
        gameField.initializeGameField();
        while (gameField.getNextStep() != 'q') {
            GameField.skip();
            gameField.printGameField();
            gameField.setNextStep(reader.readLine().charAt(0));
        }
        System.out.println("Good bye my friend!))");
    }
}
