import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

@DisplayName("Day 1 Tests")
class Day1Tests {

    @Test
    @DisplayName("Should require 2 fuel for mass of 12")
    fun should_require_2_fuel_for_mass_12(){
        val fuel = calculateFuel(12)
        assertEquals(2, fuel)
    }

    @Test
    @DisplayName("Should require 2 fuel for mass of 14")
    fun should_require_2_fuel_for_mass_14(){
        val fuel = calculateFuel(14)
        assertEquals(2, fuel)
    }

    @Test
    @DisplayName("Should require 654 fuel for mass of 1969")
    fun should_require_654_fuel_for_mass_1969(){
        val fuel = calculateFuel(1969)
        assertEquals(654, fuel)
    }

    @Test
    @DisplayName("Should require 33583 fuel for mass of 100756")
    fun should_require_33583_fuel_for_mass_100756(){
        val fuel = calculateFuel(100756)
        assertEquals(33583, fuel)
    }
}