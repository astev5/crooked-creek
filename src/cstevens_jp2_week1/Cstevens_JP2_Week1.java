package cstevens_jp2_week1;

/** 
 * @Course: SDEV 350 ~ Java Programming II
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 1 - JavaFX Basics
 * @Date: September 12, 2021
 * @Description: A program that will output a GUI similar to example
 */

// Imports
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.text.TextAlignment;

import javafx.stage.Stage;

public class Cstevens_JP2_Week1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane BPane = new BorderPane();
        BPane.setPadding(new Insets(10, 10, 10, 10));
        BPane.setStyle("-fx-border-width: 5; -fx-border-color: cadetnavy;");
        
        // Top area - VBox
        VBox top = new VBox();
        top.setPadding(new Insets(5, 5, 5, 5));
        top.setAlignment(Pos.CENTER);        
        Text headTop = new Text("Welcome to Our Mailing List");
        Text subTop = new Text("Please fill out the information below and "
                + "click the Enter button");
        headTop.setFill(Color.DARKCYAN);
        headTop.setFont(Font.font("Eras Demi ITC", FontWeight.BOLD, 
                FontPosture.ITALIC, 38));
        headTop.setTextAlignment(TextAlignment.CENTER); 
        subTop.setFill(Color.TAN);
        subTop.setFont(Font.font("Eras Demi ITC", FontWeight.BOLD,
                FontPosture.ITALIC, 14));
        subTop.setTextAlignment(TextAlignment.CENTER);        
        
        top.getChildren().addAll(headTop, subTop);

        // Center area - Grid Pane
        GridPane center = new GridPane();
        center.setStyle("-fx-border-width: 5; -fx-border-color: cadetnavy; "
                + "-fx-background-color: aliceblue");        
        center.setAlignment(Pos.CENTER);
        center.setPadding(new Insets(10, 10, 10, 10));
        center.setHgap(10);
        center.setVgap(8);     
        
        // Create CheckBoxes & ComboBox
        CheckBox homecb = new CheckBox("Home");
        CheckBox workcb = new CheckBox("Work");  
        CheckBox cellcb = new CheckBox("Cell");  
        
        // Nodes for Grid Pane               
        center.add(new Label("First Name:"), 0, 0, 2, 1);
        center.add(new TextField(), 2, 0, 3, 1);
        center.add(new Label("Last Name:"), 5, 0, 2, 1);
        center.add(new TextField(), 7, 0, 3, 1);
        center.add(new Label("MI:"), 10, 0, 1, 1);
        center.add(new TextField(), 11, 0, 1, 1);
        center.add(new Label("Address Line 1:"), 0, 1, 2, 1);
        center.add(new TextField(), 2, 1, 10, 1);        
        center.add(new Label("Address Line 2:"), 0, 2, 2, 1);
        center.add(new TextField(), 2, 2, 10, 1);        
        center.add(new Label("City:"), 0, 3, 1, 1);
        center.add(new TextField(), 1, 3, 4, 1);        
        center.add(new Label("State:"), 6, 3, 1, 1);
        center.add(new ComboBox(), 7, 3, 2, 1);
        center.add(new Label("Zip:"), 9, 3, 1, 1);
        center.add(new TextField(), 10, 3, 1, 1);                
        center.add(new Label("Phone Number:"), 0, 4, 2, 1);
        center.add(new TextField(), 2, 4, 3, 1);
        center.add(homecb, 7, 4, 1, 1);
        center.add(workcb, 8, 4, 1, 1);
        center.add(cellcb, 9, 4, 1, 1);
        center.add(new Label("Email Primary:"), 0, 5, 2, 1);
        center.add(new TextField(), 2, 5, 4, 1);                
        center.add(new Label("Secondary:"), 7, 5, 2, 1);
        center.add(new TextField(), 8, 5, 4, 1); 
       
        // Create Buttons
        Button enterb = new Button("Enter");
        enterb.setPadding(new Insets(5, 15, 5, 15));
        Button clearb = new Button("Clear");
        clearb.setPadding(new Insets(5, 15, 5, 15));         
        Button exitb = new Button("Exit");
        exitb.setPadding(new Insets(5, 15, 5, 15));         
        enterb.setMaxWidth(Double.MAX_VALUE);
        clearb.setMaxWidth(Double.MAX_VALUE);
        exitb.setMaxWidth(Double.MAX_VALUE);
        
        // Create HBox for Buttons
        HBox buttons = new HBox();
        buttons.setPadding(new Insets(20, 20, 20, 20));        
        buttons.setAlignment(Pos.CENTER);         
        buttons.getChildren().addAll(enterb, clearb, exitb);
        
        // Create Image & ImageView
        Image canoe = new Image("canoe.jpg");
        ImageView imageview1 = new ImageView(canoe);
        imageview1.setFitHeight(70);
        imageview1.setFitWidth(625);
        
        // Create VBox for BorderPane Bottom
        VBox bottom = new VBox();
        bottom.setPadding(new Insets(20, 20, 20, 20));
        VBox.setMargin(bottom, new Insets(10, 10, 10, 10));        
        bottom.setAlignment(Pos.CENTER); 
        
        bottom.getChildren().addAll(buttons, imageview1);
        
        // Set Panes into BorderPane Areas
        BPane.setTop(top);
        BorderPane.setAlignment(top, Pos.CENTER);
        BorderPane.setMargin(top, new Insets(5, 5, 5, 5));
        
        BPane.setCenter(center);
        BorderPane.setAlignment(center, Pos.CENTER);
        BorderPane.setMargin(center, new Insets(5, 5, 5, 5));
        
        BPane.setBottom(bottom);
        BorderPane.setAlignment(bottom, Pos.CENTER);
        BorderPane.setMargin(bottom, new Insets(5, 5, 5, 5));        
                
        // Create a Pane... place BorderPlane inside
        Pane pane = new Pane(BPane);
        pane.setStyle("-fx-border-width: 5; -fx-border-color: darkgray; "
                + "-fx-background-color: aliceblue");
        
        // Create Scene
        Scene scene =  new Scene(pane);       
        primaryStage.setTitle("Crooked Creek Canoeing Company");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
