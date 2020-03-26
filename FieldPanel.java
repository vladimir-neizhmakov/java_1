package ru.geekbrains.java_one.lesson_04;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class FieldPanel extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;

    FieldPanel() {setBackground(Color.CYAN); }

    public void drawGrid(int fieldSizeX, int fieldSizeY) throws NullPointerException {
        setLayout(new GridLayout(fieldSizeX, fieldSizeY));
        JLabel[][] gameField = new JLabel[fieldSizeX][fieldSizeY];
        for (int i = 0; i < fieldSizeX ; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                gameField[i][j] = new JLabel();
                add(gameField[i][j]);
                gameField[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
            }
        }

    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        removeAll();
        drawGrid(fieldSizeX, fieldSizeY);
        System.out.printf("damn mode: %d\nfield size: %d,\nwin length: %d\n", gameMode, fieldSizeX, winLength);

    }
}