import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class StreamingVideoJavaFX extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage palcoWeb){
        WebView webView = new WebView();

        String urlVideo = new String("https://www.youtube.com/watch?v=Cpz8R0e1mqI&list=RDCpz8R0e1mqI&start_radio=1&t=1102s");
        
        webView.getEngine().load(urlVideo);
        Scene cena = new Scene(webView,800,600);
        palcoWeb.setTitle("Exemplo vídeos");
        palcoWeb.setScene(cena);
        palcoWeb.show();
    }

}
