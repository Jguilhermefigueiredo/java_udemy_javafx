import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.geometry.Pos; //fornece valores constantes para especificar posições em layout - define posições (top, left, right...)
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class LayoutsInterfaceJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {

        Button buttonObj1 = new Button("Botão 1");
        Button buttonObj2 = new Button("Botão 2");
        HBox hBox = new HBox(buttonObj1, buttonObj2);
        hBox.setAlignment(Pos.CENTER_LEFT);

        Button buttonObj3 = new Button("Botão 3");
        Button buttonObj4 = new Button("Botão 4");
        VBox vBox = new VBox(buttonObj3, buttonObj4);
        vBox.setAlignment(Pos.CENTER);

        BorderPane boderPane = new BorderPane();
        boderPane.setTop(hBox);
        boderPane.setCenter(vBox);

        Scene cenaObj = new Scene( boderPane , 300, 300); //não esquecer para poder 'imprimir' a tela
        palco.setScene(cenaObj);
        palco.show();
    }
}