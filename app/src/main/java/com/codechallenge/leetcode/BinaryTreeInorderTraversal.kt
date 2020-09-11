package com.codechallenge.leetcode

import java.util.*

class BinaryTreeInorderTraversal {

    fun inorderTraversalRecursion(root: TreeNode?): List<Int> {
        val output = arrayListOf<Int>()
        if (root == null) return output
        addValue(root, output)
        return output
    }

    private fun addValue(root: TreeNode?, output: ArrayList<Int>) {
        if (root == null) return
        addValue(root.left, output)
        output.add(root.`val`)
        addValue(root.right, output)
    }

    fun inorderTraversalIteratively(root: TreeNode?): List<Int> {
        val output = arrayListOf<Int>()
        if(root == null) return output
        val stack = Stack<TreeNode>()
        var subRoot = root
        while (subRoot != null || stack.isNotEmpty()) {
            while (subRoot != null) {
                stack.push(subRoot)
                subRoot = subRoot.left
            }
            subRoot = stack.pop()
            output.add(subRoot.`val`)
            subRoot = subRoot.right
        }
        return output
    }
}