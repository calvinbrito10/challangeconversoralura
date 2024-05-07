package view;

import controller.ConvertBrlToUsd;
import controller.DirectConvertion;

public class FacadeConvertion {

    private DirectConvertion directConvertion;

    public void BrlToUsd() {
        directConvertion = new ConvertBrlToUsd("f42b750b489ab51a2d3fd7e5");
        directConvertion.convert();
    }

}
