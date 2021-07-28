package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    private int gas;
    private int food;
    private int drink;
    private int entertainment;
    private int time;

    private int count;

    private Map<Button, Integer> buttonMap = new HashMap<>();

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

        addButtonToMap((Button) scene.lookup("#flowerButton"));
    }

    public void ballroom() {
        entertainment = entertainment + 100;
        drink = drink - 15;
        food = food - 10;
        use();

        moveListView.getItems().add("Ballroom");
        updateLists();

        addButtonToMap((Button) scene.lookup("#ballroomButton"));
    }

    public void coffee() {
        drink = drink + 60;
        use();

        moveListView.getItems().add("Coffee");
        updateLists();

        addButtonToMap((Button) scene.lookup("#coffeeButton"));
    }

    public void juice() {
        drink = drink + 60;
        use();

        moveListView.getItems().add("Juice");
        updateLists();

        addButtonToMap((Button) scene.lookup("#juiceButton"));
    }

    public void theater() {
        entertainment = entertainment + 60;
        use();

        moveListView.getItems().add("Theater");
        updateLists();

        addButtonToMap((Button) scene.lookup("#theaterButton"));
    }

    public void spaghett() {
        food = food + 60;
        use();

        moveListView.getItems().add("Spaghett");
        updateLists();

        addButtonToMap((Button) scene.lookup("#spaghettButton"));
    }

    public void taco() {
        food = food + 60;
        use();

        moveListView.getItems().add("Taco");
        updateLists();

        addButtonToMap((Button) scene.lookup("#tacoButton"));
    }

    public void cocktail() {
        drink = drink + 40;
        entertainment = entertainment + 40;
        use();

        moveListView.getItems().add("Cocktail");
        updateLists();

        addButtonToMap((Button) scene.lookup("#cocktailButton"));
    }

    public void fair() {
        food = food + 20;
        drink = drink + 20;
        entertainment = entertainment + 40;
        use();

        moveListView.getItems().add("Fair");
        updateLists();

        addButtonToMap((Button) scene.lookup("#fairButton"));
    }

    public void sandwich() {
        food = food + 40;
        drink = drink + 20;
        use();

        moveListView.getItems().add("Sandwich");
        updateLists();

        addButtonToMap((Button) scene.lookup("#sandwichButton"));
    }

    public void airport() {
        entertainment = entertainment - 10;
        use();

        moveListView.getItems().add("Airport");
        updateLists();

        resetMap();
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

        count++;

        mapCountDown();

        validate();
    }

    private void validate() {
        if (food <= 0) {
            foodListView.setStyle("-fx-background-color: red;");
        }
        else {
            foodListView.setStyle("");
        }
        if (drink <= 0) {
            drinkListView.setStyle("-fx-background-color: red;");
        }
        else {
            drinkListView.setStyle("");
        }
        if (entertainment <= 0) {
            entertainmentListView.setStyle("-fx-background-color: red;");
        }
        else {
            entertainmentListView.setStyle("");
        }
        if (gas <= 0) {
            gasListView.setStyle("-fx-background-color: red;");
        }
        else {
            gasListView.setStyle("");
        }

        if (food <= 0 || drink <= 0 || entertainment <= 0 || gas <= 0) {
            return;
        }
        if (time == 0) {
            gasListView.setStyle("-fx-background-color: green;");
            drinkListView.setStyle("-fx-background-color: green;");
            foodListView.setStyle("-fx-background-color: green;");
            entertainmentListView.setStyle("-fx-background-color: green;");
            timeListView.setStyle("-fx-background-color: green;");
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

        count = 0;

        mapGrid.drawBase();

        buttonMap.clear();

        moveListView.getItems().add("--- Start ---");
        updateLists();
    }

    public void revertStep() {
        count--;

        gas = Integer.parseInt(gasListView.getItems().get(count-1));
        food = Integer.parseInt(foodListView.getItems().get(count-1));
        drink = Integer.parseInt(drinkListView.getItems().get(count-1));
        entertainment = Integer.parseInt(entertainmentListView.getItems().get(count-1));
        time = Integer.parseInt(timeListView.getItems().get(count-1));

        moveListView.getItems().remove(count);
        gasListView.getItems().remove(count);
        foodListView.getItems().remove(count);
        drinkListView.getItems().remove(count);
        entertainmentListView.getItems().remove(count);
        timeListView.getItems().remove(count);

        mapCountUp();

        validate();
    }

    private void addButtonToMap(Button button) {
        button.setDisable(true);
        buttonMap.put(button, 10);
    }

    private void mapCountDown() {
        for (Map.Entry<Button, Integer> entry : buttonMap.entrySet()) {
            entry.setValue(entry.getValue() - 1);
            entry.getKey().setDisable(entry.getValue() > 0 && entry.getValue() <= 10);
        }
    }

    private void mapCountUp() {
        for (Map.Entry<Button, Integer> entry : buttonMap.entrySet()) {
            entry.setValue(entry.getValue() + 1);
            entry.getKey().setDisable(entry.getValue() > 0 && entry.getValue() <= 10);
        }
    }

    private void resetMap() {
        for (Map.Entry<Button, Integer> entry : buttonMap.entrySet()) {
            entry.setValue(0);
            entry.getKey().setDisable(false);
        }
    }
}
