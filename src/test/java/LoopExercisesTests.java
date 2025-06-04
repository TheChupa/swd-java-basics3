import org.example.LoopExercises;
import org.junit.Test;

public class LoopExercisesTests {
    @Test
    public void testSum() {
        LoopExercises loopExercises = new LoopExercises();
        assert loopExercises.sum(5) == 15;
        assert loopExercises.sum(10) == 55;
        assert loopExercises.sum(100) == 5050;
    }

    @Test
    public void testSumUntilEven() {
        LoopExercises loopExercises = new LoopExercises();
        assert loopExercises.sumUntilEven(5) == 6;
        assert loopExercises.sumUntilEven(10) == 6;
        assert loopExercises.sumUntilEven(100) == 6;
    }

    @Test
    public void testSumBackwardsUntilEven() {
        LoopExercises loopExercises = new LoopExercises();
        assert loopExercises.sumBackwardsUntilEven(39) == 120;
        assert loopExercises.sumBackwardsUntilEven(97) == 294;
        assert loopExercises.sumBackwardsUntilEven(241) == 726;
    }
}
