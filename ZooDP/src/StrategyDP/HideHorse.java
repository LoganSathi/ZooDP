package StrategyDP;

import Main.Zoo;

//used for Strategy Pattern
/**
 *
 * @author Logan
 */
public class HideHorse implements EquusHideStrategy {

    Zoo zoo;
    private javax.swing.JLabel horse;
    
    public HideHorse(Zoo zoo) {
        this.zoo = zoo;
        horse = zoo.getHorse();
    }

    @Override
    public void hide() {
    	horse.setVisible(false);
    	horse.revalidate();
    }
}
