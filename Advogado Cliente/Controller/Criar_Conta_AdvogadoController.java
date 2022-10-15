package projota;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Criar_Conta_AdvogadoController {
    
    @FXML
    private TextField Email;
    
    @FXML
    private TextField Nome;
    
    @FXML
    private TextField TEL;
    
    @FXML
    private TextField Sobrenome;
    
    @FXML
    private TextField Senha;
    
    @FXML
    private TextField CPF;
    

    // Botão retornar.
    @FXML
    protected void btnReturn(ActionEvent e){
        Projota.mudarTela("home");
    }
    
    // Botão continuar.
    @FXML
    protected void btnCtn(ActionEvent e) throws SQLException{
        //Email.getText();
        //Nome.getText();
        //TEL.getText();
        //Sobrenome.getText();
        //Senha.getText();

        //String url = "jdbc:mysql://localhost:3306/mydb";

        //Connection conn = DriverManager.getConnection(url, "root", "admin");
        //Statement st = conn.createStatement();
            
        //String sql = String.format("INSERT INTO usuarios_adg (ID_USUARIO_ADG, SENHA_USUARIO_ADG) VALUES (\'" +  CPF.getText() + "\'\'" +  CPF.getText() + "\');");
            //st.executeUpdate(sql);
        }
    }
