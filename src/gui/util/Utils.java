package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {
	
	//Este método pega a referência da janela atual
	//Mas com um paramêtro do tipo ActionEvent
	public static Stage currentStage(ActionEvent event) {
		return (Stage)  ((Node) event.getSource()).getScene().getWindow();
	}
	
	//Este método converte um valor em inteiro
	//Caso não seja possível fazer a conversão, retornará null
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
		}catch(NumberFormatException e) {
			return null;
		}
		
	}
}
