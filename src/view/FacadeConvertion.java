package view;

import controller.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FacadeConvertion {

    private DirectConvertion directConvertion;
    private String apiKey = "f42b750b489ab51a2d3fd7e5";
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
        BufferedReader reader = new BufferedReader(new FileReader("log.txt"));
        try {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch (IOException e){
            System.out.println("O seguinte erro ocorreu ao consultar o log: " + e.getMessage());
        }
    }

    public void cleanLog() {
        SaveToFile cleaner = new SaveToFile();
        cleaner.logCleaner();
    }


}
