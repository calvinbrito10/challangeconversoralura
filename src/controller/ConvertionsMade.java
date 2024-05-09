package controller;

import model.ApiConversionModel;

import java.util.ArrayList;
import java.util.List;

public class ConvertionsMade {

    private List<ApiConversionModel> list;

    public ConvertionsMade() {
        list = new ArrayList<>();
    }
    
    public void addConverted(ApiConversionModel convertionData) {
        list.add(convertionData);
    }
    
    public void showConvetions() {
        System.out.println("Conversões efetuadas até o momento: \n");
        for (ApiConversionModel convertionMade:
             list) {
            System.out.println("Original Currence: " + convertionMade.baseCode() +
                    "\nValue: " + convertionMade.inicialValue() +
                    "\nNew Currence" + convertionMade.targetCode() +
                    "\nFinal value after convertion: "+ convertionMade.conversionResult());
        }
    }
    
    
}
