package interviewpreparation.queuestacks;

import org.junit.Test;
import interviewpreparation.queuestacks.QueueTwoStacks.MyQueue;

import static org.junit.Assert.assertEquals;

/**
 * Simple test case for {@link QueueTwoStacks} solution
 *
 * @author csantos
 */
public class QueueTwoStacksTest {

    @Test
    public void test_case_0() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(14);
        queue.enqueue(15);

        assertEquals(Integer.valueOf(14), queue.peek());
        assertEquals(Integer.valueOf(14), queue.dequeue());
        assertEquals(Integer.valueOf(15), queue.dequeue());
    }
}
