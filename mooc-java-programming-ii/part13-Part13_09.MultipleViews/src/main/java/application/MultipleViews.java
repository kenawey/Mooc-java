package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Label("First view!"));
        Button second = new Button("To the second view!"),
                third = new Button("To the third view!"),
                first = new Button("To the first view!");
        borderPane.setCenter(second);
        VBox verticalBox = new VBox();
        verticalBox.getChildren().add(third);
        verticalBox.getChildren().add(new Label("Second view!"));
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Third view!"), 0, 0);
        gridPane.add(first, 1, 1);
        Scene s2= new Scene(verticalBox);
        Scene s1= new Scene(borderPane);
        Scene s3= new Scene(gridPane);
        
        first.setOnAction((t) -> {
            
            stage.setScene(s1);
           
        });
        second.setOnAction((t) -> {
            
            stage.setScene(s2);
           
        });
        
        third.setOnAction((t) -> {
            
            stage.setScene(s3);
           
        });
       
   stage.setScene(s1);
     stage.show();
    }

}
