package com.codechallenge.leetcode

import junit.framework.Assert.assertEquals
import org.junit.Test

class BinaryTreePostorderTraversalTest {
    private val subject = BinaryTreePostorderTraversal()

    @Test
    fun `recursively when input 1,null,2,3 should return 3,2,1`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.right = treeNode2
        val treeNode3 = TreeNode(3)
        treeNode2.left = treeNode3
        assertEquals(arrayListOf(3, 2, 1), subject.postorderTraversalRecursion(input))
    }

    @Test
    fun `iteratively when input 1,null,2,3 should return 3,2,1`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.right = treeNode2
        val treeNode3 = TreeNode(3)
        treeNode2.left = treeNode3
        assertEquals(arrayListOf(3, 2, 1), subject.postorderTraversalIteratively(input))
    }

    @Test
    fun `recursively when input empty should return empty array`() {
        assertEquals(arrayListOf<Int>(), subject.postorderTraversalRecursion(null))
    }

    @Test
    fun `iteratively when input empty should return empty array`() {
        assertEquals(arrayListOf<Int>(), subject.postorderTraversalIteratively(null))
    }

    @Test
    fun `recursively when input 1 should return 1`() {
        val input = TreeNode(1)
        assertEquals(arrayListOf(1), subject.postorderTraversalRecursion(input))
    }

    @Test
    fun `iteratively when input 1 should return 1`() {
        val input = TreeNode(1)
        assertEquals(arrayListOf(1), subject.postorderTraversalIteratively(input))
    }

    @Test
    fun `recursively when input 1,2l should return 2,1`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.left = treeNode2
        assertEquals(arrayListOf(2, 1), subject.postorderTraversalRecursion(input))
    }

    @Test
    fun `iteratively when input 1,2l should return 2,1`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.left = treeNode2
        assertEquals(arrayListOf(2, 1), subject.postorderTraversalIteratively(input))
    }

    @Test
    fun `recursively when input 1,2r should return 2,1`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.right = treeNode2
        assertEquals(arrayListOf(2, 1), subject.postorderTraversalRecursion(input))
    }

    @Test
    fun `iteratively when input 1,2r should return 2,1`() {
        val input = TreeNode(1)
        val treeNode2 = TreeNode(2)
        input.right = treeNode2
        assertEquals(arrayListOf(2, 1), subject.postorderTraversalIteratively(input))
    }
}