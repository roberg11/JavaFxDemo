package gridPane;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author robert
 * 
 * If you want to implement user events
 * implement EventHandler<>
 */
public class Main extends Application{
	
	Stage window;
	
	public static void main(String[] args) {
		// launch(args) comes from Application class and eventually calls start()
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("The title");
		
		GridPane mygrid = new GridPane();
		mygrid.setPadding(new Insets(10, 10, 10, 10));
		mygrid.setVgap(8);
		mygrid.setHgap(10);
		
		// Name label
		Label namelabel = new Label("Username");
		GridPane.setConstraints(namelabel, 0, 0);
		
		// Name input
		TextField nameInput = new TextField("Rob");
		GridPane.setConstraints(nameInput, 1, 0);
		
		// Password label
		Label passlabel = new Label("Password");
		GridPane.setConstraints(passlabel, 0, 1);
		
		// Password input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);
		
		Button loginButton = new Button("Log in");
		GridPane.setConstraints(loginButton, 1, 2);
		
		mygrid.getChildren().addAll(namelabel, nameInput, passlabel, passInput, loginButton);
		
		Scene scene = new Scene(mygrid, 300, 200);
		window.setScene(scene);
		
		window.show();
	}
	
	
}











