import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTimerTest {

    @Test
    public void testTimerStartAndRunningState() {
        SimpleTimer timer = new SimpleTimer();
        timer.start();
        assertTrue(timer.isRunning());
    }

    @Test
    public void testTimerStopAndState() {
        SimpleTimer timer = new SimpleTimer();
        timer.start();
        timer.stop();
        assertFalse(timer.isRunning());
    }

    @Test
    public void testElapsedTime() throws InterruptedException {
        SimpleTimer timer = new SimpleTimer();
        timer.start();
        Thread.sleep(100); // Delay for ~100ms
        timer.stop();
        assertTrue(timer.getElapsedTime() >= 90);
    }
}