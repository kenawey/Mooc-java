package application;

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {

        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Realative support of the  parties");

        Files.lines(Path.of("partiesdata.tsv")).
                dropWhile((t) -> t.subSequence(0, 5).equals("Party")).
                forEach((string) -> {

                    String[] pieces = string.split("\t");
                    Double[] values = new Double[pieces.length - 1];
                    XYChart.Series rkpData = new XYChart.Series();
                    rkpData.setName(pieces[0]);
                    int i = 0, year = 1968;
                    for (; i < values.length;) {
                        try {
                            values[i] = Double.parseDouble(pieces[i + 1]);
                        } catch (Exception e) {
//                   values[i] = 0.0;
                        }
                        rkpData.getData().add(new XYChart.Data(year, values[i]));
                        i++;
                        year += 4;
                    }
                    lineChart.getData().add(rkpData);

                });

        stage.setScene(new Scene(lineChart));
        stage.show();

    }

}
