package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;

public class Controller {

    private int gas;
    private int food;
    private int drink;
    private int entertainment;
    private int time;

    ListView<String> moveListView;
    ListView<String> gasListView;
    ListView<String> foodListView;
    ListView<String> drinkListView;
    ListView<String> entertainmentListView;
    ListView<String> timeListView;

    MapGrid mapGrid;

    Scene scene;

    public Controller(ListView<String> moveListView,
                      ListView<String> gasListView,
                      ListView<String> foodListView,
                      ListView<String> drinkListView,
                      ListView<String> entertainmentListView,
                      ListView<String> timeListView,
                      MapGrid mapGrid) {

        this.moveListView = moveListView;
        this.gasListView = gasListView;
        this.foodListView = foodListView;
        this.drinkListView = drinkListView;
        this.entertainmentListView = entertainmentListView;
        this.timeListView = timeListView;

        this.mapGrid = mapGrid;

        clear();
    }

    public void move() {
        gas = gas - 10;
        food = food - 4;
        drink = drink - 6;
        entertainment = entertainment - 8;
        time = time - 4;
    }

    public void use() {
        food = food - 4;
        drink = drink - 6;
        entertainment = entertainment - 8;
        time = time - 4;

        if (gas > 100) gas = 100;
        if (food > 100) food = 100;
        if (drink > 100) drink = 100;
        if (entertainment > 100) entertainment = 100;
    }

    public void up() {
        move();

        moveListView.getItems().add("Up");
        updateLists();

        mapGrid.strokeUp();
    }

    public void down() {
        move();

        moveListView.getItems().add("Down");
        updateLists();

        mapGrid.strokeDown();
    }

    public void left() {
        move();

        moveListView.getItems().add("Left");
        updateLists();

        mapGrid.strokeLeft();
    }

    public void right() {
        move();

        moveListView.getItems().add("Right");
        updateLists();

        mapGrid.strokeRight();
    }

    public void gasStation() {
        gas = gas + 100;
        use();

        moveListView.getItems().add("Gas");
        updateLists();
    }

    public void flower() {
        entertainment = entertainment + 100;
        use();

        moveListView.getItems().add("Flower");
        updateLists();
    }

    public void ballroom() {
        entertainment = entertainment + 100;
        drink = drink - 15;
        food = food - 10;
        use();

        moveListView.getItems().add("Ballroom");
        updateLists();
    }

    public void coffee() {
        drink = drink + 60;
        use();

        moveListView.getItems().add("Coffee");
        updateLists();
    }

    public void juice() {
        drink = drink + 60;
        use();

        moveListView.getItems().add("Juice");
        updateLists();
    }

    public void theater() {
        entertainment = entertainment + 60;
        use();

        moveListView.getItems().add("Theater");
        updateLists();
    }

    public void spaghett() {
        food = food + 60;
        use();

        moveListView.getItems().add("Spaghett");
        updateLists();
    }

    public void taco() {
        food = food + 60;
        use();

        moveListView.getItems().add("Taco");
        updateLists();
    }

    public void cocktail() {
        drink = drink + 40;
        entertainment = entertainment + 40;
        use();

        moveListView.getItems().add("Cocktail");
        updateLists();
    }

    public void fair() {
        food = food + 20;
        drink = drink + 20;
        entertainment = entertainment + 40;
        use();

        moveListView.getItems().add("Fair");
        updateLists();
    }

    public void sandwich() {
        food = food + 40;
        drink = drink + 20;
        use();

        moveListView.getItems().add("Sandwich");
        updateLists();
    }

    public void airport() {
        entertainment = entertainment - 10;
        use();

        moveListView.getItems().add("Airport");
        updateLists();
    }

    public void home() {
        use();

        moveListView.getItems().add("Home");
        updateLists();
    }

    public void jewelry() {
        use();

        moveListView.getItems().add("Jewelry");
        updateLists();
    }

    public void shopping() {
        use();

        moveListView.getItems().add("Shopping");
        updateLists();
    }

    public int getGas() {
        return gas;
    }

    public int getFood() {
        return food;
    }

    public int getDrink() {
        return drink;
    }

    public int getEntertainment() {
        return entertainment;
    }

    public int getTime() {
        return time;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    private void updateLists() {
        gasListView.getItems().add(String.valueOf(gas));
        foodListView.getItems().add(String.valueOf(food));
        drinkListView.getItems().add(String.valueOf(drink));
        entertainmentListView.getItems().add(String.valueOf(entertainment));
        timeListView.getItems().add(String.valueOf(time));

        validate();
    }

    private void validate() {
        if (food <= 0 || drink <= 0 || entertainment <= 0 || gas <= 0) {
            if (food <= 0) {
                foodListView.setStyle("-fx-background-color: red; -fx-border-width: 3px;");
            }
            if (drink <= 0) {
                drinkListView.setStyle("-fx-background-color: red; -fx-border-width: 3px;");
            }
            if (entertainment <= 0) {
                entertainmentListView.setStyle("-fx-background-color: red; -fx-border-width: 3px;");
            }
            if (gas <= 0) {
                gasListView.setStyle("-fx-background-color: red; -fx-border-width: 3px;");
            }
            return;
        }
        if (time == 0) {
            gasListView.setStyle("-fx-background-color: green; -fx-border-width: 3px;");
            drinkListView.setStyle("-fx-background-color: green; -fx-border-width: 3px;");
            foodListView.setStyle("-fx-background-color: green; -fx-border-width: 3px;");
            entertainmentListView.setStyle("-fx-background-color: green; -fx-border-width: 3px;");
            timeListView.setStyle("-fx-background-color: green; -fx-border-width: 3px;");
        }
    }

    public void clear() {
        moveListView.getItems().clear();
        gasListView.getItems().clear();
        foodListView.getItems().clear();
        drinkListView.getItems().clear();
        entertainmentListView.getItems().clear();
        timeListView.getItems().clear();

        gasListView.setStyle("");
        drinkListView.setStyle("");
        foodListView.setStyle("");
        entertainmentListView.setStyle("");
        timeListView.setStyle("");

        gas = 100;
        food = 50;
        drink = 50;
        entertainment = 75;
        time = 100;

        mapGrid.drawBase();

        moveListView.getItems().add("--- Start ---");
        updateLists();
    }
}
