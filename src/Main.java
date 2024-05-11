import controller.ConvertBrlToUsd;
import model.ApiConversionModel;
import view.FacadeConvertion;

import javax.xml.transform.Source;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        FacadeConvertion facadeConvertion = new FacadeConvertion();
        boolean stayInMenu = true;

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                ***************** Sistema da Conversão *****************
                """);

        while (stayInMenu) {
            int escolha;
            System.out.println("""
                    Selecione uma das opções para continuar
                    1 - Converter de Real para Dolar
                    2 - Converter de Yen para Real
                    4 - Converter de Dolar para Real
                    5 - Converter de Dolar para Euro
                    6 - Converter de Dolar para Yen
                    7 - Consultar Conversões feitas ate o momento
                    8 - Limpar log de conversões
                    9 - Sair
                    """);
            try {
                escolha = entrada.nextInt();
                switch (escolha) {
                    case 1:
                        facadeConvertion.BrlToUsd();
                        break;
                    case 2:
                        facadeConvertion.JpyToBrl();
                        break;
                    case 3:
                        facadeConvertion.UsdToBrl();
                        break;
                    case 4:
                        facadeConvertion.UsdToEur();
                        break;
                    case 5:
                        facadeConvertion.UsdToEur();
                        break;
                    case 6:
                        facadeConvertion.UsdToJpy();
                        break;
                    case 7:
                        facadeConvertion.showConvertionsMade();
                        break;
                    case 8:
                        facadeConvertion.cleanLog();
                        break;
                    case 9:
                        stayInMenu = false;
                        break;
                    default:
                        System.out.println("******* Opção invalida, tente novamente ******* \n \n \n");
                        break;


                }
            }catch (UnsupportedOperationException e) {
                System.out.println(
                        "Erro : " + e.getMessage()
                );
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}