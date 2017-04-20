/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextgenpos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 *
 * @author phoel
 */
public class FXMLDocumentController implements Initializable {
    
    private TextField findProductTextField;
    @FXML
    private TextField salesAmountTextField;
    @FXML
    private Label findItemNameLabel;
    @FXML
    private Button findItembutton;
    @FXML
    private Label saleStatusLabel;
    @FXML
    private Button addSelectedButton;
    @FXML
    private TableColumn<?, ?> productName;
    @FXML
    private TableColumn<?, ?> productDescription;
    @FXML
    private TableColumn<?, ?> productPrice;
    @FXML
    private Button buyButton;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
