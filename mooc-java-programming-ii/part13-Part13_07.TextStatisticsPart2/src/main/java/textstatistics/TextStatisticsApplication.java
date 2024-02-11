package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
        Label Letters = new Label("Letters: 0");
        texts.getChildren().add(Letters);
        Label Words = new Label("Words: 0");
        texts.getChildren().add(Words);
        Label longestLabel = new Label("The longest word is: ");
        texts.getChildren().add(longestLabel);

//        layout.setTop(buttons);
        layout.setBottom(texts);
        TextArea t = new TextArea("");
        layout.setCenter(t);
        t.textProperty().addListener((ObservableValue<? extends String> ov, String t1, String newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
           
            Letters.setText("Letters: " + characters);
            Words.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);

            // set values of text elements
        });
        
        Scene view = new Scene(layout);
        
        stage.setScene(view);
        stage.show();
        
    }
    
}
