package AI;

import java.io.*;
import java.util.*;

/**
 * Get all words ending with current prefix.
 * Get word at current index.
 */
public class Dictionary {

    private Node rootNode;
    List<String> allWords;

    private String fileName = "dictionary.txt";


    public Dictionary() {
        allWords = new ArrayList<>();
        readWordList();
        initializeDictionary();
    }

    private void readWordList() {
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                allWords.add(line);
            }
        } catch (IOException ioe) {
            throw new RuntimeException("Unable to read dictionary.", ioe);
        }
    }

    private void initializeDictionary() {
        rootNode = new Node();
        allWords.stream().forEach(this::addWordToDictionary);

    }

    private void addWordToDictionary(final String word) {
        Node currNode = rootNode;
        Character currChar;
        for(int i=0; i < word.length(); i++) {
            currChar = word.charAt(i);
            if (currNode.children.get(currChar) == null) {
                currNode.children.put(currChar, new Node());
            }
            currNode = currNode.children.get(currChar);
        }
        currNode.word = word;

    }

    public List<String> getAllWordsWithPrefix(String prefix) {
        List<String> wordsWithPrefix = new ArrayList<>();
        Node currNode = rootNode;
        Character currChar;
        for (int i=0 ; i < prefix.length(); i++) {
            currChar = prefix.charAt(i);
            if (currNode.children.get(currChar) == null) {
                return wordsWithPrefix;
            } else {
                currNode = currNode.children.get(currChar);
            }
        }
        //backtrack all words
        getAllWords(currNode, wordsWithPrefix);
        return wordsWithPrefix;

    }

    public void getAllWords(final Node currNode, final List<String> words) {
        if (currNode.word != null) {
            words.add(currNode.word);
        }
        for (Character ch : currNode.children.keySet()) {
            getAllWords(currNode.children.get(ch), words);
        }
    }


    private class Node {
        private String word;
        private Map<Character, Node> children;
        public Node () {
            this.children = new HashMap<>();
        }

        @Override
        public String toString() {
            return "Word: " + word + "\n" +
                   "Children: " + children + "\n";
        }

    }
}
/*
Ways to generate moves:
For all letters on the board, they can be used as index in a word.
We have to consider the letters we have.

 */
