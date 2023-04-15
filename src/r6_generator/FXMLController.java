package r6_generator;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author BuraG
 */
public class FXMLController implements Initializable {

    @FXML
    private Button btnAttacker;
    @FXML
    private Button btnDefender;
    @FXML
    private Label lbGenerated;
    @FXML
    private Button btnExit;

    private final String[] Attackers = {"Sledge", "Thatcher", "Ash", "Thermite", "Montagne", "Twitch", "Blitz", "IQ", "Fuze", "Glaz", "Buck", "Blackbeard", "Capitao", "Hibana", "Jackal", "Ying", "Zofia", "Dokkaebi", "Finka", "Lion", "Maverick", "Nomad", "Gridlock", "Nokk", "Amaru", "Kali", "Iana", "Ace", "Zero", "Flores", "Osa", "Sense", "Grim", "Brava"};
    private final String[] Defenders = {"Smoke", "Mute", "Castle", "Pulse", "Rook", "Doc", "Bandit", "Jäger", "Kapkan", "Tachanka", "Frost", "Valkyrie", "Caveira", "Echo", "Mira", "Lesion", "Ela", "Vigil", "Maestro", "Alibi", "Clash", "Kaid", "Mozzie", "Warden", "Goyo", "Wamai", "Oryx", "Melusi", "Aruni", "Thunderbird", "Thorn", "Azami", "Solis"};
    private Random random = new Random();
    private int index = 0;
    private String randomElement = null;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void btnAttackerOnActionHandler(ActionEvent event) {
        index = random.nextInt(Attackers.length);
        randomElement = Attackers[index];
        System.out.println(randomElement);
        lbGenerated.setStyle("-fx-text-fill: red;");
        lbGenerated.setText(randomElement);
    }

    @FXML
    private void btnDefenderOnActionHandler(ActionEvent event) {
        index = random.nextInt(Defenders.length);
        randomElement = Defenders[index];
        System.out.println(randomElement);
        lbGenerated.setStyle("-fx-text-fill: blue;");
        lbGenerated.setText(randomElement);
    }

    @FXML
    private void btnExitOnActionHandler(ActionEvent event) {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }

}
