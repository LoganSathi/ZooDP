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
public class Donkey extends Equus {

    public Donkey(Zoo zoo) {
        super(zoo);
        equusDisplayStrategy = new DisplayDonkey(zoo);
        equusHideStrategy = new HideDonkey(zoo);
    }

}
