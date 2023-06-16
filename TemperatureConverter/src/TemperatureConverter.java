public class TemperatureConverter {

  public static void main(String[] args) {
    int celsiusTemp = 30;
    int fahrenheitTemp = (int) (celsiusTemp * 1.8) + 32;
    System.out.println("Temperatura em graus Celsius: " + celsiusTemp);
    System.out.println("Temperatura em graus Fahrenheit: " + fahrenheitTemp);
  }
}