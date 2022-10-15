package projota;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Login_AdvController{ 

    // Botão continuar.
    @FXML
    private void btnCtn(ActionEvent event) {
        Projota.mudarTela("PgIniAdv");
    }


    // Botão retornar.
    @FXML
    private void btnReturn(ActionEvent event) {
        Projota.mudarTela("home");
    }
    
}
