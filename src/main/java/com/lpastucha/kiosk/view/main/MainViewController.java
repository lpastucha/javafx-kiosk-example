package com.lpastucha.kiosk.view.main;

import com.lpastucha.kiosk.view.View;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainViewController implements Initializable, View {

    private MainViewActionListener actionListener;

    private GridPane rootPane;

    public MainViewController(MainViewActionListener actionListener) {
        this.actionListener = Objects.requireNonNull(actionListener, "Can not create view without view actions listener");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("dict.stringsbundle", Locale.getDefault());
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("fxml/MainView.fxml"), resourceBundle);
        fxmlLoader.setController(this);
        try {
            this.rootPane = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Parent getViewParent() {
        return this.rootPane;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void accept() {
        actionListener.onApplyChanges();
    }

    @FXML
    private void close() {
        actionListener.onCloseView();
    }
}
