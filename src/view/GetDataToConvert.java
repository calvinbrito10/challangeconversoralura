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

    public void interactionClassUsdToEur () {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            DirectConvertion directConvertion = new DirectConvertion(apiKey);
            System.out.println("Valor Convertido: " + directConvertion.amountConverted(value, "USD", "EUR"));
            save.salvaLog(directConvertion.getApiConversionModel());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    public void interactionClassBrlToUsd () {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            DirectConvertion directConvertion = new DirectConvertion(apiKey);
            System.out.println("Valor Convertido: " + directConvertion.amountConverted(value, "BRL", "USD"));
            save.salvaLog(directConvertion.getApiConversionModel());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    public void interactionClassUsdToJpy () {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            DirectConvertion directConvertion = new DirectConvertion(apiKey);
            System.out.println("Valor Convertido: " + directConvertion.amountConverted(value, "USD", "JPY"));
            save.salvaLog(directConvertion.getApiConversionModel());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    public void interactionClassJpyToBrl () {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            DirectConvertion directConvertion = new DirectConvertion(apiKey);
            System.out.println("Valor Convertido: " + directConvertion.amountConverted(value, "JPY", "BRL"));
            save.salvaLog(directConvertion.getApiConversionModel());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    public void interactionClassBrlToGbp () {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            DirectConvertion directConvertion = new DirectConvertion(apiKey);
            System.out.println("Valor Convertido: " + directConvertion.amountConverted(value, "BRL", "GBP"));
            save.salvaLog(directConvertion.getApiConversionModel());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }



}
