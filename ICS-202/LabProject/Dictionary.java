import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import HW3.Stack;
import Lab03.DLL;

public class Dictionary {
    AVLTree<String> dictionary = new AVLTree<>();
    

    public Dictionary() {}

    public Dictionary(String s) {dictionary.insertAVL(s);}

    public Dictionary(File f) {
        try (Scanner infile = new Scanner(f)) {

            while (infile.hasNext()) dictionary.insertAVL(infile.next());}

        catch (FileNotFoundException e) {System.out.println(e);}}

    public void addWord(String s) {dictionary.insertAVL(s);}

    public boolean findWord(String s) {return dictionary.search(s);}

    public void deleteWord(String s) {dictionary.deleteAVL(s);}



public void findsimilar(String s){
    DLL<String> similarWordsList = new DLL<>();
    findSimilarHelper(dictionary.getRootNode(), s, similarWordsList);

    if(similarWordsList.isEmpty()){
        System.out.println("No similar words are found!");
    }

    else{
        System.out.println("Words similar to " + s + ":");
        similarWordsList.printAll();
    }

}
private void findSimilarHelper(BTNode<String> root, String target, DLL<String> similarWordsList){
    Stack<BTNode<String>> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
        BTNode<String> node = stack.pop();

        if (node != null) {
            if (areWordsSimilar(target, node.data)) {
                similarWordsList.addToTail(node.data);
            }
            stack.push(node.right);
            stack.push(node.left);
        }
    }
}



private boolean areWordsSimilar(String s, String word) {
    if (Math.abs(s.length() - word.length()) > 1) {
        return false;
    }

    int differenceCount = 0;
    if (s.length() == word.length()) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != word.charAt(i)) {
                differenceCount++;
                if (differenceCount > 1) {
                    return false;
                }
            }
        }
    } else {
        String longer = s.length() > word.length() ? s : word;
        String shorter = s.length() > word.length() ? word : s;
        for (int i = 0, j = 0; i < longer.length() && j < shorter.length(); i++, j++) {
            if (longer.charAt(i) != shorter.charAt(j)) {
                differenceCount++;
                if (differenceCount > 1) {
                    return false;
                }
                j--; 
            }
        }
        if (differenceCount == 0 && longer.length() - shorter.length() == 1) {
            differenceCount = 1;
        }
    }
    
    return differenceCount == 1;
}



public void saveDictionary(String name) {
    try (FileWriter writer = new FileWriter(name)) {
        if (dictionary.root == null) return; 
        
        BTNode<String> current = dictionary.root;
        Stack<BTNode<String>> stack = new Stack<>();
        
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            writer.write(current.data + "\n");
            current = current.right;
        }
    } catch (IOException e) {System.out.println(e);}
}  
}