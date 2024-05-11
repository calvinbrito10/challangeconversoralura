package controller;

import java.util.Scanner;

public class ConvertBrlToGbp extends DirectConvertion {

    private final Scanner moneyToBeConverted;
    private final FileHandle save;

    public ConvertBrlToGbp(String apiKey) {
        super(apiKey);
        this.moneyToBeConverted = new Scanner(System.in);
        this.save = new FileHandle();
    }

    public void convert() {
        try {
            System.out.println("Digite a quantidade que deseja converter: ");
            String value = moneyToBeConverted.nextLine();
            System.out.println("Valor Convertido: " + amountConverted(value, "BRL", "GBP"));
            save.salvaLog(getApiConversionModel(), Double.parseDouble(value));
            System.out.println("Conversão salva");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }


}
