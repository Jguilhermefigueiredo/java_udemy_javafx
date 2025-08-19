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
import javafx.stage.FileChooser;
import java.io.File;


public class SistemaDeArquivosJavaFX extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start (Stage palco){

        FileChooser seletorDeArquivo = new FileChooser();
        seletorDeArquivo.setTitle("Escolha um arquivo");
        Button buttonObj = new Button("Abrir arquivo");
        buttonObj.setOnAction( e -> {
            File arquivoSelecionado = seletorDeArquivo.showOpenDialog(palco);
            if (arquivoSelecionado != null){
                exibirImagem(arquivoSelecionado, palco);
                }
        });
        VBox layout = new VBox(buttonObj);
        Scene cena = new Scene (layout,800,600);
        palco.setTitle("Testando FileChooser");
        palco.setScene(cena);
        palco.show();
        
    }
    private void exibirImagem(File arquivo, Stage palcoDoArquivoSelecionado){
        Image imagemObj = new Image(arquivo.toURI().toString());
        ImageView imageView = new ImageView(imagemObj);

        VBox layout;

        //linha abaixo obtém o layout atual
        layout = (VBox) palcoDoArquivoSelecionado.getScene().getRoot();

        //a linha abaixo adiciona a imagem ao layout
        layout.getChildren().add(imageView);

        //ajustar tamanho da imagem
        imageView.setFitWidth(500);
        imageView.setFitHeight(500);

        palcoDoArquivoSelecionado.setTitle("Seletor de Arquivos");

    }

}
