package fr.lernejo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
   private final Sample sample = new Sample();
   @Test
   void testOpAdd() {
      int result = sample.op(Sample.Operation.ADD, 2, 3);
      Assertions.assertEquals(5, result);
   }

   @Test
   void testOpMult() {
      int result = sample.op(Sample.Operation.MULT, 2, 3);
      Assertions.assertEquals(6, result);
   }

   @Test
   void testFactWithNegativeNumber() {
      Assertions.assertThrows(IllegalArgumentException.class, () -> sample.fact(-1));
   }

   @Test
   void testFactWithZero() {
      int result = sample.fact(0);
      Assertions.assertEquals(1, result);
   }

   @Test
   void testFactWithPositiveNumber() {
      int result = sample.fact(5);
      Assertions.assertEquals(120, result);
   }
  
}
