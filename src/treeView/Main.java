package treeView;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;

public class Main extends Application {

	Stage window;
	Scene scene;
	TreeView<String> tree;
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("TreeView");
		
		TreeItem<String> root, rob, kat;
		
		// Root
		root = new TreeItem<>();
		root.setExpanded(true);
		
		// Rob branch
		rob = makeBranch("Rob", root);
		makeBranch("stackoverflow", rob);
		makeBranch("YouTube", rob);
		makeBranch("Android Studio", rob);
		
		
		// Kat branch
		kat = makeBranch("Kat", root);
		makeBranch("Facebook", kat);
		makeBranch("Instagram", kat);
		makeBranch("VG", kat);
		
		// Create tree
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty()
			.addListener((v, oldValue, newValue) -> {
				if(newValue != null){
					System.out.println(newValue.getValue());
				}
			});
		
		//Layout
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
	
	// Create branches
	public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
		TreeItem<String> item = new TreeItem<String>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
