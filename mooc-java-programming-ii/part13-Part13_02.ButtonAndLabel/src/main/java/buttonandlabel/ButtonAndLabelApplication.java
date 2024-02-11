package buttonandlabel;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b = new Button("this is a Button");
        Label l =new Label("Label");
       // Group group=new Group();
       // group.getChildren().add(b);
        //group.getChildren().add(l);
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(l);
        flowPane.getChildren().add(b);
       
        Scene s =new Scene(flowPane);
        stage.setScene(s);
        stage.show();
    }

}
