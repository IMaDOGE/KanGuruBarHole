package hu.unideb.inf;

import hu.unideb.inf.model.Drinks;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLDrinksController {
    private Drinks drinks;

    public void setModel(Drinks drinks) {
        this.drinks = drinks;
    }

    @FXML
    private Button AranyalmaButton;

    @FXML
    private Button BorsodiButton;

    @FXML
    private Button CocaButton;

    @FXML
    private Button FantaButton;

    @FXML
    private Button HeinekenButton;

    @FXML
    private Button HennessyButton;

    @FXML
    private Button JackButton;

    @FXML
    private Label KasszaLabel;

    @FXML
    private Button KobanyaiButton;

    @FXML
    private TextArea ListaBox;

    @FXML
    private Label OsszegLabel;

    @FXML
    private Button PepsiButton;

    @FXML
    private Button RendelButton;

    @FXML
    private Button SierraButton;

    @FXML
    private Button SpriteButton;
}
