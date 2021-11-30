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
}