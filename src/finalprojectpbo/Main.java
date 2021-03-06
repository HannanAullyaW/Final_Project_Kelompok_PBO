package finalprojectpbo;

import finalprojectpbo.database.DBHelper;
import finalprojectpbo.database.DataModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;
import javafx.scene.image.Image;

public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("view/desain.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("sistem nasabah koperasi");
        stage.getIcons().add(new Image("/finalprojectpbo/logo/koperasi-1.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);

    }
    
}
