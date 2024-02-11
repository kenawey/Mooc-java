package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane(); // main Borderpane 
        BorderPane borderPane1 = new BorderPane(); // on the top of VBox
        BorderPane borderPane2 = new BorderPane(); // second element in VBox 
        VBox topBox = new VBox(); // VBox in the top 
        Slider slider1 = new Slider(25, 250, 25);
        Slider slider2 = new Slider(0, 10, 0);
        slider2.setMax(10);
        slider2.setMin(0);
        slider1.setShowTickLabels(true);
        slider1.setShowTickMarks(true);
        slider2.setShowTickLabels(true);
        slider2.setShowTickMarks(true);
        Label label1 = new Label("Monthly savings");
        Label label1_2 = new Label("0");
        Label label2 = new Label("Yearly interest rate");
        Label label2_2 = new Label("0");
        borderPane1.setLeft(label1);
        borderPane1.setCenter(slider1);
        label1_2.setText(String.valueOf(slider1.getValue()));
        borderPane1.setRight(label1_2);

        borderPane2.setLeft(label2);
        borderPane2.setCenter(slider2);
        label2_2.setText(String.valueOf(slider2.getValue()));
        borderPane2.setRight(label2_2);
        topBox.getChildren().add(borderPane1);
        topBox.getChildren().add(borderPane2);
//        borderPane.getChildren().add(topBox);
        borderPane.setTop(topBox);

        // line chart 
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        yAxis.setAutoRanging(true);
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");

        borderPane.setCenter(lineChart);
        XYChart.Series rkpData = new XYChart.Series();
        Double[] values = new Double[31];
        for (int i = 0; i < 31; i++) {
            values[i] = i * 12 * slider1.getValue();
            double xrate = values[i] * (slider2.getValue() / 100);
            values[i] += xrate;
            rkpData.getData().add(new XYChart.Data(i, values[i]));

        }
        lineChart.getData().add(rkpData);

        slider1.valueProperty().addListener(
                new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                rkpData.getData().clear();
                label1_2.setText(newValue.toString());
                for (int i = 0; i < 31; i++) {
                    values[i] = i * 12 * slider1.getValue();

                    double xrate = values[i] * (slider2.getValue() / 100);
                    values[i] += xrate;
                    rkpData.getData().add(new XYChart.Data(i, values[i]));
                }
            }

        });

        slider2.valueProperty().addListener(
                new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                label2_2.setText(newValue.toString());
                rkpData.getData().clear();
                double interest = 0;
                for (int i = 0; i <= 30; i++) {
                    rkpData.getData().add(new XYChart.Data(i, interest));
                    interest = (interest + (12 * slider1.getValue())) * (1 + (slider2.getValue() / 100));
                }
            }

        });

        stage.setScene(new Scene(borderPane));
        stage.show();

    }

}
