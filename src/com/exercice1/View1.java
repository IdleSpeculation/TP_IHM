package com.exercice1;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View1 {
    private Button bouton;
    private Scene scene;
    private TextField textField;
    public View1(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(150);
        scene=new Scene(root);

        textField = new TextField();
        textField.setText("0");


        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        bouton = new Button("Valider");
        HBox hbox = new HBox(textField, bouton);
        VBox vbox = new VBox( hbox);
        vbox.setLayoutX(95);
        vbox.setLayoutY(40);

        root.getChildren().add(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public Button getButton(){
        return bouton;
    }
    public TextField getTextField(){
        return textField;
    }
    public void setText(String text){
    	textField.setText(text);
    }

}