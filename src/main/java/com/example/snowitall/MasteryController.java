package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MasteryController {
    private Stage primaryStage;
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void NextButton(ActionEvent event) throws Exception {

        // Load the FXML file for the new window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Mastery.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
        public void SubmitButton(ActionEvent event) throws Exception {

            // Load the FXML file for the new window
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Mastery.fxml"));
            Parent root = loader.load();

            // Get the current stage from the button's scene
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Set the new scene on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
        }
            public void ReturnButton(ActionEvent event) throws Exception {

                // Load the FXML file for the new window
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Mastery.fxml"));
                Parent root = loader.load();

                // Get the current stage from the button's scene
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                // Set the new scene on the stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
            }
        }





