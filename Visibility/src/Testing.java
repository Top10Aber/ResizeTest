import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Testing extends Application implements EventHandler<ActionEvent> {

    Button button;
    Label label;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Title of Window");
        button = new Button();
        button.setText("Click me");
        label = new Label();
        label.setText("Test");
        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(label);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    int size = 60;
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button) 
            label.setText("Woo");
        	label.setFont(new Font(size)); 
    }

}