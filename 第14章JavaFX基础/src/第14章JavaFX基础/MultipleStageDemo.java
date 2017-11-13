package ��14��JavaFX����;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new Button("OK"),200,250);
		primaryStage.setTitle("MyJavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Stage stage = new Stage();
		stage.setTitle("Second Stage");
	
		stage.setScene ( new Scene(new Button("New Stage"),300, 300));
		stage.show();
		
		
	}
	public static void main(String[] args) {
		Application.launch(args);

	}
	
}
