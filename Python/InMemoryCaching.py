class InMemoryCaching:
    def __init__(self):
        self.cache = {}

    def put(self, key, value):
        self.cache[key] = value

    def get(self, key):
        return self.cache.get(key)

    def remove(self, key):
        del self.cache[key]

    def clear(self):
        self.cache.clear()

# In Python, you can use the built-in dict type to implement an in-memory cache. The dict type is a hash table implementation that allows you to store key-value pairs in memory. Here's an example that demonstrates how to use a dict as an in-memory cache

# the InMemoryCache class encapsulates a dict that stores key-value pairs. The put method adds a new key-value pair to the cache, the get method retrieves the value associated with a given key, the remove method removes a key-value pair from the cache, and the clear method removes all key-value pairs from the cache
