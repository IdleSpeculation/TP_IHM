package com.exercice1;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class View1 {
    private Label label;
    private Button bouton;
    private Scene scene;
    private TextField textField;
    public View1(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        scene=new Scene(root);

        textField = new TextField();
        textField.setLayoutX(140);
        textField.setLayoutY(70);

        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        label=new Label("?");
        label.setLayoutX(175);
        label.setLayoutY(40);
        bouton = new Button("Valider");
        bouton.setLayoutX(140);
        bouton.setLayoutY(100);
        root.getChildren().add(textField);
        root.getChildren().add(bouton);
        root.getChildren().add(label);
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
    	label.setText(text);
    }
}