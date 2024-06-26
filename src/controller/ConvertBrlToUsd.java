package controller;

import java.util.Scanner;

public class ConvertBrlToUsd extends DirectConvertion{
    private Scanner moneyToBeConverted;
    private SaveToFile save;
    public ConvertBrlToUsd(String apiKey) {
        super(apiKey);
        this. moneyToBeConverted = new Scanner(System.in);
        this.save = new SaveToFile();
    }

    public void convert() {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            System.out.println("Valor Convertido: " + amountConverted(value, "BRL", "USD"));
            save.salvaLog(getApiConversionModel(), Double.parseDouble(value));
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

}
