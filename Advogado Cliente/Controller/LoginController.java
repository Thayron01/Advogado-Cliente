package projota;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class LoginController {
    
    // Botão retornar.
    @FXML
    protected void btnReturn (ActionEvent e){
        Projota.mudarTela("home");
    }
    
    // Botão continuar.
    @FXML
    protected void btnCtn1 (ActionEvent e){
        Projota.mudarTela("PgIni");
    }
    
}
