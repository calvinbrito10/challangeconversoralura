package view;

import controller.*;

import java.io.FileNotFoundException;

public class FacadeConvertion {

    private DirectConvertion directConvertion;
    private final String apiKey = "f42b750b489ab51a2d3fd7e5";

    public void BrlToUsd() {
        directConvertion = new ConvertBrlToUsd(apiKey);
        directConvertion.convert();
        System.out.println("******** Retornando ao Menu ******** \n \n \n");
    }

    public void UsdToJpy() {
        directConvertion = new ConvertBrlToUsd(apiKey);
        directConvertion.convert();
        System.out.println("******** Retornando ao Menu ******** \n \n \n");
    }

    public void BrlToGbp() {
        directConvertion = new ConvertBrlToGbp(apiKey);
        directConvertion.convert();
        System.out.println("******** Retornando ao Menu ******** \n \n \n");
    }

    public void JpyToBrl() {
        directConvertion = new ConvertJpyToBrl(apiKey);
        directConvertion.convert();
        System.out.println("******** Retornando ao Menu ******** \n \n \n");
    }

    public void UsdToBrl() {
        directConvertion = new ConvertUsdToBrl(apiKey);
        directConvertion.convert();
        System.out.println("******** Retornando ao Menu ******** \n \n \n");
    }

    public void UsdToEur() {
        directConvertion = new ConvertUsdToEur(apiKey);
        directConvertion.convert();
        System.out.println("******** Retornando ao Menu ******** \n \n \n");
    }

    public void showConvertionsMade() throws FileNotFoundException {
        FileHandle viewer = new FileHandle();
        viewer.readLog();
    }

    public void cleanLog() {
        FileHandle cleaner = new FileHandle();
        cleaner.logCleaner();
    }


}
