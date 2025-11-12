package Assignment;
import java.util.HashMap;
import java.util.Map;

public class ThreadSafeCache<K, V> {

    private final Map<K, V> cache = new HashMap<>();
    public synchronized void put(K key, V value) {
        cache.put(key, value);
    }
    public synchronized V get(K key) {
        return cache.get(key);
    }
    public synchronized void remove(K key) {
        cache.remove(key);
    }
    public synchronized int size() {
        return cache.size();
    }
    public synchronized void clear() {
        cache.clear();
    }
    public static void main(String[] args) {
        ThreadSafeCache<String, String> cache = new ThreadSafeCache<>();
        Thread writer = new Thread(() -> {
            cache.put("name", "Sumetha");
            cache.put("city", "Chennai");
            System.out.println("Writer added data.");
        });
        Thread reader = new Thread(() -> {
            System.out.println("Name: " + cache.get("name"));
            System.out.println("City: " + cache.get("city"));
        });

        writer.start();
        reader.start();
    }
}
