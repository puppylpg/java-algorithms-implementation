package com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import com.jwetherell.algorithms.data_structures.BTreePrinter;
import org.junit.Test;

import com.jwetherell.algorithms.data_structures.AVLTree;
import com.jwetherell.algorithms.data_structures.BinarySearchTree;
import com.jwetherell.algorithms.data_structures.test.common.JavaCollectionTest;
import com.jwetherell.algorithms.data_structures.test.common.TreeTest;
import com.jwetherell.algorithms.data_structures.test.common.Utils;
import com.jwetherell.algorithms.data_structures.test.common.Utils.TestData;

public class AVLTreeTest {

    @Test
    public void testAVLTree() {
        TestData data = Utils.generateTestData(1000);

        String bstName = "AVL Tree";
        BinarySearchTree<Integer> bst = new AVLTree<Integer>();
        Collection<Integer> bstCollection = bst.toCollection();

        assertTrue(TreeTest.testTree(bst, Integer.class, bstName, 
                                     data.unsorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(bstCollection, Integer.class, bstName, 
                                                 data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testAVLTreeAdd() {
        AVLTree<Integer> avlTree = new AVLTree<>();

        int [] num = {46, 15, 20, 35, 28, 58, 18, 50, 54};
        for (int n : num) {
            avlTree.add(n);
        }

        System.out.println(avlTree);
        BTreePrinter.printNode(avlTree.root());
    }
}
