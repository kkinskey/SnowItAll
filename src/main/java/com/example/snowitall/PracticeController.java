package com.example.snowitall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.Random;
public class PracticeController {
    @FXML
    private ArrayList<Label> problems;

    @FXML
    private ArrayList<TextField> answers;
    private int numProblems = 18;

    @FXML
    private ImageView backgroundImage;
    //Initialize the problem worksheet
    public void initialize() {
        Random rand = new Random();
        Image image = new Image("src/main/resources/com/example/snowitall/Copy of Snow-It-All.jpg");
        backgroundImage.setImage(image);

        //Generate the problems and adds the problems to the worksheet
        for (int i = 0; i < numProblems; i++) {
            int num1 = rand.nextInt(100);
            int num2 = rand.nextInt(100);
            String problem = num1 + " + " + num2 + " = ";
            problems.get(i).setText(problem);
        }
    }

    //Checks the user's answers when the "Submit" button is clicked
    @FXML
    public void submitAnswers(ActionEvent event) throws IOException {
        int numCorrect = 0;

        //Checks each answer and update the label with the result
        for(int i = 0; i < numProblems; i++){
            String userAnswer = answers.get(i).getText();

            try {
                int intAnswer = Integer.parseInt(userAnswer);
                String correctAnswer = problems.get(i).getText().split("=")[1].trim();

                if (intAnswer == Integer.parseInt(correctAnswer)) {
                    answers.get(i).setStyle("-fx-border-color: green");
                    numCorrect++;
                } else {
                    answers.get(i).setStyle("-fx-border-color: red");
                }
            }
            catch(NumberFormatException e){
                answers.get(i).setStyle("-fx-border-color: red");
            }
        }

        Label scoreLabel = new Label("Score: " + numCorrect + "/" + numProblems);
        scoreLabel.setStyle("-fx-font-size: 24px");
        problems.add(scoreLabel);

        // Load the FXML file for the new window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("landing-page.fxml"));
        Parent root = loader.load();

        // Get the current stage from the button's scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Set the new scene on the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("SnowItAll");
    }

}