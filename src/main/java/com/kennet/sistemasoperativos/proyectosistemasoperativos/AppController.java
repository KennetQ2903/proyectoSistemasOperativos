package com.kennet.sistemasoperativos.proyectosistemasoperativos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppController {


    List<Rectangle> rectanglesA = new ArrayList<>();
    List<Rectangle> rectanglesB = new ArrayList<>();
    List<Rectangle> rectanglesC = new ArrayList<>();
    List<Rectangle> rectanglesD = new ArrayList<>();
    public Pane panel;
    //CARRIL A Y INICIA EN 16 Y FINALIZA EN 452, X = 318
    public TextField carrilA;
    //CARRIL B Y = 449, X INICIA EN 620 Y FINALIZA EN 318
    public TextField carrilB;
    //CARRIL C X = 318, Y INICIA EN 855 y FINALIZA 452
    public TextField carrilC;

    //CARRIL D Y = 449, X INICIA EN 16 Y FINALIZA EN 318
    public TextField carrilD;

    public Button startButton;


    private boolean validateData() {
        String regex = "^[01,]*$";
        Pattern pattern = Pattern.compile(regex);
        String carrilAVal = carrilA.getText().replaceAll("\\s", "");
        String carrilBVal = carrilB.getText().replaceAll("\\s", "");
        String carrilCVal = carrilC.getText().replaceAll("\\s", "");
        String carrilDVal = carrilD.getText().replaceAll("\\s", "");
        Matcher matcherA = pattern.matcher(carrilAVal);
        Matcher matcherB = pattern.matcher(carrilBVal);
        Matcher matcherC = pattern.matcher(carrilCVal);
        Matcher matcherD = pattern.matcher(carrilDVal);
        return matcherA.matches() && matcherB.matches() && matcherC.matches() && matcherD.matches();
    }

    private boolean validateLength(){
        String carrilAVal = carrilA.getText();
        String carrilBVal = carrilB.getText();
        String carrilCVal = carrilC.getText();
        String carrilDVal = carrilD.getText();

        boolean elementsA = carrilAVal.replaceAll("\\s", "").split(",").length <= 10;
        boolean elementsB = carrilBVal.replaceAll("\\s", "").split(",").length <= 10;
        boolean elementsC = carrilCVal.replaceAll("\\s", "").split(",").length <= 10;
        boolean elementsD = carrilDVal.replaceAll("\\s", "").split(",").length <= 10;

        return elementsA && elementsB && elementsC && elementsD;
    }

    private void createRectangles(){
        String carrilAVal = carrilA.getText();
        String carrilBVal = carrilB.getText();
        String carrilCVal = carrilC.getText();
        String carrilDVal = carrilD.getText();
        String[] elementsA = carrilAVal.replaceAll("\\s", "").split(",");
        String[] elementsB = carrilBVal.replaceAll("\\s", "").split(",");
        String[] elementsC = carrilCVal.replaceAll("\\s", "").split(",");
        String[] elementsD = carrilDVal.replaceAll("\\s", "").split(",");


        for(String e : elementsA){
            if(Objects.equals(e, "1")){
                Rectangle rectangle = new Rectangle(50, 50, 50, 50);
                rectangle.setArcWidth(5.0);
                rectangle.setArcHeight(5.0);
                rectangle.setFill(Color.DODGERBLUE);
                rectangle.setStroke(Color.BLACK);
                rectangle.setStrokeType(StrokeType.INSIDE);
                rectanglesA.add(rectangle);
            }
        }
        for(String e : elementsB){
            if(Objects.equals(e, "1")){
                Rectangle rectangle = new Rectangle(50, 50, 50, 50);
                rectangle.setArcWidth(5.0);
                rectangle.setArcHeight(5.0);
                rectangle.setFill(Color.DODGERBLUE);
                rectangle.setStroke(Color.BLACK);
                rectangle.setStrokeType(StrokeType.INSIDE);
                rectanglesB.add(rectangle);
            }
        }
        for(String e : elementsC){
            if(Objects.equals(e, "1")){
                Rectangle rectangle = new Rectangle(50, 50, 50, 50);
                rectangle.setArcWidth(5.0);
                rectangle.setArcHeight(5.0);
                rectangle.setFill(Color.DODGERBLUE);
                rectangle.setStroke(Color.BLACK);
                rectangle.setStrokeType(StrokeType.INSIDE);
                rectanglesC.add(rectangle);
            }
        }
        for(String e : elementsD){
            if(Objects.equals(e, "1")){
                Rectangle rectangle = new Rectangle(50, 50, 50, 50);
                rectangle.setArcWidth(5.0);
                rectangle.setArcHeight(5.0);
                rectangle.setFill(Color.DODGERBLUE);
                rectangle.setStroke(Color.BLACK);
                rectangle.setStrokeType(StrokeType.INSIDE);
                rectanglesD.add(rectangle);
            }
        }
    }

    @FXML
    public void startSemaphore() {
        if (!validateData()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cadena No Válida");
            alert.setHeaderText(null);
            alert.setContentText("Ingrese una cadena valida (e.j. 1, 0, 0, 1)");
            alert.showAndWait();
        }
        if (!validateLength()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cadena No Válida");
            alert.setHeaderText(null);
            alert.setContentText("La cadena debe tener máximo 10 elementos separados por comas");
            alert.showAndWait();
        }
        createRectangles();
    }
}
