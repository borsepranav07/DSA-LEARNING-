import java.util.*;

public class hashmap_code {

    static class HashMap<K, V> {

        // Node class
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // n = number of key-value pairs
        private int n;

        // N = number of buckets
        private int N;

        // Array of LinkedLists
        private LinkedList<Node> buckets[];

        // Constructor
        @SuppressWarnings("unchecked")
        public HashMap() {

            this.N = 4;
            this.n = 0;

            this.buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash Function
        private int hashFunction(K key) {

            int hc = key.hashCode();

            return Math.abs(hc) % N;
        }

        // Search key inside LinkedList
        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {

                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }

        // Rehashing
        @SuppressWarnings("unchecked")
        private void rehash() {

            // Store old buckets
            LinkedList<Node> oldBuckets[] = buckets;

            // Double the number of buckets
            N = N * 2;

            // Create new bucket array
            buckets = new LinkedList[N];

            // Initialize new LinkedLists
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Reset number of elements
            n = 0;

            // Put all old elements into new buckets
            for (int i = 0; i < oldBuckets.length; i++) {

                LinkedList<Node> ll = oldBuckets[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.get(j);

                    put(node.key, node.value);
                }
            }
        }

        // PUT
        public void put(K key, V value) {

            // Find bucket index
            int bi = hashFunction(key);

            // Find data index inside bucket
            int di = searchInLL(key, bi);

            // Key does not exist
            if (di == -1) {

                buckets[bi].add(new Node(key, value));

                n++;
            }

            // Key already exists
            else {

                Node data = buckets[bi].get(di);

                data.value = value;
            }

            // Calculate load factor
            double lambda = (double) n / N;

            // Rehash if load factor > 2
            if (lambda > 2.0) {
                rehash();
            }
        }

        // GET
        public V get(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            // Key not found
            if (di == -1) {
                return null;
            }

            Node data = buckets[bi].get(di);

            return data.value;
        }

        // REMOVE
        public V remove(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            // Key not found
            if (di == -1) {
                return null;
            }

            Node data = buckets[bi].remove(di);

            n--;

            return data.value;
        }

        // CONTAINS KEY
        public boolean containsKey(K key) {

            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di == -1) {
                return false;
            }

            return true;
        }

        // KEY SET
        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            // Traverse all buckets
            for (int i = 0; i < buckets.length; i++) {

                // Get LinkedList of current bucket
                LinkedList<Node> ll = buckets[i];

                // Traverse all Nodes in LinkedList
                for (int j = 0; j < ll.size(); j++) {

                    // Get current Node
                    Node node = ll.get(j);

                    // Add key to ArrayList
                    keys.add(node.key);
                }
            }

            return keys;
        }

        // SIZE
        public int size() {
            return n;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // PUT
        map.put("India", 140);
        map.put("China", 141);
        map.put("USA", 33);
        map.put("Japan", 12);

        // GET
        System.out.println("India population: " + map.get("India"));

        // CONTAINS KEY
        System.out.println("Contains India: " + map.containsKey("India"));

        System.out.println("Contains Germany: " + map.containsKey("Germany"));

        // REMOVE
        System.out.println("Removed USA: " + map.remove("USA"));

        // SIZE
        System.out.println("Size: " + map.size());

        // KEY SET
        System.out.println("Keys: " + map.keySet());
    }
}