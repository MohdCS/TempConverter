/*
Author: Mohammed Al Dossary
GitHub: https://github.com/MohdCS
Application: Simple Temperature Converter, for learning purposes and how-to:
- import libraries
- create UI objects such as TextFields, ComboBoxes, Labels, and so on.
- implement proper methods, action events using lambda expressions and if-statements on the objects.
- handle exceptions using try-catch.
 */

package tempconverter;

// Import necessary library.
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TempConverter extends Application {

    @Override
    public void start(Stage stage) {

        // Create a text field that enables the user to input a value.
        TextField value = new TextField("Input numerical value");

        // Create a text label.
        Label fromLabel = new Label("Convert from:");

        // Create a text label.
        Label toLabel = new Label("to:");

        // Create String-type observable list and add items using FXCollections.observableArrayList method.
        ObservableList<String> units = FXCollections.observableArrayList("Celsius", "Fahrenheit", "Kelvin");

        // Create String-type combo box to accept adding the ObservableList.
        ComboBox<String> menuBox1 = new ComboBox<>(units);

        // Initialize a text in the combo box that prompts the user to select an item.
        menuBox1.setPromptText("Select Unit");

        // Create String-type combo box to accept adding the ObservableList.
        ComboBox<String> menuBox2 = new ComboBox<>(units);

        // Initialize a text in the combo box that prompts the user to select an item.
        menuBox2.setPromptText("Select Unit");

        // Create a text label.
        Label equal = new Label("=");

        // Create a text field that sets the result based on ActionEvents.
        TextField result = new TextField("Result");

        // Restrict the user from editing this text field.
        result.setEditable(false);

        // Use setOnAction method to the combo box and put the desired action codes.
        menuBox1.setOnAction((ActionEvent event) -> // lambda expression
        {

            // Handle exceptions using try-catch methods.
            try {

                // Make If-Statements to make changes on the result text field when preferred conditions are met.
                if ((menuBox1.getValue().equals("Celsius")) && (menuBox2.getValue().equals("Fahrenheit"))) {
                    result.setText((Double.parseDouble(value.getText()) * 1.8) + 32 + "");
                } else if ((menuBox1.getValue().equals("Celsius")) && (menuBox2.getValue().equals("Kelvin"))) {
                    result.setText((Double.parseDouble(value.getText()) + 273.15 + ""));
                } else if ((menuBox1.getValue().equals("Fahrenheit")) && (menuBox2.getValue().equals("Celsius"))) {
                    result.setText((Double.parseDouble(value.getText()) - 32) * 5 / 9 + "");
                } else if ((menuBox1.getValue().equals("Fahrenheit")) && (menuBox2.getValue().equals("Kelvin"))) {
                    result.setText((Double.parseDouble(value.getText()) - 32) / 1.8 + 273.15 + "");
                } else if ((menuBox1.getValue().equals("Kelvin")) && (menuBox2.getValue().equals("Celsius"))) {
                    result.setText((Double.parseDouble(value.getText()) - 273.15 + ""));
                } else if ((menuBox1.getValue().equals("Kelvin")) && (menuBox2.getValue().equals("Fahrenheit"))) {
                    result.setText((Double.parseDouble(value.getText()) * 1.8) - 459.67 + "");
                }
            } catch (Exception e) {

            }
        });

        // Use setOnAction method to the combo box and put the desired action codes.
        menuBox2.setOnAction((ActionEvent event) -> // lambda expression
        {

            // Handle exceptions using try-catch methods.
            try {

                // Make If-Statements to make changes on the result text field when preferred conditions are met.
                if ((menuBox1.getValue().equals("Celsius")) && (menuBox2.getValue().equals("Fahrenheit"))) {
                    result.setText((Double.parseDouble(value.getText()) * 1.8) + 32 + "");
                } else if ((menuBox1.getValue().equals("Celsius")) && (menuBox2.getValue().equals("Kelvin"))) {
                    result.setText((Double.parseDouble(value.getText()) + 273.15 + ""));
                } else if ((menuBox1.getValue().equals("Fahrenheit")) && (menuBox2.getValue().equals("Celsius"))) {
                    result.setText((Double.parseDouble(value.getText()) - 32) * 5 / 9 + "");
                } else if ((menuBox1.getValue().equals("Fahrenheit")) && (menuBox2.getValue().equals("Kelvin"))) {
                    result.setText((Double.parseDouble(value.getText()) - 32) / 1.8 + 273.15 + "");
                } else if ((menuBox1.getValue().equals("Kelvin")) && (menuBox2.getValue().equals("Celsius"))) {
                    result.setText((Double.parseDouble(value.getText()) - 273.15 + ""));
                } else if ((menuBox1.getValue().equals("Kelvin")) && (menuBox2.getValue().equals("Fahrenheit"))) {
                    result.setText((Double.parseDouble(value.getText()) * 1.8) - 459.67 + "");
                }
            } catch (Exception e) {

            }

        });

        // Use setOnAction method to the value text field and put the desired action codes.
        value.setOnAction((ActionEvent event) -> // lambda expression
        {

            // Handle exceptions using try-catch methods.
            try {

                // Make If-Statements to make changes on the result text field when preferred conditions are met.
                if ((menuBox1.getValue().equals("Celsius")) && (menuBox2.getValue().equals("Fahrenheit"))) {
                    result.setText((Double.parseDouble(value.getText()) * 1.8) + 32 + "");
                } else if ((menuBox1.getValue().equals("Celsius")) && (menuBox2.getValue().equals("Kelvin"))) {
                    result.setText((Double.parseDouble(value.getText()) + 273.15 + ""));
                } else if ((menuBox1.getValue().equals("Fahrenheit")) && (menuBox2.getValue().equals("Celsius"))) {
                    result.setText((Double.parseDouble(value.getText()) - 32) * 5 / 9 + "");
                } else if ((menuBox1.getValue().equals("Fahrenheit")) && (menuBox2.getValue().equals("Kelvin"))) {
                    result.setText((Double.parseDouble(value.getText()) - 32) / 1.8 + 273.15 + "");
                } else if ((menuBox1.getValue().equals("Kelvin")) && (menuBox2.getValue().equals("Celsius"))) {
                    result.setText((Double.parseDouble(value.getText()) - 273.15 + ""));
                } else if ((menuBox1.getValue().equals("Kelvin")) && (menuBox2.getValue().equals("Fahrenheit"))) {
                    result.setText((Double.parseDouble(value.getText()) * 1.8) - 459.67 + "");
                }
            } catch (Exception e) {

            }
        });

        // Create a flow-pane and set the horizontal and vertical gaps between objects.
        FlowPane root = new FlowPane(10, 10);

        // Centralize the flow-pane using the setAlignment method.
        root.setAlignment(Pos.CENTER);

        // Add objects to the flow-pane using getChildren and addAll methods.
        root.getChildren().addAll(value, fromLabel, menuBox1, toLabel, menuBox2, equal, result);

        // Create a scene and set the flow-pane as a root.
        Scene scene = new Scene(root, 675, 40);

        // Set the title of application using the setTitle method.
        stage.setTitle("Simple Temperature Converter");

        // Set the icon of application using the setIcons method.
        stage.getIcons().add(new Image("file:src/tempconverter/temp.png"));

        // Set the scene of application using the setScene method.
        stage.setScene(scene);

        // ... let the show begin using show method.
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
