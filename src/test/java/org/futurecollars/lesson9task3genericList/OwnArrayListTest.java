package org.futurecollars.lesson9task3genericList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OwnArrayListTest {
    private OwnArrayList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new OwnArrayList<>();
    }

    @Test
    public void testAddAndSize() {
        assertTrue(list.add(1));
        assertTrue(list.add(2));
        assertTrue(list.add(3));
        assertEquals(3, list.size());
    }

    @Test
    public void testGet() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testGetIndexOutOfBounds() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    public void testRemove() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.remove(2));
        assertEquals(2, list.size());
        assertFalse(list.remove(4));
        assertEquals(2, list.size());
    }

    @Test
    public void testEnsureCapacity() {
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        assertEquals(15, list.size());
        assertEquals(14, list.get(14));
    }
}

