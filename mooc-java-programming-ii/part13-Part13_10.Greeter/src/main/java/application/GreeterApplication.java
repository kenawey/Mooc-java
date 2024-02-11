package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

import javafx.stage.Stage;



public class GreeterApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label instructionText = new Label("Ener your name and start."), welcome = new Label();
        TextField textField = new TextField();
        Button startButton = new Button("Start");
        GridPane formLayout = new GridPane();
        formLayout.setPrefSize(300, 180);
        formLayout.add(instructionText, 0, 0);
        formLayout.add(textField, 0, 1);
        formLayout.add(startButton, 0, 2);
        formLayout.setAlignment(Pos.CENTER);
        formLayout.setVgap(10);
        formLayout.setHgap(10);
        formLayout.setPadding(new Insets(20, 20, 20, 20));

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcome);
        welcomeLayout.setAlignment(Pos.CENTER);
        startButton.setOnAction((event) -> {

            welcome.setText("Welcome " + textField.getText() + "!");
            stage.setScene(new Scene(welcomeLayout));
        });

        stage.setScene(new Scene(formLayout));
        stage.show();
    }
}
