//import java.awt.Button;
//import java.awt.TextField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;


public class ExemploControles extends Application {

    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage palco) {
        palco.setTitle("Meu primeiro palco.");
        palco.show();
        Label labelObj = new Label("Olá mundo! Sou uma etiqueta (label).");

        Button buttonObj = new Button("Clique aqui");

        TextField campoTextoObj = new TextField();

        VBox layoutObj = new VBox(labelObj, buttonObj, campoTextoObj);

        Scene cenaObj = new Scene(layoutObj, 1080, 920);

        palco.setScene(cenaObj);
        palco.show();
    }

    
}
// java --module-path "C:\Java\javafx-sdk-22.0.1\lib" --add-modules

