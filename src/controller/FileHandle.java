package controller;

import model.ApiConversionModel;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileHandle {

    private final File file = new File("log.txt");
    public FileHandle() {
    }


    //Salva conversões em arquivo de Log
    public void salvaLog(ApiConversionModel apiConversionModel, double inicialValue) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(
                    "Valor: " + apiConversionModel.baseCode() + " " + inicialValue
                            + "\nConversão: " + apiConversionModel.targetCode() + " " + apiConversionModel.conversionResult()
                            + "\n"
                            + "Data e hora: " + new SimpleDateFormat("yyyyMMdd_HHmmss")
                            .format(Calendar.getInstance()
                                    .getTime())
                            + "\n");
            writer.close();
        } catch (RuntimeException e) {
            System.out.println("Um erro ocorreu: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void logCleaner() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(
                    "");
            writer.close();
            System.out.println("Limpeza efetuada com sucesso!");
        } catch (RuntimeException e) {
            System.out.println("Um erro ocorreu: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readLog() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("log.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("\n \n");
        } catch (IOException e) {
            System.out.println("O seguinte erro ocorreu ao consultar o log: " + e.getMessage());
        }
    }
}
