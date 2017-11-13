package example.forteen_7;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class NodeStyleRotateDemo extends Application {
	public void start(Stage primaryStage){
		StackPane pane =new StackPane();
		Button btOK =new Button("OK");
		
		btOK.setStyle("-fx-border-coloe:blue;");
		btOK.setRotate(-15);
		pane.getChildren().add(btOK);
		pane.setRotate(45);
		pane.setStyle("-fx-border-color:red;-fx-background-color:lightgray;");
		
		Scene scene=new Scene(pane,200,250);
		
		primaryStage.setTitle("节点风格和角度");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
