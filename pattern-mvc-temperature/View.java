
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel {

    private static final long serialVersionUID = 1L;

    static String UNITE = "\u00B0" + "C";

    static JButton buttonAugmenter;
    static JButton buttonDiminuer;
    static JLabel labelTemperature;

    static Model model = new Model();

    public View() {

        buttonAugmenter = new JButton("+");
        buttonAugmenter.setPreferredSize(new java.awt.Dimension(32, 0));
        buttonAugmenter.setBackground(new java.awt.Color(0, 67, 120));
        buttonAugmenter.setFont(new java.awt.Font("Arial", 1, 30));
        buttonAugmenter.setForeground(new java.awt.Color(255, 255, 255));
        Controller.ActionAugmenter actionAugmenter = new Controller.ActionAugmenter();
        buttonAugmenter.addActionListener(actionAugmenter);

        buttonDiminuer = new JButton("-");
        buttonDiminuer.setPreferredSize(new java.awt.Dimension(32, 0));
        buttonDiminuer.setBackground(new java.awt.Color(0, 67, 120));
        buttonDiminuer.setFont(new java.awt.Font("Arial", 1, 30));
        buttonDiminuer.setForeground(new java.awt.Color(255, 255, 255));
        Controller.ActionDiminuer actionDiminuer = new Controller.ActionDiminuer();
        buttonDiminuer.addActionListener(actionDiminuer);

        labelTemperature = new JLabel(model.getTemperatureEnCelsius() + UNITE);
        labelTemperature.setFont(new java.awt.Font("Arial Black", 0, 100));
        labelTemperature.setForeground(new java.awt.Color(0, 60, 140));

        setPreferredSize(new java.awt.Dimension(944, 563));
        setLayout(null);

        add(buttonAugmenter);
        add(buttonDiminuer);
        add(labelTemperature);

        buttonAugmenter.setBounds(480, 265, 60, 45);
        buttonDiminuer.setBounds(400, 265, 55, 45);
        labelTemperature.setBounds(365, 65, 360, 170);
    }

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("MyPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new View());
        frame.pack();
        frame.setVisible(true);
    }
}