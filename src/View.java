import javax.swing.*;
import java.awt.*;

public class View {
    JButton Cut = new JButton("Пилить");
    JButton Chip = new JButton("Стругать");
    JButton Screwdriver = new JButton("Раскрутить");

    public String getCut(){
        return Cut.getText();
    }

    public String getChip(){
        return Chip.getText();
    }

    public String getScrewdriver(){
        return Screwdriver.getText();
    }


    public  void addComponentsToPane(Container pane) {
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(Cut, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.02;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(Chip, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.0025;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(Screwdriver, c);
    }
}
