module armenise.visualizzazione_listview {
    requires javafx.controls;
    requires javafx.fxml;


    opens armenise.visualizzazione_listview to javafx.fxml;
    exports armenise.visualizzazione_listview;
}