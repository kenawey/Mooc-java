package hurraa;

import javafx.scene.media.AudioClip;
import java.io.File;
import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.spi.AudioFileReader;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);
  //        AudioClip hurraa = new AudioClip("file:Applause-Yannick_Lemieux.wav");
        nappi.setOnAction((event) -> {
          Media media = new Media("Applause-Yannick_Lemieux.wav");
            MediaPlayer mediaPlayer = new MediaPlayer(media);

            mediaPlayer.play();
        });
        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(HurraaSovellus.class);
    }

}
