package Assignment2.Assignment2_2.Q1;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair p1 = new Pair("Ankush",51);
        Pair p2 = new Pair(11,"David");
        Pair p3 = new Pair(10,185.33);
        Pair p4 = new Pair("Smith",false);
        System.out.println("Pair 1 --> " + p1.getKey() + " = " + p1.getValue());
        System.out.println("Pair 2 --> " + p2.getKey() + " = " + p2.getValue());
        System.out.println("Pair 3 --> " + p3.getKey() + " = " + p3.getValue());
        System.out.println("Pair 4 --> " + p4.getKey() + " = " + p4.getValue());
    }
}
