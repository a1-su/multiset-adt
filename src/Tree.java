/***
 * A recursive tree data structure, which provides services required of the
 *        MultiSet ADT. See TreeMultiSet, which is the next class defined.
 *
 *        This is a simplified version of the Tree data structure
 *        adapted from CSC148.
 */

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private int root;
    private List subtrees;

    public static void main(String[] args) {
        Tree tree = new Tree();
    }

    public void main(int root, List subtrees){
        /** Initialize a new Tree with the given root value and subtrees.
        * If <root> is None, the tree is empty.
         * Precondition: if <root> is None, then <subtrees> is empty. */
        this.root = root;
        if (subtrees == null) {
            this.subtrees = ArrayList();
        }
        else {
            this.subtrees = subtrees;
        }
    }

    public static bool is_empty()
}
