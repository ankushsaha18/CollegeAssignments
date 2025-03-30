package Assignment3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.TreeMap;

class HuffmanCoding {
    char c;
    int freq;
    HuffmanCoding left, right;

    public HuffmanCoding(char c, int freq) {
        this.c = c;
        this.freq = freq;
        this.left = null;
        this.right = null;
    }
}

public class Q3 {
    public static HuffmanCoding buildHuffmanTree(Map<Character, Integer> freqMap) {
        PriorityQueue<HuffmanCoding> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new HuffmanCoding(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            HuffmanCoding left = pq.poll();
            HuffmanCoding right = pq.poll();

            HuffmanCoding newNode = new HuffmanCoding('\0', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;

            pq.add(newNode);
        }
        return pq.poll();
    }
    public static void generateHuffmanCodes(HuffmanCoding root, String code, Map<Character, String> huffmanCodes) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.c, code);
        }

        generateHuffmanCodes(root.left, code + "0", huffmanCodes);
        generateHuffmanCodes(root.right, code + "1", huffmanCodes);
    }

    public static int huffmanCoding(String s) {
        TreeMap<Character, Integer> freqMap = new TreeMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        HuffmanCoding root = buildHuffmanTree(freqMap);

        Map<Character, String> huffmanCodes = new HashMap<>();
        generateHuffmanCodes(root, "", huffmanCodes);

        int totalBits = 0;
        for (char c : s.toCharArray()) {
            totalBits += huffmanCodes.get(c).length();
        }

        return totalBits;
    }

    public static void main(String[] args) {
        String s = "BAABCBDBAEAEBACDE";

        int totalBits = huffmanCoding(s);
        System.out.println("Total number of bits required: " + totalBits);
    }
}
