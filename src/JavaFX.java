import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFX extends Application {
int press;
    @Override
    public void start(Stage primaryStage) throws Exception {

        // Construct and add actions to our controls
        Label label1 = new Label("New Label test");
        Label label2 = new Label("How can we do this?");
        Label label3 = new Label("We'll start with Labels.");
      //  Label label4 = new Label("We'll start with Button.");
        label1.setFont(new Font("Arial", 24));
        Button pressMe = new Button("Press Me!");
        pressMe.setOnAction(actionEvent ->  {
            label2.setText("We did it!");
        });
        TextField typeHere = new TextField("Please type here!");
        typeHere.setOnAction(actionEvent ->  {
            label3.setText(typeHere.getText());
        });

        Slider slider = new Slider(0, 100, 0);


        // Layout our scene
        VBox vBox1 = new VBox(label2, label3);
        vBox1.setAlignment(Pos.BASELINE_CENTER);
        vBox1.setSpacing(20);
        VBox vBox2 = new VBox(label1, pressMe, typeHere);
        HBox myHbox = new HBox(40, vBox2, vBox1);

        Text text12 = new Text("text 12 tst");

        primaryStage.setTitle("HBox Experiment 1");
        Button button = new Button("NEW SHiste");
        button.setOnAction(actionEvent -> {
press = press +1;
        });
        ChoiceBox choiceBox = new ChoiceBox();

        choiceBox.getItems().add("`");
        choiceBox.getItems().add("ABAA");
        choiceBox.getItems().add("BUMUBUM");
        choiceBox.setOnAction((event) -> {
            int selectedIndex = choiceBox.getSelectionModel().getSelectedIndex();
            Object selectedItem = choiceBox.getSelectionModel().getSelectedItem();
            text12.setText("text"+selectedItem);
        });
        CheckBox checkBox1 = new CheckBox("yes or no");


        ColorPicker colorPicker = new ColorPicker();

        Color value = colorPicker.getValue();
        colorPicker.setOnAction ((event) -> {
            RadioButton radioButton1 = new RadioButton(value+"collro");

        });
        RadioButton radioButton1 = new RadioButton(value+"collro");


//hboc stuff
        HBox hboxFin = new HBox(checkBox1,radioButton1,colorPicker);

        HBox hboxCh = new HBox(choiceBox,text12);

        HBox newhbox1 = new HBox(button, slider);

        HBox newhbox2 = new HBox(newhbox1, hboxCh);

        VBox vbox1 = new VBox(myHbox,newhbox2,hboxFin);

//start the snecce
        Scene scene = new Scene(vbox1, 400, 400);
        // Display our stage
        primaryStage.setTitle("Hello class!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        Application.launch(args);
    }
}