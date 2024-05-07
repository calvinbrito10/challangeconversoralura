package controller;

import model.ApiConversionModel;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

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

    public void salvaLog(ApiConversionModel apiConversionModel) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write("Conversão: " + apiConversionModel.toString()
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
}
