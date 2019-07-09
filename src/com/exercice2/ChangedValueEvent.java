package com.exercice2;

import java.util.EventObject;
public class ChangedValueEvent extends EventObject {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int newValue;

    public ChangedValueEvent(Object source, int newValue){
        super(source);
        this.newValue = newValue;
    }

    public int getNewValue(){
        return newValue;
    }
    
}