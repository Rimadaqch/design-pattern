public class Model {

    private int temperatureEnCelsius;

    public Model() {
        temperatureEnCelsius = 30;
    }

    public int getTemperatureEnCelsius() {
        return temperatureEnCelsius;
    }

    public int getTemperatureEnFahrenheit() {
        return 18 * temperatureEnCelsius + 32;
    }

    public void augmenterTemperature() {
        temperatureEnCelsius += 1;
    }

    public void reduireTemperature() {
        temperatureEnCelsius -= 1;
    }

}