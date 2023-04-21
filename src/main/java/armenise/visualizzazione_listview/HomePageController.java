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

    //Dichiariamo la Vector "elencoNomi"
    Vector<String> elencoNomi = new Vector<>();

    @FXML
    Label esitoLabel;

    //Per riempire la Vector con nomi abbastanza *ORIGINALI*
    @FXML
    private void riempiVector() {
        //I nomi originali:
        elencoNomi.add("Mario Rossi");
        elencoNomi.add("Luca Bianchi");
        elencoNomi.add("Matteo Verdi");
        elencoNomi.add("Davide Neri");
        elencoNomi.add("Andrea Fucsia");
        elencoNomi.add("Giulia Gialli");
        elencoNomi.add("Marco Celeste");    //:P
        elencoNomi.add("Sara Bluastro");
        elencoNomi.add("Alessio Azzurri");
        elencoNomi.add("Valentina Verdi");
        elencoNomi.add("Fabio Arancioni");

        //Visualizziamo l'esito nella apposita Label
        esitoLabel.setText("La lista è stata riempita");
    }

    //Per visualizzare la ListView
    @FXML
    private void visualizzaLista(ActionEvent event) throws IOException {
        //Carichiamo la scena
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ListView.fxml"));
        Parent root = loader.load();

        //Chiamiamo il controller "ListViewController"
        ListViewController listViewController = loader.getController();

        //Chiamiamo la funzione "setElencoNomi" in ListViewController passando per parametro la Vector
        listViewController.setElencoNomi(elencoNomi);

        //Chiamiamo la funzione "visualizzaNomi" in ListViewController che inserisce i nomi nella ListView
        listViewController.visualizzaNomi();

        //Impostiamo come scena attuale "ListView.fxml"
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("ListView"); //--> Cambia il titolo della scheda
        stage.show();
    }

}

//- Marco Armenise