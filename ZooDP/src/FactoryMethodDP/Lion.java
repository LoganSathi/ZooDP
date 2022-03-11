/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodDP;


import java.net.URL;
import javax.swing.ImageIcon;

//Used for Factory method pattern.

public class Lion implements Animal {

    private static Lion uniqueLion;
    URL url = getClass().getResource("/Image/Lion.png");
    ImageIcon lionIcon = new ImageIcon(url);

    public static Lion getLionInstance() {
        if (uniqueLion == null) {
        	uniqueLion = new Lion();
        }
        return uniqueLion;
    }

    @Override
    public ImageIcon appear() {
        return lionIcon;
    }

    @Override
    public ImageIcon disappear() {
        URL urlDisappear = getClass().getResource("");
        ImageIcon lionIconDisappear = new ImageIcon(urlDisappear);
        return lionIconDisappear;
    }
}
