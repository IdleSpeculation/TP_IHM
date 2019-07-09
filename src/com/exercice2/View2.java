package com.exercice2;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class View2 implements ChangedValueListener{
	
    //private Label label;
    private Button bouton;
    private Scene scene;
    private Spinner<Integer> spinner ;
    
    public View2(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(150);
        scene=new Scene(root);

        spinner = new Spinner<Integer>();
        spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, 0));

        //spinner.setLayoutX(140);
        //spinner.setLayoutY(70);

        //label=new Label("?");
        //label.setLayoutX(175);
        //label.setLayoutY(40);

        bouton = new Button("Valider");
        //bouton.setLayoutX(140);
        //bouton.setLayoutY(100);
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
    public Spinner<Integer> getSpinner(){
        return spinner;
    }
//    public void setText(String text){label.setText(text);}

    @Override
    public void volumeChanged(ChangedValueEvent event) {
        int value = event.getNewValue();
       // label.setText(Integer.toString(value));
        spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, value));
    }
}
