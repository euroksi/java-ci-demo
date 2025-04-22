public class SampleTest {
    @org.junit.jupiter.api.Test
    public void testSum() {
        int a = 2 + 2;
        org.junit.jupiter.api.Assertions.assertEquals(4, a);
    }
    @org.junit.jupiter.api.Test
    public void testMultiply() {
        int result = 3 * 3;
        org.junit.jupiter.api.Assertions.assertEquals(9, result);
    }
}