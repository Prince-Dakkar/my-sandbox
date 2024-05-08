/////////////////////////////////////////////////
//                                             //
//  Bri Bumgardner                             //
//  5/8/2024                                   //
//  Prompt: Leetcode "Implement Trie" #208     //
//                                             //
/////////////////////////////////////////////////

public class trie {

    /**
     * Inner class for node structure
     */
    class tNode {
        public String value;
        public tNode[] children;
        public boolean isWord = false;

        protected tNode(){
            this(null, false);
        }
        protected tNode(String val){
            this(val, false);
        }
        protected tNode(String val, boolean isWord){
            this.value = val;
            this.children = new tNode[26];  /* Given that all chars are lowercase english letters */
            for (int i = 0; i < 26; i++) {
                this.children[i] = null;
            }
            this.isWord = isWord;
        }
    }

    /**
     * The beginning of the underlying data structure
     */
    public tNode head;

    /**
     * Constructor
     */
    public trie() {
        this.head = new tNode();
    }
    
    /**
     * Add a new word into the trie
     * @param word The word to add to the trie.
     */
    public void insert(String word) {
        tNode cur = this.head;
        for (int i = 0; i < word.length(); i++){
            if (cur.children[word.charAt(i) - 97] != null) {
                /* Already exists, keep going */
                if (i == word.length()-1) {
                    /* Categorize this as a word */
                    cur.children[word.charAt(i) - 97].isWord = true;
                }
            } else {
                /* Create this node, then keep reading */
                if (i == word.length()-1) {
                    cur.children[word.charAt(i) - 97] = new tNode(word.charAt(i) + "", true);
                } else {
                    cur.children[word.charAt(i) - 97] = new tNode(word.charAt(i) + "", false);
                }
            }
            /* Increment Current */
            cur = cur.children[word.charAt(i) - 97];
        }   
    }
    

    /**
     * Search for a word in the trie. 
     * @param word Word to find
     * @return Returns true if the word is in the trie, and false otherwise
     */
    public boolean search(String word) {
        tNode cur = this.head;
        for (int i = 0; i < word.length(); i++){
            if (cur.children[word.charAt(i) - 97] != null) {
                /* Exists, keep going */
                if (i == word.length()-1) {
                    /* If we've hit the end of the word, is it listed as a word? */
                    return cur.children[word.charAt(i) - 97].isWord;
                }
            } else {
                return false;
            }
            /* Increment Current */
            cur = cur.children[word.charAt(i) - 97];
        } 
        return false;
    }
    
    /**
     * Searches for the prefix to see if it exists in the tree.
     * @param prefix The prefix to find
     * @return Returns true if the prefix is in the trie, and false otherwise
     */
    public boolean startsWith(String prefix) {
        tNode cur = this.head;
        for (int i = 0; i < prefix.length(); i++){
            if (cur.children[prefix.charAt(i) - 97] == null) {
                return false;
            } 
            cur = cur.children[prefix.charAt(i) - 97];
        } 
        return true;
    }

    /**
     * Debugging Print function
     */
    public void print(){
        printHelp(this.head);
    }

    /**
     * Print helper function
     */
    private void printHelp(tNode x){
    
        for(int i = 0; i< 26; i++) {
            if (x.children[i] != null) {
                System.out.print(" " + x.children[i].value);
            }
        }
        System.out.println();
        for(int i = 0; i< 26; i++) {
            if (x.children[i] != null) {
                printHelp(x.children[i]);
            }
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */