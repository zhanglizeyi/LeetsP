/*
	Question: 
		Write a function to delete a node (except the tail) in 
		a singly linked list, given only access to that node.

		Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given 
		the third node with value 3, the linked list should 
		become 1 -> 2 -> 4 after calling your function.


	解题思路：

		每次叫这个function需要删除一个pass in的 input, 所以
		1. 可以建立一个same type （ListNode）去把下一个值pass给现有的位置
			从而可以删除掉它的链接。

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {

public:
	void deleteNode(ListNode* node) {
		//swap the next node
		//change node's current value to node next value
		//and current node's value and node would be 
		//erase by pass in next node's value 
		//*(node) = *(node->next);

		/*
			pass node next value to current value
			assign next  from next next node, to get rid of curr
		*/

		node->val = node->next->val;
		node->next = node->next->next;

		/*
			ListNode * del = node->next;
			*node = *del;
			delete del;
		*/		
	}
}；