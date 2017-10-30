/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CekKesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author youmayosh
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField nm;
    @FXML
    private TextField bb;
    @FXML
    private TextField tb;
    @FXML
    private RadioButton male;
    @FXML
    private ToggleGroup Pilihan;
    @FXML
    private RadioButton female;
    @FXML
    private TextField ideal;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private Button btnProses;
    @FXML
    private Button btnHapus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nama = nm.getText();
        int jk = 0;
        
        
        int beratbadan = Integer.parseInt(bb.getText());
        int tinggibadan = Integer.parseInt(tb.getText());
        
        if(male.isSelected()){
            jk = (tinggibadan - 110);
        }
        if(female.isSelected()){
            jk = (tinggibadan - 100);
        }

        if(beratbadan < jk){
           ideal.setText(""+jk);
           hasil.setText(""+nama+" Anda Kurang Ideal");
           saran.setText("1. Coba Minum Susu Setiap Hari \n 2. Makanlah makanan berlemak");
        }
        if(beratbadan == jk){
           ideal.setText(""+jk);
           hasil.setText(""+nama+" Anda Sangat Ideal");
           saran.setText("Tetap Jagalah Pola Makan dan Kebiasaan Hidup Sehat Anda");
        }
        if(beratbadan > jk){
           ideal.setText(""+jk);
           hasil.setText(""+nama+" Anda Kegemukan");
           saran.setText("1. Coba Kurangi Minum Susu Setiap Hari \n 2. Kurangi Makanan Berlemak \n 3. Coba biasakan makan Sayuran dan Buah");
        }
    }

    @FXML
    private void hapus(ActionEvent event) {
        nm.setText("");
        tb.setText("");
        bb.setText("");
        male.setSelected(false);
        female.setSelected(false);
        ideal.setText("");
        hasil.setText("");
        saran.setText("");
    }
    }
    
