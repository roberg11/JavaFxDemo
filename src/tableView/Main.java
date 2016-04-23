package tableView;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {

	Stage window;
	TableView<Product> table;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		window = primaryStage;
		window.setTitle("Table View - JavaFX");
		
		// Name column
		TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		// Price column
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		// Quantity column
		TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
		quantityColumn.setMinWidth(200);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table);
		
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
		
	}
	
	// Get all of the products
	public ObservableList<Product> getProduct(){
		// FXCollections.observableArrayList() is a collection
		// that can store objects
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop", 599.00, 4));
		products.add(new Product("Kitchen knife", 49.20, 7));
		products.add(new Product("Frying pan", 72.90, 3));
		products.add(new Product("Gladiator DVD", 19.99, 51));
		products.add(new Product("ETH Cord", 6.99, 28));
		return products;
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
