package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Hello");
			Button button  = new Button("Press Me!");
			button.setOnAction(e -> System.out.println("Button clicked!!!!!!!!!!!!"));
			button.setOnAction(e -> {
			});
			StackPane layout = new StackPane();
			layout.getChildren().add(button);
					
			
//			BorderPane root = new BorderPane();
			Scene scene = new Scene(layout,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
