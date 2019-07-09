package com.exercice1;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View2 {
	
    private Button bouton;
    private Scene scene;
    private Spinner<Integer> spinner;
    
    public View2(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(150);
        scene=new Scene(root);
//ajouter un spinner
        spinner = new Spinner<Integer>();
        spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, 0));


//ajouter un bouton
        bouton = new Button("Valider");

        HBox hbox = new HBox(spinner, bouton);
        VBox vbox = new VBox( hbox);
        vbox.setLayoutX(95);
        vbox.setLayoutY(40);

        //root.getChildren().add(spinner);
        //root.getChildren().add(bouton);
        root.getChildren().add(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public Button getButton(){
        return bouton;
    }
    public Spinner getSpinner(){
        return spinner;
    }
    public void setValue(int value){
    	spinner.getValueFactory().setValue(value);
    }
}
