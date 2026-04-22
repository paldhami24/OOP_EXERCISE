import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class p34 extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        grid.setStyle("-fx-background-color: linear-gradient(to bottom, #fbc2eb, #a6c1ee);");

        Label rollLabel = new Label("Roll No:");
        TextField rollField = new TextField();

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        String labelStyle = "-fx-text-fill: black; -fx-font-size: 14px; -fx-font-weight: bold;";
        rollLabel.setStyle(labelStyle);
        nameLabel.setStyle(labelStyle);
        ageLabel.setStyle(labelStyle);
        emailLabel.setStyle(labelStyle);

        String fieldStyle = "-fx-background-radius: 8;";
        rollField.setStyle(fieldStyle);
        nameField.setStyle(fieldStyle);
        ageField.setStyle(fieldStyle);
        emailField.setStyle(fieldStyle);

        submitBtn.setStyle(
            "-fx-background-color: #f7a0c5;" +
            "-fx-text-fill: black;" +
            "-fx-font-size: 14px;" +
            "-fx-background-radius: 10;"
        );

        grid.add(rollLabel, 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(ageLabel, 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(emailLabel, 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);
        GridPane.setHalignment(submitBtn, javafx.geometry.HPos.CENTER);

        submitBtn.setOnAction(e -> {
            try {
    
                if (rollField.getText().isEmpty() || ageField.getText().isEmpty()) {
                    throw new Exception("Roll No and Age cannot be empty");
                }

                int rollNo = Integer.parseInt(rollField.getText().trim());
                int age = Integer.parseInt(ageField.getText().trim());
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();

                if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
                    throw new Exception("Invalid Email format");
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter("registration.txt", true));
                writer.write("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Email: " + email);
                writer.newLine();
                writer.close();

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers.");
                error.showAndWait();

            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Failed");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}