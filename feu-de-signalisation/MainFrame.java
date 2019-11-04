import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class MainFrame extends JFrame {
    
    private static final int V_GAP = 10;
    private static final int H_GAP = 10;
    
    private JPanel mainPanel;
    private JPanel buttonPanel;
    private JButton buttonStart;
    private JButton buttonStop;
    private TrafficLights trafficLights;

    public MainFrame() {

        trafficLights = new TrafficLights();

        buttonStart = new JButton("Démarrer");
        buttonStart.addActionListener(e -> {
            if (e.getSource() == buttonStart) {
                Thread thread = new Thread(trafficLights); 
                thread.start();
            }
        });
        
        buttonStop = new JButton("Arréter");
        buttonStop.addActionListener(e -> {
            if (e.getSource() == buttonStop) {      
                trafficLights.init();
            }
        });

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.TRAILING, V_GAP, H_GAP));
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(buttonStart);
        buttonPanel.add(buttonStop);

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(trafficLights, BorderLayout.CENTER);

        setContentPane(mainPanel);
    }
}