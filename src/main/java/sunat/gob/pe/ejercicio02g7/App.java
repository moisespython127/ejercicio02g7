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
import javafx.scene.layout.VBox;
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
        Label lbl1=new Label("Data");
        Label lbl2=new Label("Ventas");
        Label lbl3=new Label("Marketing");
        Label lbl4=new Label("Distribución");
        Label lbl5=new Label("Costos");
        
        VBox vbox=new VBox(lbl1,lbl2,lbl3,lbl4,lbl5);
        vbox.setSpacing(5);
        //29.01.2024
        Button btn11= new Button("Resumen");        
        Button btn12= new Button("Credito");
        Button btn13= new Button("Ahorro");
        Button btn21= new Button("Movimientos");
        Button btn22= new Button("Deudas");
        Button btn23= new Button("Historial");
        
        btn11.setPrefSize(80, 25);
        btn12.setPrefSize(80, 25);
        btn13.setPrefSize(80, 25);
        btn21.setPrefSize(80, 25);
        btn22.setPrefSize(80, 25);
        btn23.setPrefSize(80, 25);
        HBox hbox1=new HBox(btn11,btn12,btn13);//ctrl+space inserta li
        hbox1.setSpacing(5);
        
        HBox hbox2=new HBox(btn21,btn22,btn23);//ctrl+space inserta li
        hbox2.setSpacing(5);
        
        VBox vbox3=new VBox(hbox1,hbox2);
        vbox3.setSpacing(5);
        
        Insets sangriaHbox3=new Insets(20,0,0,20);
        vbox3.setPadding(sangriaHbox3);
        vbox3.setAlignment(Pos.BASELINE_CENTER);
        
        
        //var scene = new Scene(new StackPane(label), 640, 480);
        //var scene = new Scene(hbox, 640, 480);
        //var scene = new Scene(vbox, 640, 480);
        var scene = new Scene(vbox3, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Grupo 7");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}