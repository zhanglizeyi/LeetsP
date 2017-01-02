/**

	Example
		Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
		Return: 1 --> 2 --> 3 --> 4 --> 5


 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };


	解题思路：
		利用recursion去处理这道题是最好的方法，简便快捷， 但是题目中也有hint
		说使用binary tree...我们首先要知道的两件事情，第一个就是要如何处理
		如果head是空集如何处理，然后如果中间有一个或者多个想要删除的element
		我们要如何handle。
 */
class Solution {


public:

	ListNode* removeElements(ListNode* head, int val) {

		//1. check head is empty
		if(head == NULL) return head;

		//2. check any node's value same as val, head = head->next...
		if(head->val == val) return (head->next, val);

		//3. if not yet find any values are the same
		//head->next = recursion of head->next since head is not  
		head->next = removeElements(head->next, val);

		return head;
	}

};