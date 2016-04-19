package creatingAlertBoxes;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class ConfirmBox {
	
	static boolean answer;
	
	public static boolean display(String title, String message){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		
		// Label stuff
		Label label = new Label();
		label.setText(message);
		
		// button stuff
		Button yesButton = new Button("yes");
		Button noButton = new Button("no");
			
		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
				
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
		});
		
		// layout stuff
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);
		
		
		// Scene and window stuff
		Scene scene = new Scene(layout);
		window.setScene(scene);
		// showAndWait() shows the window and needs to be closed
		// before going back to the main window
		window.showAndWait();
		
		return answer;
	}

}
