package view;

import controller.DirectConvertion;
import controller.SaveToFile;

import java.util.Scanner;

public class GetDataToConvert {
    private Scanner moneyToBeConverted = new Scanner(System.in);
    private String apiKey;
    private SaveToFile save = new SaveToFile();

    public GetDataToConvert(String apiKey) {
        this.apiKey = apiKey;
    }

    public void interactionClassUsdToBrl () {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            DirectConvertion directConvertion = new DirectConvertion(apiKey);
            System.out.println("Valor Convertido: " + directConvertion.amountConverted(value, "USD", "BRL"));
            save.salvaLog(directConvertion.getApiConversionModel());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }



}
