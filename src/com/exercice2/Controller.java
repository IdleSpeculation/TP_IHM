package com.exercice2;

public class Controller {
    private Model model;
    private View1 view1;
    private View2 view2;

    public Controller(Model model, View1 view1, View2 view2) {
        this.model = model;
        this.view1 = view1;
        this.view2 = view2;
        this.model.addVolumeListener(view1);
        this.model.addVolumeListener(view2);

    }

    public void control() {

    	view1.getButton().setOnAction(e -> traitClicMethod(1));
    	view2.getButton().setOnAction(e -> traitClicMethod(2));

    	
    }

    private void traitClicMethod(int view) {
    	int value;
    	if (view==1)
    		value =  Integer.parseInt(view1.getTextField().getText());
    	else 
    		value =  (Integer)view2.getSpinner().getValue();
    	
        model.setValue(value);
    }
}
