package demo.generics;


    interface Pair<K, V> {
        K getKey();
        V getValue();
    }

    public  class OrderedPair<K, V> implements Pair<K, V> {
        private final K key;
        private final V value;

        public OrderedPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public static void main(String[] args) {
            Pair<String, Integer> p1 = new OrderedPair<>("One", 1);
            Pair<String, String> p2 = new OrderedPair<>("Two", "2");

            System.out.println(p1.getKey() + ": " + p1.getValue());
            System.out.println(p2.getKey() + ": " + p2.getValue());
        }
    }


