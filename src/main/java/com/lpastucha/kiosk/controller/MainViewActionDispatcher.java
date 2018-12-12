package com.lpastucha.kiosk.controller;

import com.lpastucha.kiosk.view.main.MainViewActionListener;
import javafx.scene.control.Alert;

public class MainViewActionDispatcher implements MainViewActionListener {
    @Override
    public void onCloseView() {
        System.exit(0);
    }

    @Override
    public void onApplyChanges() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Content");
        alert.showAndWait();
    }
}
