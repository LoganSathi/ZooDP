/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodDP;

import java.net.URL;
import javax.swing.ImageIcon;

//Used for Singleton Pattern.

public class Swan implements Animal {

    private static Swan uniqueSwan;

    URL url = getClass().getResource("/Image/Swan.png");
    ImageIcon swanIcon = new ImageIcon(url);

    public static Swan getSwanInstance() {
        if (uniqueSwan == null) {
            uniqueSwan = new Swan();
        }
        return uniqueSwan;	
    }

    @Override
    public ImageIcon appear() {
        return swanIcon;
    }

    @Override
    public ImageIcon disappear() {
        URL urlDisappear = getClass().getResource("");
        ImageIcon swanIconDisappear = new ImageIcon(urlDisappear);
        return swanIconDisappear;
    }

}
