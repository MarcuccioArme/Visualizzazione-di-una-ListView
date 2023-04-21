package armenise.visualizzazione_listview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Vector;

public class ListViewController {

    //Dichiariamo la variabile "elencoNomi" di tipo Vector<String>
    private Vector<String> elencoNomi;

    //Dichiariamo la ListView "listaNomiView" di tipo String
    @FXML
    private ListView<String> listaNomiView;

    public void setElencoNomi(Vector<String> elencoNomi) {
        this.elencoNomi = elencoNomi;
    }

    //Per visualizzare i nomi
    public void visualizzaNomi() {

        //SE la Vector è vuota stampiamo "La lista è vuota" ALTRIMENTI riempiamo la ListView con gli item "nomi"
        if (elencoNomi.isEmpty()) {
            System.out.println("La lista è vuota");
        }else{
            ObservableList<String> nomi = FXCollections.observableArrayList(elencoNomi);
            listaNomiView.getItems().addAll(nomi);
        }

    }

    /*
    //Per tornare alla HomePage
    @FXML
    private void tornaAllaHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("HomePage");
        stage.show();
    }
    */

}
