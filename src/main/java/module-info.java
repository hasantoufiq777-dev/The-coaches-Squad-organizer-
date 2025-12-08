//module com.example.coachesteam {
//    requires javafx.controls;
//    requires javafx.fxml;
//    requires javafx.web;
//
//    requires org.controlsfx.controls;
//    requires com.dlsc.formsfx;
//    requires net.synedra.validatorfx;
//    requires org.kordamp.ikonli.javafx;
//    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
//    requires com.almasb.fxgl.all;
//
//    opens com.example.coachesteam to javafx.fxml;
//    exports com.example.coachesteam;
//
//}
module com.example.coachsquadorganizer {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.coachteam.controller to javafx.fxml;
    opens com.example.coachteam to javafx.base;

    exports com.example.coachteam.controller;
    exports com.example.coachteam;
}
