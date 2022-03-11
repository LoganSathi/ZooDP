/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodDP;

//Used for Factory method pattern.

import Main.Zoo;
import FactoryMethodDP.AnimalFactory;
import FactoryMethodDP.Animal;


public class CatFactory extends AnimalFactory {


    @Override
    public Animal createAnimal(String animalType) {
        if (animalType == "tiger") {
            return Tiger.gettigerInstance();
        } else if (animalType == "lion") {
            return Lion.getLionInstance();
        }
        else
        {
        	return null;
        }
    }

}
