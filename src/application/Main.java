package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author robert
 * 
 * If you want to implement user events
 * implement EventHandler<>
 */
public class Main extends Application{
	
	Button button;
	
	public static void main(String[] args) {
		// launch(args) comes from Application class and eventually calls start()
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of the window");
		
		button = new Button();
		button.setText("Click me");
		
		/**
		 * Add action on the button
		 * @param
		 * lambda: e
		 * e -> actions...
		 * or 
		 * e -> {
		 * 			action1...
		 * 			action2...
		 * 			action3...
		 * 		}
		 */
		button.setOnAction(e -> {
			System.out.println("yellow cat");
			System.out.println("brown rhino");
			System.out.println("blue bird");
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
}











