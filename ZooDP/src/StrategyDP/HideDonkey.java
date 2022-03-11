/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyDP;

import Main.Zoo;

//used for Strategy Pattern
/**
 *
 * @author Logan
 */
public class HideDonkey implements EquusHideStrategy {

    Zoo zoo;
    private javax.swing.JLabel donkey;
    
    public HideDonkey(Zoo zoo) {
        this.zoo = zoo;
        donkey = zoo.getDonkey();
    }

    @Override
    public void hide() {
    	donkey.setVisible(false);
    	donkey.revalidate();
    }
}
