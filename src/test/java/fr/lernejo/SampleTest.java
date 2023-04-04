package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SampleTest {
   @Test
   void dividing_by_zero_should_produce_an_exception() {
      int dividend = 10;
      int divisor = 0;
      Assertions.assertThrows(DivisionByZeroException.class,
         () -> Sample.divide(dividend, divisor));
   }

   @Test
   void dividing_10_by_2_should_produce_5() {
      int dividend = 10;
      int divisor = 2;
      int quotient = Sample.divide(dividend, divisor);
      Assertions.assertEquals(5, quotient);
   }

   @Test
   void dividing_negative_dividend_should_produce_an_exception() {
      int dividend = -10;
      int divisor = 2;
      Assertions.assertThrows(NegativeDividendException.class,
         () -> Sample.divide(dividend, divisor));
   }
}
