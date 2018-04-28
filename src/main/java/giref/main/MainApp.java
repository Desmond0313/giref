package giref.main;

import giref.controller.EnzimeSearchController;
import giref.controller.RootLayoutController;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    private static Stage stage;
    private BorderPane rootLayout;
    
    @Override
    public void start(Stage stage) {
        
        MainApp.stage = stage;
        MainApp.stage.setTitle("GIREF");
        
        initRootLayout();
        initEnzimeSearch();
    }
    
    public void initRootLayout() {
        
        try {
        
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/fxml/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            stage.setScene(scene);
            RootLayoutController controller = loader.getController();
            
            stage.show();
        
        } catch(IOException e) {
            
            e.printStackTrace();
        }
    }
    
    public void initEnzimeSearch() {
        
        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/fxml/EnzimeSearch.fxml"));
            AnchorPane enzimeSearch = (AnchorPane) loader.load();
            
            rootLayout.setCenter(enzimeSearch);
            
            EnzimeSearchController controller = loader.getController();
            
        } catch(IOException e) {
            
            e.printStackTrace();
        } 
    }

    public static void main(String[] args) {
        launch(args);
    }

}
