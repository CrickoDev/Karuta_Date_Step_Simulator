package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class MapGrid {

    Canvas canvas = new Canvas(300, 400);
    GraphicsContext gc = canvas.getGraphicsContext2D();

    int pointerX = 150;
    int pointerY = 400;

    public MapGrid() {
        drawBase();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void drawBase() {
        gc.setFill(Color.LIGHTGREEN);
        gc.setStroke(Color.DARKGREY);
        gc.setLineWidth(15);
        gc.fillRoundRect(0, 0, 300, 400, 10, 10);
        gc.strokeRoundRect(2, 2, 296, 396, 10, 10);

        for (int i=1; i < 6; i++) {
            gc.strokeLine(i*50, 0, i*50, 400);
        }

        for (int i=1; i < 8; i++) {
            gc.strokeLine(0, i*50, 300, i*50);
        }

        gc.setStroke(Color.RED);
        gc.setLineWidth(10);

        resetPointerPos();
    }

    public void resetPointerPos() {
        pointerX = 150;
        pointerY = 400;
    }

    public void strokeUp() {
        gc.strokeLine(pointerX, pointerY, pointerX, pointerY - 45);
        pointerY = pointerY - 50;
    }

    public void strokeDown() {
        gc.strokeLine(pointerX, pointerY, pointerX, pointerY + 45);
        pointerY = pointerY + 50;
    }

    public void strokeLeft() {
        gc.strokeLine(pointerX, pointerY, pointerX - 45, pointerY);
        pointerX = pointerX - 50;
    }

    public void strokeRight() {
        gc.strokeLine(pointerX, pointerY, pointerX + 45, pointerY);
        pointerX = pointerX + 50;
    }
}
