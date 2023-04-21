package armenise.visualizzazione_listview;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Vector;

public class HomePageController {

    Vector<String> elencoNomi = new Vector<>();

    @FXML
    Label esitoLabel;

    @FXML
    private void riempiLista() {
        elencoNomi.add("Mario Rossi");
        elencoNomi.add("Luca Bianchi");
        elencoNomi.add("Matteo Verdi");
        elencoNomi.add("Davide Neri");
        elencoNomi.add("Andrea Fucsia");
        elencoNomi.add("Giulia Gialli");
        elencoNomi.add("Marco Celeste");
        elencoNomi.add("Sara Bluastro");
        elencoNomi.add("Alessio Azzurri");
        elencoNomi.add("Valentina Verdi");
        elencoNomi.add("Fabio Arancioni");

        esitoLabel.setText("La lista è stata riempita");
    }

    @FXML
    private void visualizzaLista(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListView.fxml"));
        Parent root = loader.load();

        ListViewController listView = loader.getController();
        listView.setElencoNomi(elencoNomi);
        listView.visualizzaNomi();

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("ListView");
        stage.show();
    }

}