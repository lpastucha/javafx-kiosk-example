package com.lpastucha.kiosk.view;

import com.lpastucha.kiosk.controller.MainViewActionDispatcher;
import com.lpastucha.kiosk.view.main.MainViewController;

public class ViewDispatcher {
    public View createMainView() {
        MainViewActionDispatcher mainViewActionDispatcher = new MainViewActionDispatcher();
        return new MainViewController(mainViewActionDispatcher);
    }
}
