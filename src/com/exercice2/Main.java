package com.exercice2;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        View2 view2 = new View2(primaryStage) ;
        Stage secStage = new Stage();
        View1 view1 = new View1(secStage) ;
        Model model = new Model(0);

        Controller controller=new Controller(model,view1, view2);
        controller.control();
    }
    public static void main(String[] args) {
        launch(args);
    }
}