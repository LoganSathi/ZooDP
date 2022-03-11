/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyDP;

//used for Strategy Pattern

import Main.Zoo;
/**
 *
 * @author Logan
 */
public class Zebra extends Equus{

    public Zebra(Zoo zoo) {
        super(zoo);
        equusDisplayStrategy = new DisplayZebra(zoo);
        equusHideStrategy = new HideZebra(zoo);
    }

}
