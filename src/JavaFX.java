import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaFX extends Application {
    ArrayList<Object> allImages;
    ArrayList<String> allImageNames;
    ImageView imageView;

//makes menu
    public void start(Stage primaryStage) throws Exception {
        // create arrays
        allImages = new ArrayList<Object>();
        allImageNames = new ArrayList<String>();

        //menu items
        MenuItem menuItem1 = new MenuItem("Im 1");
        MenuItem menuItem2 = new MenuItem("Im 2");
        MenuItem menuItem3 = new MenuItem("Im 3");
        MenuItem menuItem4 = new MenuItem("Im 4");
        MenuItem menuItem5 = new MenuItem("Im 5");
        MenuItem menuItem6 = new MenuItem("Im 6");

//trying to add an new immage
        Button buttona = new Button("Immage a");
        buttona.setOnAction(e -> {

                });

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3,menuItem4,menuItem5,menuItem6);

//file piclker
        FileInputStream input = new FileInputStream("src/Photo on 11-13-23 at 1.18 PM.jpg");
        Image image = new Image(input, 100, 100, false, false);
        allImages.add(image);
        allImageNames.add("src/Photo on 11-13-23 at 1.18 PM.jpg");
        imageView = new ImageView(image);

        FileChooser fileChooser = new FileChooser();
        Button button2 = new Button("Immage One");
        Button button = new Button("File Picker");

        button.setOnAction(e -> {

            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            Image image1 = new Image(selectedFile.toURI().toString(), 100, 100, false, false);
            imageView.setImage(image1);
            HBox hbox = new HBox(menuButton,button,button2,imageView);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();
        });
        //tital
        primaryStage.setTitle("ImageView Experiment 1");
        menuItem6.setOnAction(event -> {
            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            Imagelist.add("can.png");
            Imagelist.add("Screen Shot 2022-10-07 at 1.11.37 PM.png");
            Imagelist.add("Screen Shot 2022-10-07 at 1.11.33 PM.png");
            Imagelist.add("Screen Shot 2022-10-07 at 1.11.33 PM.png");

            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            String element2 = Imagelist.get(2).toString();
            String element3 = Imagelist.get(3).toString();
            String element4 = Imagelist.get(4).toString();
            String element5 = Imagelist.get(5).toString();

            System.out.println(element5);

            ImageView im6 = new ImageView(element5);
            HBox hbox = new HBox(menuButton,button,button2,im6);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();

        });


//menu item 5
        menuItem5.setOnAction(event -> {
            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            Imagelist.add("can.png");
            Imagelist.add("Screen Shot 2022-10-07 at 1.11.37 PM.png");
            Imagelist.add("Screen Shot 2022-10-07 at 1.11.33 PM.png");
            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            String element2 = Imagelist.get(2).toString();
            String element3 = Imagelist.get(3).toString();
            String element4 = Imagelist.get(4).toString();

            System.out.println(element4);

            ImageView im5 = new ImageView(element4);
            HBox hbox = new HBox(menuButton,button,button2,im5);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();
        });


//menu item 4
        menuItem4.setOnAction(event -> {
            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            Imagelist.add("can.png");
            Imagelist.add("Screen Shot 2022-10-07 at 1.11.37 PM.png");

            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            String element2 = Imagelist.get(2).toString();
            String element3 = Imagelist.get(3).toString();
            System.out.println(element3);

            ImageView im4 = new ImageView(element3);
            HBox hbox = new HBox(menuButton,button,button2,im4);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();
        });

//menu item 3
        menuItem3.setOnAction(event -> {
            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            Imagelist.add("can.png");
            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            String element2 = Imagelist.get(2).toString();
            System.out.println(element0);
            ImageView im3 = new ImageView(element2);
            HBox hbox = new HBox(menuButton,button,button2,im3);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();
        });

//menu iten 2
        menuItem2.setOnAction(event -> {
            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            Imagelist.add("can.png");
            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            String element2 = Imagelist.get(2).toString();
            ImageView im2 = new ImageView(element1);
            HBox hbox = new HBox(menuButton,button,button2,im2);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();
        });
//menu item 1
        menuItem1.setOnAction(event -> {


            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            Imagelist.add("can.png");
            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            String element2 = Imagelist.get(2).toString();
            ImageView im1 = new ImageView(element0);
            HBox hbox = new HBox(menuButton,button,button2,im1);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();


        });



//buttons 2

        Button button3 = new Button("Select File");
        button3.setOnAction(e -> {
            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            System.out.println(element0);
            ImageView im2 = new ImageView(element1);
            HBox hbox = new HBox(menuButton,button,button2,im2);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();
        });

//buttion 1
        ChoiceBox choiceBox = new ChoiceBox();
        choiceBox.getItems().add("Choice 1");
        choiceBox.setOnAction((event) -> {
            List<Object> Imagelist = new ArrayList();
            Imagelist.add("Photo on 11-13-23 at 1.18 PM.jpg");
            Imagelist.add("Screen Shot 2023-11-09 at 9.24.14 AM.png");
            String element0 = Imagelist.get(0).toString();
            String element1 = Imagelist.get(1).toString();
            System.out.println(element0);
            ImageView im2 = new ImageView(element0);
            HBox hbox = new HBox(menuButton,button,button3,im2);
            Scene scene = new Scene(hbox, 1000, 1000);
            primaryStage.setScene(scene);
            primaryStage.show();
        });



        button2.setOnAction(e -> {

        });

        HBox hbox = new HBox(choiceBox,menuButton,buttona,button,button2,button3);
        Scene scene = new Scene(hbox, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();


    }





    public static void main(String[] args) {

        Application.launch(args);
    }
}