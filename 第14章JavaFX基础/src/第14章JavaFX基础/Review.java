package µÚ14ÕÂJavaFX»ù´¡;

import javafx.application.Application;
import javafx.stage.Stage;

public class Review extends Application {
	
	public Review(){
		System.out.println("Review constructor is invoked");
		
	}
	

	@Override
	public void start(Stage primaryStage)  {
		// TODO Auto-generated method stub
		
			System.out.println("Start method is invoked");
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("launch application");
		Application.launch(args);
	}
	

}
