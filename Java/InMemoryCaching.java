import java.util.HashMap;

public class InMemoryCaching {
    private HashMap<String, Object> cache;

    public InMemoryCache() {
        this.cache = new HashMap<String, Object>();
    }

    public void put(String key, Object value) {
        cache.put(key, value);
    }

    public Object get(String key) {
        return cache.get(key);
    }

    public void remove(String key) {
        cache.remove(key);
    }

    public void clear() {
        cache.clear();
    }
}

// In Java, one way to implement in-memory caching is to use the HashMap class from the java.util package. The HashMap class is a hash table implementation of the Map interface that allows you to store key-value pairs in memory. Here's an example that demonstrates how to use a HashMap as an in-memory cache

// the InMemoryCache class encapsulates a HashMap that stores key-value pairs. The put method adds a new key-value pair to the cache, the get method retrieves the value associated with a given key, the remove method removes a key-value pair from the cache, and the clear method removes all key-value pairs from the cache.
