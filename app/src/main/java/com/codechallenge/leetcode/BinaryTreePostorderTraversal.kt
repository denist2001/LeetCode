package com.codechallenge.leetcode

import java.util.*

/**
 * Constraints:
    The number of the nodes in the tree is in the range [0, 100].
    -100 <= Node.val <= 100
 */
class BinaryTreePostorderTraversal {

    fun postorderTraversalRecursion(root: TreeNode?): List<Int> {
        val output = arrayListOf<Int>()
        if (root == null) return output
        addValue(root, output)
        return output
    }

    private fun addValue(root: TreeNode?, output: ArrayList<Int>) {
        if (root == null) return
        addValue(root.left, output)
        addValue(root.right, output)
        output.add(root.`val`)
    }

    fun postorderTraversalIteratively(root: TreeNode?): List<Int> {
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