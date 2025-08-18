import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXMinhaApllicacao extends Application{
    @Override
    public void start(Stage palco){
        palco.setTitle("Meu primeiro palco.");
        palco.show();
    }
    public static void main (String[] args) {
        launch(args);

    }
}