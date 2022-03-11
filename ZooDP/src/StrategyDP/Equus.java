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
public abstract class Equus {
	EquusDisplayStrategy equusDisplayStrategy;
	EquusHideStrategy equusHideStrategy;
	Zoo zoo;

    public Equus(Zoo zoo) {
        this.zoo = zoo;
    }    

	public void displayBehaviour(){
    	equusDisplayStrategy.display();
    }
	
	public void hideBehaviour(){
    	equusHideStrategy.hide();
    }
	
	public void setEquusDisplayStrategy(EquusDisplayStrategy equusDisplayStrategy) {
		this.equusDisplayStrategy = equusDisplayStrategy;
	}
}
