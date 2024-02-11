package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        TextField textField = new TextField();
        VBox virticalBox = new VBox();
        // BorderPane borderPane=new BorderPane();

        Button button = new Button("Update");
        Label label = new Label();
        button.setOnAction((ActionEvent t)
                -> label.setText(textField.getText())
        );
        virticalBox.getChildren().add(textField);
        virticalBox.getChildren().add(button);
        virticalBox.getChildren().add(label);
        // borderPane.setTop(virticalBox);

        Scene scene = new Scene(virticalBox);
        stage.setScene(scene);
        stage.show();

    }

}
