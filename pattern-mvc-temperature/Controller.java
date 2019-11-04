import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Controller {

    // private static View view = new View();

    public static class ActionAugmenter implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            View.model.augmenterTemperature();
            View.labelTemperature.setText(View.model.getTemperatureEnCelsius() + View.UNITE);
        }
    }

    public static class ActionDiminuer implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            View.model.reduireTemperature();
            View.labelTemperature.setText(View.model.getTemperatureEnCelsius() + View.UNITE);
        }
    }
}