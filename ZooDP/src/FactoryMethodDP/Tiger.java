/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodDP;

import java.net.URL;
import javax.swing.ImageIcon;

//Used for Factory method pattern.

public class Tiger implements Animal {

    private static Tiger uniqueTiger;
    URL url = getClass().getResource("/Image/Tiger.png");
    ImageIcon tigerIcon = new ImageIcon(url);

    public static Tiger gettigerInstance() {
        if (uniqueTiger == null) {
        	uniqueTiger = new Tiger();
        }
        return uniqueTiger;
    }

    @Override
    public ImageIcon appear() {
        return tigerIcon;
    }

    @Override
    public ImageIcon disappear() {
        URL urlDisappear = getClass().getResource("");
        ImageIcon tigerIconDisappear = new ImageIcon(urlDisappear);
        return tigerIconDisappear;
    }
}
