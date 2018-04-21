package emts.cars;

import android.content.Context;

public class MainActivityPresenter  {
    ViewModelController Controller;
    Utility utility;
    public MainActivityPresenter(ViewModelController controller, Context context) {
        this.Controller = controller;
        utility = new Utility(context);
        controller.initializeView();
        controller.loadData(utility.readDataFromFile().getVehicles());
    }
}
