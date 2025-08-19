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
import javafx.scene.media.*;

public class ExemploVideoJavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage palco) {
        String urlDoVideo = "file:///C:/Users/zecao/Downloads/Happy-Feet-2.mp4";
        Media mediaObj = new Media(urlDoVideo);
        MediaPlayer mediaPlayerObj = new MediaPlayer(mediaObj);
        MediaView mediaViewObj = new MediaView(mediaPlayerObj);

        HBox hBox = new HBox();
        hBox.getChildren().add(mediaViewObj);

        Scene cena = new Scene(hBox,700,700);

        palco.setTitle("Exemplo de vídeo.");
        palco.setScene(cena);
        palco.show();
        mediaPlayerObj.play();

    }

}
// na execução colocar ",javafx.media" sem espaços