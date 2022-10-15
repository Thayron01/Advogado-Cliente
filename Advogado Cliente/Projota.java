package projota;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Projota extends Application {
    
    private static Stage stage;
    // Declaração de cenas
    
    private static Scene home;
    private static Scene logCli;
    private static Scene logAdv;
    private static Scene cadAdv;
    private static Scene cadCli;
    private static Scene PgIni;
    private static Scene PgIniAdv;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        
        primaryStage.setTitle("Advogado Cliente");
        
        // Chamando arquivos
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("View/Menu_Login.fxml"));
        Parent fxmlLogCli = FXMLLoader.load(getClass().getResource("View/Login.fxml"));
        Parent fxmlLogAdv = FXMLLoader.load(getClass().getResource("View/Login_Adv.fxml"));
        Parent fxmlcadCli = FXMLLoader.load(getClass().getResource("View/Criar_Conta_Cliente.fxml"));
        Parent fxmlcadAdv = FXMLLoader.load(getClass().getResource("View/Criar_Conta_Advogado.fxml"));
        Parent fxmlPgIni = FXMLLoader.load(getClass().getResource("View/Pg_ini.fxml"));
        Parent fxmlPgIniAdv = FXMLLoader.load(getClass().getResource("View/PgIniAdv.fxml"));
        
        // Carregando cena
        home = new Scene(fxmlMain, 600, 400);
        logCli = new Scene(fxmlLogCli, 400, 500);
        logAdv = new Scene(fxmlLogAdv, 400, 500);
        cadCli = new Scene(fxmlcadCli, 640, 400);
        cadAdv = new Scene(fxmlcadAdv, 640, 400);
        PgIni = new Scene(fxmlPgIni, 640, 400);
        PgIniAdv = new Scene(fxmlPgIniAdv, 640, 400);
        
        // Setando a tela inicial
        primaryStage.setScene(home);
        primaryStage.show();
    }
    
    //Escolha de tela
    public static void mudarTela(String scr){
        switch(scr){
            case "logCli":
                stage.setScene(logCli);
                break;
            case "logAdv":
                stage.setScene(logAdv);
                break;
            case "cadCli":
                stage.setScene(cadCli);
                break;
            case "cadAdv":
                stage.setScene(cadAdv);
                break;
            case "home":
                stage.setScene(home);
                break;
            case "PgIni":
                stage.setScene(PgIni);
                break;
            case "PgIniAdv":
                stage.setScene(PgIniAdv);
                break;
            
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    //Autores: Thayron Rambo, Lucas Aldrighi, Gabriel Caetano, Eduardo Horn Espindola;
    
}
