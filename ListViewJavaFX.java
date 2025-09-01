import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
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

import javafx.geometry.Insets;

public class ListViewJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage palco) {

        ObservableList<String> itens;
        itens = FXCollections.observableArrayList("Item1", "Item2", "Item3", "Item4");

        ListView<String> listView = new ListView<>(itens);

        VBox layout = new VBox(listView);

        Scene cena = new Scene(layout, 100, 100);
        palco.setScene(cena);
        palco.show();
    }

}
