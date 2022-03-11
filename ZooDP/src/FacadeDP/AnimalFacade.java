/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDP;

import FactoryMethodDP.Animal;
import Main.Zoo;
import StrategyDP.Equus;

/**	
 *
 * @author Logan
 */
public class AnimalFacade {

	Zoo zoo;
    Animal tiger;
    Animal lion;
    Equus horse;
    Animal duck;
    Equus donkey;
    Animal swan;
    Equus zebra;
 
    public AnimalFacade(Zoo zoo, Equus horseEquus, Animal duck, Equus donkeyEquus, Animal swan, Equus zebraEquus, Animal tiger, Animal lion) {
        this.zoo = zoo;
        this.horse = horseEquus;
        this.duck = duck;
        this.donkey = donkeyEquus;
        this.swan = swan;
        this.zebra = zebraEquus;
        this.tiger = tiger;
        this.lion = lion;
    }


	public void clickAll() {
        zoo.getTiger().setIcon(tiger.appear()); //getTiger = JLabel
        zoo.getTiger().setVisible(true);
        zoo.getTiger().revalidate();
        
        zoo.getLion().setIcon(lion.appear());
        zoo.getLion().setVisible(true);
        zoo.getLion().revalidate();
                
        horse.displayBehaviour();
        
        zoo.getDuck().setIcon(duck.appear());
        zoo.getDuck().setVisible(true);
        zoo.getDuck().revalidate();
                
        donkey.displayBehaviour();
        
        zoo.getSwan().setIcon(swan.appear());
        zoo.getSwan().setVisible(true);
        zoo.getSwan().revalidate();
        
        zebra.displayBehaviour();

    }

    public void unclickAll() {
        zoo.getTiger().setIcon(tiger.disappear());
        zoo.getTiger().setVisible(false);
        zoo.getTiger().revalidate();
        
        zoo.getLion().setIcon(lion.disappear());
        zoo.getLion().setVisible(false);
        zoo.getLion().revalidate();
                
        horse.hideBehaviour();
        
        zoo.getDuck().setIcon(duck.disappear());
        zoo.getDuck().setVisible(true);
        zoo.getDuck().revalidate();
                
        donkey.hideBehaviour();
        
        zoo.getSwan().setIcon(swan.disappear());
        zoo.getSwan().setVisible(true);
        zoo.getSwan().revalidate();
        
        zebra.hideBehaviour();
    }
}
