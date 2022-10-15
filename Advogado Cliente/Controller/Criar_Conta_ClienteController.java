package projota;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;


public class Criar_Conta_ClienteController {

    // Botão retornar.
    @FXML
    protected void btnReturn (ActionEvent e){
        Projota.mudarTela("home");
    }
}
