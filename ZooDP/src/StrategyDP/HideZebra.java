package StrategyDP;

import Main.Zoo;

//used for Strategy Pattern
/**
 *
 * @author Logan
 */
public class HideZebra implements EquusHideStrategy {

    Zoo zoo;
    private javax.swing.JLabel zebra;
    
    public HideZebra(Zoo zoo) {
        this.zoo = zoo;
        zebra = zoo.getZebra();
    }

    @Override
    public void hide() {
    	zebra.setVisible(false);
    	zebra.revalidate();
    }
}
