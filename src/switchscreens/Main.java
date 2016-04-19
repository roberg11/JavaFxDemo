package switchscreens;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author robert
 * 
 * If you want to implement user events
 * implement EventHandler<>
 */
public class Main extends Application{
	
	Stage window;
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		// launch(args) comes from Application class and eventually calls start()
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		Label label = new Label("Welcome to the first scene");
		Button button1 = new Button();
		button1.setText("Go to scene 2");
		button1.setOnAction(e -> window.setScene(scene2));
		
		// Layout 1 - children are laid out in a vertical column
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		// Button 2
		Button button2 = new Button("This is scene 2");
		button2.setOnAction(e-> window.setScene(scene1));
		
		// Layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600, 300);
		
		window.setScene(scene1);
		window.setTitle("Title here");
		window.show();
	}
	
	
}











