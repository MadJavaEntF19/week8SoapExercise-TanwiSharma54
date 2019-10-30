package com.daehosting.temperatureconversion;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap12() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        BigDecimal expected = BigDecimal.valueOf(32);
        assertEquals(expected, result);

        // 2: Test for Fahrenheit to Celsius conversions
        result = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        expected = BigDecimal.valueOf(0);
        assertEquals(expected, result);

        // 3: Test for wind Chill In Celsius conversions
        result = service.windChillInCelsius(BigDecimal.valueOf(26),BigDecimal.valueOf(34));
        expected = BigDecimal.valueOf(18.0704);
        assertEquals(expected, result);
    }
}