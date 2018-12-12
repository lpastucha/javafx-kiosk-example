package com.lpastucha.kiosk.run;

import com.lpastucha.kiosk.view.View;
import com.lpastucha.kiosk.view.ViewDispatcher;
import com.sun.javafx.text.TextRun;
import com.sun.javafx.tk.Toolkit;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;

public class KioskRunner extends Application {

    private ViewDispatcher viewDispatcher = new ViewDispatcher();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        View mainView = viewDispatcher.createMainView();
        Scene scene = new Scene(mainView.getViewParent(), primaryScreenBounds.getWidth(), primaryScreenBounds.getHeight());
        primaryStage.setScene(scene);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setMaximized(true);
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint(null);
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        primaryStage.show();
    }
}
