package com.codechallenge.leetcode

import java.util.*

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class BinaryTreePreorderTraversal {

    fun preorderTraversalReqursion(root: TreeNode?): List<Int> {
        val output = arrayListOf<Int>()
        if (root == null) return output
        addValue(root, output)
        return output
    }

    private fun addValue(root: TreeNode?, output: ArrayList<Int>) {
        if (root == null) return
        output.add(root.`val`)
        addValue(root.left, output)
        addValue(root.right, output)
    }

    fun preorderTraversalIteratively(root: TreeNode?): List<Int> {
        val output = arrayListOf<Int>()
        if(root == null) return output
        val stack = Stack<TreeNode>()
        stack.push(root)
        while (stack.isNotEmpty()) {
            val root = stack.pop()
            output.add(root.`val`)
            if (root.right != null) stack.push(root.right)
            if (root.left != null) stack.push(root.left)
        }
        return output
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}