package controller;

import model.ApiConversionModel;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SaveToFile {

    private File file = new File("log.txt");
//    private FileWriter writer;


    private ApiConversionModel apiConversionModel;
    private String timeStamp;


    public SaveToFile() {
    }

    public SaveToFile(ApiConversionModel apiConversionModel) {
        this.apiConversionModel = apiConversionModel;
    }

    //Salva conversões em arquivo de Log
    public void salvaLog(ApiConversionModel apiConversionModel, double inicialValue) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(
                    "Valor: " + apiConversionModel.baseCode() + " "+ inicialValue
                    +"\nConversão: " + apiConversionModel.targetCode() + " " + apiConversionModel.conversionResult()
                    + "\n"
                    + "Data e hora: " + new SimpleDateFormat("yyyyMMdd_HHmmss")
                    .format(Calendar.getInstance()
                            .getTime())
                    +"\n");
            writer.close();
        } catch (RuntimeException e){
            System.out.println("Um erro ocorreu: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void logCleaner() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(
                    " No momento não existem conversões salvas");
            writer.close();
            System.out.println("Limpeza efetuada com sucesso!");
        } catch (RuntimeException e){
            System.out.println("Um erro ocorreu: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
