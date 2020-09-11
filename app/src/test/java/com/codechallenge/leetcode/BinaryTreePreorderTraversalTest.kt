package com.codechallenge.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

class BinaryTreePreorderTraversalTest {
    private val subject = BinaryTreePreorderTraversal()

    @Test
    fun `recursively when input 1,null,2,3 should return 1,2,3`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.right = treeNode2
        val treeNode3 = TreeNode(3)
        treeNode2.left = treeNode3
        assertEquals(arrayListOf(1,2,3), subject.preorderTraversalReqursion(input))
    }

    @Test
    fun `iteratively when input 1,null,2,3 should return 1,2,3`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.right = treeNode2
        val treeNode3 = TreeNode(3)
        treeNode2.left = treeNode3
        assertEquals(arrayListOf(1,2,3), subject.preorderTraversalIteratively(input))
    }
}