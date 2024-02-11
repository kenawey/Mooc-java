package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();

//        HBox buttons = new HBox();
       // buttons.setSpacing(10);
//        buttons.getChildren().add(new Button("First"));
//        buttons.getChildren().add(new Button("Second"));
//        buttons.getChildren().add(new Button("Third"));

        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(new Label("Letters: 0"));
        texts.getChildren().add(new Label("Words: 0"));
        texts.getChildren().add(new Label("The longest word is:"));

//        layout.setTop(buttons);
        layout.setBottom(texts);

        layout.setCenter(new TextArea(""));

        Scene view = new Scene(layout);

        stage.setScene(view);
        stage.show();
        
    }

}
