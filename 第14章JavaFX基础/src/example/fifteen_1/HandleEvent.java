
package example.fifteen_1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class HandleEvent extends Application{
    public void start(Stage primaryStage){
        HBox pane=new HBox(10);
        pane.setAlignment(Pos.CENTER);
       Button btOK=new Button("OK");
       Button btCancel=new Button("Cancel");
       OKHandlerClass handle=new OKHandlerClass();
       btOK.setOnAction(handle);
       CancelHandlerClass handler2=new CancelHandlerClass();
       
       btCancel.setOnAction(handler2);
       pane.getChildren().addAll(btOK,btCancel);
       
       Scene scene=new Scene(pane);
       
       primaryStage.setTitle("ÊÂ¼þ");
       primaryStage.setScene(scene);
       primaryStage.show();
       
       
    }
    public static void main(String[] args){
    	Application.launch(args);
    }
}
