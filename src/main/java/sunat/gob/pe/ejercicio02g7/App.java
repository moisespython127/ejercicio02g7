package sunat.gob.pe.ejercicio02g7;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        //var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Button btnActual=new Button("Actual");
        btnActual.setPrefSize(80, 25);
        
        Button btnProyectado=new Button("Proyectado");
        btnProyectado.setPrefSize(80, 25);
        
        HBox hbox=new HBox(btnActual,btnProyectado);//ctrl+space inserta li
        hbox.setSpacing(5);
        Insets sangriaHbox=new Insets(5,5,5,5);
        hbox.setPadding(sangriaHbox);
        hbox.setAlignment(Pos.BASELINE_CENTER);
        
        //var hbox=new HBox();//ctrl+space inserta li
        
        //var scene = new Scene(new StackPane(label), 640, 480);
        var scene = new Scene(hbox, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}