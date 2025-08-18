//import java.awt.TextField;
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
import javafx.geometry.Insets;

public class GridPaneJavaFX extends Application{

     public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco){

        Label rotuloNomeObj = new Label("Nome: ");
        Label rotuloEmailObj = new Label("E-mail: ");

        TextField campoNomeObj = new TextField();
        TextField campoEmailObj = new TextField();

        Button buttonEnviarObj = new Button("Enviar");


        GridPane gridPane = new GridPane();
        gridPane.setHgap(90);// espaçamento entre células - horizontal
        gridPane.setVgap(9);// espaçamento entre células - vertical
        gridPane.setPadding(new Insets(5));// espaçamento externo

        gridPane.addRow(0, rotuloNomeObj, campoNomeObj);//primeira linha
        gridPane.addRow(1, rotuloEmailObj, campoEmailObj);//segunda linha
        gridPane.addRow(2, buttonEnviarObj);//linha onde estará o botão

        Scene cenaObj = new Scene(gridPane); //não esquecer para poder 'imprimir' a tela
        palco.setScene(cenaObj);
        palco.show();

    }

}
