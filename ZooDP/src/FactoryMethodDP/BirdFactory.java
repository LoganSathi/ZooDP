/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodDP;

//Used for Factory method pattern.

import Main.Zoo;


public class BirdFactory extends AnimalFactory {


    @Override
    public Animal createAnimal(String animalType) {
        if (animalType == "swan") {
            return Swan.getSwanInstance();
        }
            else if (animalType == "duck") {
                return Duck.getDuckInstance();
        } else {
            return null;
        }
    }

}