package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
	
	static int counter = 0;
	
	@FXML
	private TextArea TField;
	
	public void CountingPlus(ActionEvent event) {
		counter++;
		//System.out.println(counter ++);
		String plus = Integer.toString(counter);
		TField.setText(plus);
		
	}
	
	
	public void CountingMinus(ActionEvent event) {
		counter--;
		String minus = Integer.toString(counter);
		TField.setText(minus);
		}
	public void Reset (ActionEvent event) {
			
	 counter = 0;
	 String reset = Integer.toString(counter);
			TField.setText(reset);
		}
		
}
