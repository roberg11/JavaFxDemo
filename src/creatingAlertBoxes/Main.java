package creatingAlertBoxes;
	
import javafx.application.Application;
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
	
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		// launch(args) comes from Application class and eventually calls start()
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("The title");
		
		button = new Button("click me");
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Title of the window", "Are you sure of whatever");
			System.out.println(result);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
	
}











