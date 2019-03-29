package interviewpreparation.queuestacks;

import java.util.Stack;

/**
 * Queues: A Tale of Two Stacks
 * https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
 *
 * @author csantos
 */
public class QueueTwoStacks {


    /**
     * Implementation of Queue data structure using two stacks
     */
    static class MyQueue<T> {
        private Stack<T> in = new Stack<>();
        private Stack<T> out = new Stack<>();

        public void enqueue(T data) {
            in.push(data);
        }

        public T dequeue() {
            moveDataToOutput();
            return out.pop();
        }

        public T peek() {
            moveDataToOutput();
            return out.peek();
        }

        private void moveDataToOutput() {
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
        }
    }
}
