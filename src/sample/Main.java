package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private Controller controller;

    @Override
    public void start(Stage primaryStage) throws Exception{

        /*
        ------------------- Grid creation -------------------
         */
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setMaxWidth(100);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setMaxWidth(100);
        ColumnConstraints col3 = new ColumnConstraints();
        col3.setMaxWidth(100);
        ColumnConstraints col4 = new ColumnConstraints();
        col4.setMaxWidth(80);
        ColumnConstraints col5 = new ColumnConstraints();
        col5.setMaxWidth(50);
        ColumnConstraints col6 = new ColumnConstraints();
        col6.setMaxWidth(50);
        ColumnConstraints col7 = new ColumnConstraints();
        col7.setMaxWidth(50);
        ColumnConstraints col8 = new ColumnConstraints();
        col8.setMaxWidth(50);
        ColumnConstraints col9 = new ColumnConstraints();
        col9.setMaxWidth(50);

        grid.getColumnConstraints().addAll(col1, col2, col3, col4, col5, col6, col7, col8, col9);

        RowConstraints row1 = new RowConstraints();
        row1.setMaxHeight(40);
        row1.setMinHeight(40);
        RowConstraints row2 = new RowConstraints();
        row2.setMaxHeight(40);
        row2.setMinHeight(40);
        RowConstraints row3 = new RowConstraints();
        row3.setMaxHeight(40);
        row3.setMinHeight(40);
        RowConstraints row4 = new RowConstraints();
        row4.setMaxHeight(40);
        row4.setMinHeight(40);
        RowConstraints row5 = new RowConstraints();
        row5.setMaxHeight(40);
        row5.setMinHeight(40);
        RowConstraints row6 = new RowConstraints();
        row6.setMaxHeight(40);
        row6.setMinHeight(40);
        RowConstraints row7 = new RowConstraints();
        row7.setMaxHeight(40);
        row7.setMinHeight(40);
        RowConstraints row8 = new RowConstraints();
        row8.setMaxHeight(40);
        row8.setMinHeight(40);
        RowConstraints row9 = new RowConstraints();
        row9.setMaxHeight(40);
        row9.setMinHeight(40);
        RowConstraints row10 = new RowConstraints();
        row10.setMaxHeight(40);
        row10.setMinHeight(40);
        RowConstraints row11 = new RowConstraints();
        row11.setMaxHeight(40);
        row11.setMinHeight(40);
        RowConstraints row12 = new RowConstraints();
        row12.setMaxHeight(100);
        row12.setMinHeight(100);

        grid.getRowConstraints().addAll(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10, row11, row12);
        // ----

        MapGrid mapGrid = new MapGrid();
        grid.add(mapGrid.getCanvas(), 9, 1, 1, 10);

        // ---

        Image fuelImage = new Image("sample/emoji/fuel-pump-twitter.png");
        ImageView fuelView = new ImageView(fuelImage);
        fuelView.setFitHeight(30);
        fuelView.setFitWidth(30);
        grid.add(fuelView, 4, 0);
        
        Image hamburgerImage = new Image("sample/emoji/hamburger-twitter.png");
        ImageView hamburgerView = new ImageView(hamburgerImage);
        hamburgerView.setFitHeight(30);
        hamburgerView.setFitWidth(30);
        grid.add(hamburgerView, 5, 0);

        Image drinkImage = new Image("sample/emoji/cup-with-straw-twitter.png");
        ImageView drinkView = new ImageView(drinkImage);
        drinkView.setFitHeight(30);
        drinkView.setFitWidth(30);
        grid.add(drinkView, 6, 0);

        Image faceImage = new Image("sample/emoji/face-twitter.png");
        ImageView faceView = new ImageView(faceImage);
        faceView.setFitHeight(30);
        faceView.setFitWidth(30);
        grid.add(faceView, 7, 0);

        Image hourglassImage = new Image("sample/emoji/hourglass-twitter.png");
        ImageView hourglassView = new ImageView(hourglassImage);
        hourglassView.setFitHeight(30);
        hourglassView.setFitWidth(30);
        grid.add(hourglassView, 8, 0);
        
        ListView<String> moveListView = new ListView<String>();
        grid.add(moveListView, 3, 1, 1, 11);

        ListView<String> gasListView = new ListView<String>();
        grid.add(gasListView, 4, 1, 1, 11);

        ListView<String> foodListView = new ListView<String>();
        grid.add(foodListView, 5, 1, 1, 11);

        ListView<String> drinkListView = new ListView<String>();
        grid.add(drinkListView, 6, 1, 1, 11);

        ListView<String> entertainmentListView = new ListView<String>();
        grid.add(entertainmentListView, 7, 1, 1, 11);

        ListView<String> timeListView = new ListView<String>();
        grid.add(timeListView, 8, 1, 1, 11);

        controller = new Controller(moveListView, gasListView, foodListView, drinkListView, entertainmentListView, timeListView, mapGrid);

        /*
        ------------------- Buttons -------------------
         */

        Button upButton = new Button();
        Image upImage = new Image("sample/emoji/up-arrow-twitter.png");
        ImageView upView = new ImageView(upImage);
        upView.setFitHeight(30);
        upView.setFitWidth(30);
        upButton.setGraphic(upView);
        upButton.setOnAction(e -> controller.up());

        Button downButton = new Button();
        Image downImage = new Image("sample/emoji/down-arrow-twitter.png");
        ImageView downView = new ImageView(downImage);
        downView.setFitHeight(30);
        downView.setFitWidth(30);
        downButton.setGraphic(downView);
        downButton.setOnAction(e -> controller.down());

        Button leftButton = new Button();
        Image leftImage = new Image("sample/emoji/left-arrow-twitter.png");
        ImageView leftView = new ImageView(leftImage);
        leftView.setFitHeight(30);
        leftView.setFitWidth(30);
        leftButton.setGraphic(leftView);
        leftButton.setOnAction(e -> controller.left());

        Button rightButton = new Button();
        Image rightImage = new Image("sample/emoji/right-arrow-twitter.png");
        ImageView rightView = new ImageView(rightImage);
        rightView.setFitHeight(30);
        rightView.setFitWidth(30);
        rightButton.setGraphic(rightView);
        rightButton.setOnAction(e -> controller.right());

        Button gasButton = new Button();
        Image gasImage = new Image("sample/emoji/fuel-pump-twitter.png");
        ImageView gasView = new ImageView(gasImage);
        gasView.setFitHeight(30);
        gasView.setFitWidth(30);
        gasButton.setGraphic(gasView);
        gasButton.setOnAction(e -> controller.gasStation());

        Button flowerButton = new Button();
        Image flowerImage = new Image("sample/emoji/blossom-twitter.png");
        ImageView flowerView = new ImageView(flowerImage);
        flowerView.setFitHeight(30);
        flowerView.setFitWidth(30);
        flowerButton.setGraphic(flowerView);
        flowerButton.setOnAction(e -> controller.flower());

        Button ballroomButton = new Button();
        Image ballroomImage = new Image("sample/emoji/woman-dancing-twitter.png");
        ImageView ballroomView = new ImageView(ballroomImage);
        ballroomView.setFitHeight(30);
        ballroomView.setFitWidth(30);
        ballroomButton.setGraphic(ballroomView);
        ballroomButton.setOnAction(e -> controller.ballroom());

        Button coffeeButton = new Button();
        Image coffeeImage = new Image("sample/emoji/hot-beverage-twitter.png");
        ImageView coffeeView = new ImageView(coffeeImage);
        coffeeView.setFitHeight(30);
        coffeeView.setFitWidth(30);
        coffeeButton.setGraphic(coffeeView);
        coffeeButton.setOnAction(e -> controller.coffee());

        Button juiceButton = new Button();
        Image juiceImage = new Image("sample/emoji/beverage-box-twitter.png");
        ImageView juiceView = new ImageView(juiceImage);
        juiceView.setFitHeight(30);
        juiceView.setFitWidth(30);
        juiceButton.setGraphic(juiceView);
        juiceButton.setOnAction(e -> controller.juice());

        Button theaterButton = new Button();
        Image theaterImage = new Image("sample/emoji/performing-arts-twitter.png");
        ImageView theaterView = new ImageView(theaterImage);
        theaterView.setFitHeight(30);
        theaterView.setFitWidth(30);
        theaterButton.setGraphic(theaterView);
        theaterButton.setOnAction(e -> controller.theater());

        Button spaghettButton = new Button();
        Image spaghettiImage = new Image("sample/emoji/spaghetti-twitter.png");
        ImageView spaghettiView = new ImageView(spaghettiImage);
        spaghettiView.setFitHeight(30);
        spaghettiView.setFitWidth(30);
        spaghettButton.setGraphic(spaghettiView);
        spaghettButton.setOnAction(e -> controller.spaghett());

        Button tacoButton = new Button();
        Image tacoImage = new Image("sample/emoji/taco-twitter.png");
        ImageView tacoView = new ImageView(tacoImage);
        tacoView.setFitHeight(30);
        tacoView.setFitWidth(30);
        tacoButton.setGraphic(tacoView);
        tacoButton.setOnAction(e -> controller.taco());

        Button cocktailButton = new Button();
        Image cocktailImage = new Image("sample/emoji/tropical-drink-twitter.png");
        ImageView cocktailView = new ImageView(cocktailImage);
        cocktailView.setFitHeight(30);
        cocktailView.setFitWidth(30);
        cocktailButton.setGraphic(cocktailView);
        cocktailButton.setOnAction(e -> controller.cocktail());

        Button fairButton = new Button();
        Image fairImage = new Image("sample/emoji/ferris-wheel-twitter.png");
        ImageView fairView = new ImageView(fairImage);
        fairView.setFitHeight(30);
        fairView.setFitWidth(30);
        fairButton.setGraphic(fairView);
        fairButton.setOnAction(e -> controller.fair());

        Button sandwichButton = new Button();
        Image sandwichImage = new Image("sample/emoji/sandwich-twitter.png");
        ImageView sandwichView = new ImageView(sandwichImage);
        sandwichView.setFitHeight(30);
        sandwichView.setFitWidth(30);
        sandwichButton.setGraphic(sandwichView);
        sandwichButton.setOnAction(e -> controller.sandwich());

        Button airportButton = new Button();
        Image airportImage = new Image("sample/emoji/airplane-twitter.png");
        ImageView airportView = new ImageView(airportImage);
        airportView.setFitHeight(30);
        airportView.setFitWidth(30);
        airportButton.setGraphic(airportView);
        airportButton.setOnAction(e -> controller.airport());

        Button homeButton = new Button();
        Image homeImage = new Image("sample/emoji/house-twitter.png");
        ImageView homeView = new ImageView(homeImage);
        homeView.setFitHeight(30);
        homeView.setFitWidth(30);
        homeButton.setGraphic(homeView);
        homeButton.setOnAction(e -> controller.home());

        Button jewelryButton = new Button();
        Image jewelryImage = new Image("sample/emoji/ring-twitter.png");
        ImageView jewelryView = new ImageView(jewelryImage);
        jewelryView.setFitHeight(30);
        jewelryView.setFitWidth(30);
        jewelryButton.setGraphic(jewelryView);
        jewelryButton.setOnAction(e -> controller.jewelry());

        Button shoppingButton = new Button();
        Image shoppingImage = new Image("sample/emoji/shopping-bags-twitter.png");
        ImageView shoppingView = new ImageView(shoppingImage);
        shoppingView.setFitHeight(30);
        shoppingView.setFitWidth(30);
        shoppingButton.setGraphic(shoppingView);
        shoppingButton.setOnAction(e -> controller.shopping());

        Button refreshButton = new Button();
        Image refreshImage = new Image("sample/emoji/refresh-twitter.png");
        ImageView refreshView = new ImageView(refreshImage);
        refreshView.setFitHeight(30);
        refreshView.setFitWidth(30);
        refreshButton.setGraphic(refreshView);
        refreshButton.setOnAction(e -> controller.clear());
        
        grid.add(spaghettButton, 0, 1);
        grid.add(tacoButton, 0, 2);
        grid.add(sandwichButton, 0, 3);
        grid.add(coffeeButton, 0, 4);
        grid.add(juiceButton, 0, 5);

        grid.add(flowerButton, 1, 1);
        grid.add(ballroomButton, 1, 2);
        grid.add(theaterButton, 1, 3);
        grid.add(fairButton, 1, 4);
        grid.add(cocktailButton, 1, 5);

        grid.add(gasButton, 2, 1);
        grid.add(airportButton, 2, 2);
        grid.add(homeButton, 2, 3);
        grid.add(jewelryButton, 2, 4);
        grid.add(shoppingButton, 2, 5);

        grid.add(upButton, 1, 7);
        grid.add(downButton, 1, 8);
        grid.add(leftButton, 0, 8);
        grid.add(rightButton, 2, 8);

        grid.add(refreshButton, 1, 10);

        /*
        ------------------- Primary Stage final settings -------------------
         */
        primaryStage.setTitle("Karuta Date Step Simulator");
        primaryStage.setScene(new Scene(grid, 1200, 800));

        primaryStage.getScene().getStylesheets().add("sample/style.css");
        controller.setScene(primaryStage.getScene());

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
