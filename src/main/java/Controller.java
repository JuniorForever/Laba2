import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view = new View();
    private Model model = new Model();
    public Controller(){
        view.Screwdriver.addActionListener(new ButtonEventListener());
        view.Chip.addActionListener(new ButtonEventListener1());
        view.Cut.addActionListener(new ButtonEventListener2());
    }
    public void setView(Container pane){

        view.addComponentsToPane(pane);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(view.getScrewdriver()=="Раскрутить") {
                model.worker.Work("Раскрутить");
                view.Screwdriver.setText("Закрутить");
                JOptionPane.showMessageDialog(null,"Раскручено","Output",JOptionPane.PLAIN_MESSAGE);
            }
            else {
                model.worker.Work("Раскрутить");
                view.Screwdriver.setText("Раскрутить");
                JOptionPane.showMessageDialog(null,"Закручено","Output",JOptionPane.PLAIN_MESSAGE);
            }
        }

    }
    class ButtonEventListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.worker.Work("Стругать");
            JOptionPane.showMessageDialog(null,Hervesting.Form,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ButtonEventListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.worker.Work("Пилить");
            JOptionPane.showMessageDialog(null,Hervesting.Form,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
