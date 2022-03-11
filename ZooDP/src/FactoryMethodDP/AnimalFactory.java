/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodDP;

//Used for Factory method pattern.

import Main.Zoo;

public abstract class AnimalFactory {


    public Animal callAnimal(String animalType) {
    	Animal animal;
        animal = createAnimal(animalType);
        return animal;
    }
    
//Factory Method
    public abstract Animal createAnimal(String animalType);
}
