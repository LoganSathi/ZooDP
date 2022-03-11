package StrategyDP;

import java.net.URL;
import javax.swing.ImageIcon;
import Main.Zoo;

//used for Strategy Pattern
/**
 *
 * @author Logan
 */
public class DisplayHorse implements EquusDisplayStrategy{
    Zoo zoo;
    private javax.swing.JLabel horse;
    URL urlHorse = getClass().getResource("/Image/Horse.png");
    ImageIcon horseIcon = new ImageIcon(urlHorse);
    
    public DisplayHorse(Zoo zoo) {
        this.zoo = zoo;
        horse = zoo.getHorse();
    }

    @Override
    public void display() {
    	horse.setIcon(horseIcon);
    	horse.setVisible(true);
    	horse.revalidate();
    }
}
