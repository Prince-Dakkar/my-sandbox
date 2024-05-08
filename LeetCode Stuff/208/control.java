/////////////////////////////////////////////////
//                                             //
//  Bri Bumgardner                             //
//  5/8/2024                                   //
//  Prompt: Leetcode "Implement Trie" #208     //
//                                             //
/////////////////////////////////////////////////

class control {

    public static void main(String[] args){

        String word = "test";
        String prefix = "te";
        trie obj = new trie();
        obj.insert(word);
        obj.insert("a");
        obj.insert("green");
        obj.insert("tea");
        boolean param_2 = obj.search(word);
        boolean param_3 = obj.startsWith(prefix);

        System.out.println("Contains " + word + ": " + param_2);
        System.out.println("Contains " + prefix + ": " + obj.search(prefix));
        System.out.println("Contains word starting with " + prefix + ": " + param_3);
        obj.print();

    }
}
 