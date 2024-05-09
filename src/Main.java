import controller.ConvertBrlToUsd;
import model.ApiConversionModel;
import view.FacadeConvertion;

public class Main {
    public static void main(String[] args) {
        ConvertBrlToUsd convertBrlToUsd = new ConvertBrlToUsd("f42b750b489ab51a2d3fd7e5");
        convertBrlToUsd.convert();
        FacadeConvertion facadeConvertion = new FacadeConvertion();
        facadeConvertion.BrlToUsd();

        ApiConversionModel api = new ApiConversionModel("", "", 20, 20);


    }
}