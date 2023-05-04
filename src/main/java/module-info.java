module gomez.david.el3enraya {
    requires javafx.controls;
    requires javafx.fxml;


    opens zzettazz.senth.el3enraya to javafx.fxml;
    exports zzettazz.senth.el3enraya;
    exports controlador;
    opens controlador to javafx.fxml;
}