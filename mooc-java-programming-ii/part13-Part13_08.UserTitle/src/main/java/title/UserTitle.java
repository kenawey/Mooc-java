package title;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserTitle extends Application {

    private String windowTitle;

   

    @Override
    public void start(Stage stage) throws Exception {
         Parameters params = getParameters();
         this.windowTitle=params.getNamed().get("title");
    stage.setTitle(windowTitle);
    
    
    
       
        stage.show();
    }

}
