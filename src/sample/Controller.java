package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView btnSettings, btnUser, btnClose;
    @FXML
    private AnchorPane panSettings, panUser;

    @FXML
    private void handleButtonsAction(MouseEvent event) {
        if (event.getTarget().equals(btnSettings)) {
            panSettings.setVisible(true);
            panUser.setVisible(false);
        }
        if (event.getTarget().equals(btnUser)) {
            panUser.setVisible(true);
            panSettings.setVisible(false);
        }
        if (event.getTarget().equals(btnClose))
            if (event.getClickCount() == 2 && !event.isConsumed()) {
                event.consume();
                System.exit(0);
            }
            else {
            panUser.setVisible(false);
            panSettings.setVisible(false);
            }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
