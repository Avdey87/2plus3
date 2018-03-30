package com.aavdeev.a2plus3;

import java.util.ArrayList;
import java.util.List;

public class CarsList {
    List<String> getMarkAuto(String contry) {
        List<String> brand = new ArrayList<String>();
        if (contry.equals("Germany")) {
            brand.add("BMW");
            brand.add("Mersedes");
            brand.add("Wolswagen");
        }
        if (contry.equals("Italia")) {
            brand.add("Lamborgine");
            brand.add("Fiat");
            brand.add("Siat");
        }
        if (contry.equals("Russia")) {
            brand.add("ГАЗ");
            brand.add("УАЗ");
            brand.add("ВАЗ");
        }

        return brand;

    }

}
