package StrategyDP;

import java.net.URL;
import javax.swing.ImageIcon;
import Main.Zoo;

//used for Strategy Pattern
/**
 *
 * @author Logan
 */
public class DisplayZebra implements EquusDisplayStrategy{
    Zoo zoo;
    private javax.swing.JLabel zebra;
    URL urlZebra = getClass().getResource("/Image/Zebra.png");
    ImageIcon zebraIcon = new ImageIcon(urlZebra);
    
    public DisplayZebra(Zoo zoo) {
        this.zoo = zoo;
        zebra = zoo.getZebra();
    }

    @Override
    public void display() {
    	zebra.setIcon(zebraIcon);
    	zebra.setVisible(true);
    	zebra.revalidate();
    }
}
