package application;

import game_elements.GameField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pong {
    public static void main(String[] args) throws IOException {
        char step;
        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        GameField gameField = new GameField();
        gameField.initializeGameField();
        while (gameField.getNextStep() != 'q') {
            GameField.skip();
            GameField.printInfo();
            gameField.printGameField();

            str = reader.readLine();
            if (str.length() != 0)
                step = str.charAt(0);
            else
                step = 'w';
            gameField.setNextStep(step);
            gameField.initializeGameField();
        }
        System.out.println("Good bye my friend!))");
    }
}
