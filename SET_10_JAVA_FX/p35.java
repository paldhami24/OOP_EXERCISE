import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class p35 extends Application {

    @Override
    public void start(Stage stage) {

        HBox root = new HBox(30);
        root.setAlignment(Pos.BOTTOM_CENTER);

        VBox projectsBox = createBar("Projects — 20%", 20, Color.RED);
        VBox quizzesBox = createBar("Quizzes — 10%", 10, Color.BLUE);
        VBox midtermBox = createBar("Midterm Exams — 30%", 30, Color.GREEN);
        VBox finalBox = createBar("Final Exam — 40%", 40, Color.ORANGE);

        root.getChildren().addAll(projectsBox, quizzesBox, midtermBox, finalBox);

        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String labelText, int percentage, Color color) {

        double height = percentage * 5; 
        Rectangle bar = new Rectangle(50, height);
        bar.setFill(color);

        Text label = new Text(labelText);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
