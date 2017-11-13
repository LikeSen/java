package example.fifteen_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleWithEventHandler extends Application {
	private CirclePane circlePane=new CirclePane();
	
	public void start(Stage primaryStage) {
		
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);

		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");

		hbox.getChildren().addAll(btEnlarge, btShrink);

		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		BorderPane borderPane=new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hbox);
		BorderPane.setAlignment(hbox, Pos.CENTER);
		
		Scene scene=new Scene(borderPane, 200, 150);
		primaryStage.setTitle("¿ØÖÆÔ²");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		

	}

	public static void main(String[] args) {
		Application.launch(args);

	}
	class EnlargeHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			circlePane.enlarge();

		}

	}
	class ShrinkHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			circlePane.shrink();

		}

	}

}



class CirclePane extends StackPane {
	private Circle circle = new Circle(50);

	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);

	}

	public void enlarge() {
		circle.setRadius(circle.getRadius() + 2);

	}

	public void shrink() {

		if (circle.getRadius() > 2) {
			circle.setRadius(circle.getRadius() - 2);
		} else {
			circle.setRadius(circle.getRadius());
		}

	}

}
