import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new TemperatureConverter();
    }

    // --- Known pair tests ---
    @Test
    public void testCelsiusToFahrenheit_ZeroC() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit_HundredC() {
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
    }

    // --- Round-trip test ---
    @Test
    public void testRoundTrip_CelsiusToFahrenheitToCelsius() {
        double original = 37.0; // body temperature, arbitrary test value
        double result = converter.fahrenheitToCelsius(converter.celsiusToFahrenheit(original));
        assertEquals(original, result, 0.01);
    }

    // --- Kelvin conversion test ---
    @Test
    public void testCelsiusToKelvin_ZeroC() {
        assertEquals(273.15, converter.celsiusToKelvin(0), 0.01);
    }

    @Test
    public void testCelsiusToKelvin_Negative() {
        assertEquals(173.15, converter.celsiusToKelvin(-100), 0.01);
    }
}