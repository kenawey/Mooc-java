package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    public static void main(String[] args) {
        launch(JokeApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane mainView = new BorderPane();
        Button first = new Button("Joke"),
                second = new Button("Answer"),
                third = new Button("Explanation");
        Label disc = new Label("What do you call a bear with no teeth?");
        
        first.setOnAction((t) -> {
        disc.setText("What do you call a bear with no teeth?");
        });
        second.setOnAction((t) -> {
        disc.setText("A gummy bear.");
        });
        third.setOnAction((t) -> {
        disc.setText("explanation");
        });

        HBox horizontalView = new HBox();
        horizontalView.setPadding(new Insets(20, 20, 20, 20));
        horizontalView.setSpacing(10);
        horizontalView.getChildren().addAll(first, second, third);
        mainView.setTop(horizontalView);
        mainView.setCenter(disc);
        stage.setScene(new Scene(mainView));
        stage.show();

    }
}
