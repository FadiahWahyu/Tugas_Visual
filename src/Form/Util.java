/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.text.DecimalFormat;

/**
 *
 * @author NANRC
 */
public class Util {
    public static double parseHarga(String text) {
        if (text == null || text.isEmpty()) return 0.0;
        try {
            return Double.parseDouble(text.replace(",", ""));
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    // Format angka double ke string "300,000.00"
    public static String formatHarga(double angka) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(angka);
    }
}
