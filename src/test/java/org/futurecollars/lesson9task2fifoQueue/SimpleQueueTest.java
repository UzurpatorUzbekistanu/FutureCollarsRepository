package org.futurecollars.lesson9task2fifoQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class SimpleQueueTest {
    private OwnQueue queue;

    @BeforeEach
    void setUp() {
        queue = new SimpleQueue();
    }

    @Test
    void testAdd() {
        assertTrue(queue.add(1));
        assertFalse(queue.isEmpty());
    }

    @Test
    void testRemove() {
        queue.add(1);
        assertEquals(1, queue.remove());
        assertTrue(queue.isEmpty());
    }

    @Test
    void testElement() {
        queue.add(1);
        assertEquals(1, queue.element());
    }

    @Test
    void testRemoveFromEmptyQueue() {
        NoSuchElementException thrown = assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
        assertEquals("Queue is empty", thrown.getMessage());
    }

    @Test
    void testElementFromEmptyQueue() {
        NoSuchElementException thrown = assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
        assertEquals("Queue is empty", thrown.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "10, 20, 30",
            "100, 200, 300"
    })
    void testAddMultipleElements(Integer a, Integer b, Integer c) {
        queue.add(a);
        queue.add(b);
        queue.add(c);
        assertEquals(a, queue.element());
    }

    @Test
    void testQueueSize() {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(3, ((SimpleQueue) queue).size());
    }

    @Test
    void testQueueEmptyAfterRemovingAllElements() {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.remove();
        queue.remove();
        assertTrue(queue.isEmpty());
    }
}

