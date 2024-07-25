package org.futurecollars.lesson9task1ownHashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SimpleHashMapTest {
    private SimpleHashMap map;

    @BeforeEach
    void setUp() {
        map = new SimpleHashMap();
    }

    @Test
    void testPutAndGet() {
        map.put("key1", "value1");
        assertEquals("value1", map.get("key1"));
    }

    @Test
    void testContainsKey() {
        map.put("key1", "value1");
        assertTrue(map.containsKey("key1"));
        assertFalse(map.containsKey("key2"));
    }

    @Test
    void testContainsValue() {
        map.put("key1", "value1");
        assertTrue(map.containsValue("value1"));
        assertFalse(map.containsValue("value2"));
    }

    @Test
    void testRemove() {
        map.put("key1", "value1");
        assertEquals("value1", map.remove("key1"));
        assertNull(map.get("key1"));
        assertFalse(map.containsKey("key1"));
    }

    @ParameterizedTest
    @CsvSource({
            "key1, value1",
            "key2, value2",
            "key3, value3"
    })
    void testParameterizedPutAndGet(String key, String value) {
        map.put(key, value);
        assertEquals(value, map.get(key));
    }

    @Test
    void testUpdateValue() {
        map.put("key1", "value1");
        map.put("key1", "value2");
        assertEquals("value2", map.get("key1"));
    }

    @Test
    void testRemoveNonExistentKey() {
        assertNull(map.remove("key1"));
    }
}

