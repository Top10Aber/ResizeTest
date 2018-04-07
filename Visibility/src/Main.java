import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }
  
  @Override
  public void start (Stage primaryStage) {
	  
    Button btn = new Button();
    Button btn2 = new Button();
    Label lbl = new Label();
    
    primaryStage.setTitle("Hello World!");
    
    lbl.setText("Test");
    
    lbl.setLayoutX(70);
    lbl.setLayoutY(150);
    lbl.setText("true");

    btn.setLayoutX(100);
    btn.setLayoutY(100);
    btn.setText("smaller");
    
    btn2.setLayoutX(100);
    btn2.setLayoutY(50);
    btn2.setText("bigger");
    
    btn.setOnAction(new EventHandler<ActionEvent>() {
   	
    	@Override
        public void handle(ActionEvent event) {  
    		int size = 14; 
        	lbl.setFont(new Font(size)); 
        }
      });
    
    btn2.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {  
        	int size = 20; 
        	lbl.setFont(new Font(size)); 
        }
      });

    Group root = new Group();

    root.getChildren().add(btn);
    root.getChildren().add(btn2);
    root.getChildren().add(lbl);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
}