package example.fifteen_1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelHandlerClass<T> implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		System.out.println("µã»÷ÁËCancel¼ü");
	}

}
