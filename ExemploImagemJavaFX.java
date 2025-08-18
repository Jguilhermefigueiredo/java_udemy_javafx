import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

public class ExemploImagemJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {
    

        Image imagemObj = new Image("file:C:/Users/zecao/OneDrive/Imagens/ghibli.jpeg");// imagem em formatos bmp,gif, jpeg, png
        ImageView imageView = new ImageView(imagemObj);

        imageView.setFitWidth(680);// config tamanho imagem - altura
        imageView.setFitHeight(480);// config tamanho imagem - largura
        imageView.setPreserveRatio(true); // mantem a proporção da imagem

        VBox layout = new VBox(imageView);

        Scene cena = new Scene(layout);

        palco.setScene(cena);
        palco.show();

    }

}
