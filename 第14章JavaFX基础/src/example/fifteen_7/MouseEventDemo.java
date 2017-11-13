package example.fifteen_7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)  {
		Pane pane=new Pane();
		Text text=new Text(20, 20, "programming is fun");
		pane.getChildren().addAll(text);
		
		text.setOnMouseDragged(e->{
			text.setX(e.getX());
			text.setY(e.getY());
		});
		
		
		Scene scene=new Scene(pane,300,100);
		primaryStage.setTitle("Êó±êÊÂ¼ş");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
