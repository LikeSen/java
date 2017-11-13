package example.fifteen_4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LambdaDemo extends Application {

	@Override
	public void start(Stage primaryStage)  {
		HBox hbox=new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		Button btOpen=new Button("Open");
		Button btNew=new Button("New");
		Button btSave=new Button("Save");
		Button btPrint=new Button("Print");
		
		hbox.getChildren().addAll(btNew,btOpen,btSave,btPrint);
		
		btNew.setOnAction((e) -> {
			System.out.println("1 Progress New");
			System.out.println("2 Progress New");
		});
		btOpen.setOnAction((e) -> {
			System.out.println("Progress Open");
		});
		
		btSave.setOnAction((e) -> {
			System.out.println("Progress Save");
		});
		
		btPrint.setOnAction((e) -> {
			System.out.println("Progress Print");
		});
		
		Scene scene =new Scene(hbox,300,50);
		
		primaryStage.setTitle("Lambda表达匿名对象");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
