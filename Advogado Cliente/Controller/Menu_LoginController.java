package projota;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;


public class Menu_LoginController {
    
    // Botão login para o advogado.
    @FXML
    protected void btnLogAdv(ActionEvent e){
       Projota.mudarTela("logAdv");
    }

    // Botão login para o cliente.
    @FXML
    protected void btnLogCli(ActionEvent e){
       Projota.mudarTela("logCli");
    }
    
    // Botão de cadastro de cliente.
    @FXML
    protected void btnCadCli(ActionEvent e){
       Projota.mudarTela("cadCli");
    }
    
    // Botão de cadastro de advogado.
    @FXML
    protected void btnCadAdv(ActionEvent e){
       Projota.mudarTela("cadAdv");
    }
    
}
