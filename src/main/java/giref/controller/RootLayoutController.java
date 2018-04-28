package giref.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import giref.database.EnzymeService;
import giref.database.RestrictionEnzymeEntity;
import java.util.List;

public class RootLayoutController implements Initializable {
    
    EnzymeService es = new EnzymeService();
    
    List<RestrictionEnzymeEntity> enzymes;
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        enzymes = es.getAll();
        
        System.out.println("You clicked me!");
        label.setText(enzymes.get(0).getEnzymeName());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
