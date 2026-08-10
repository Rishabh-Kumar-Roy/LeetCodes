# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:

        node1=list1
        node2=list2
        list3=ListNode()
        curr=list3
        while(node1!=None and node2 != None):
            if node1.val>node2.val:
                curr.next=ListNode(node2.val)
                curr=curr.next
                node2=node2.next
            else:
                curr.next=ListNode(node1.val)
                curr=curr.next
                node1=node1.next
        while node1!=None:
            curr.next=ListNode(node1.val)
            curr=curr.next
            node1=node1.next
        while node2!=None:
            curr.next=ListNode(node2.val)
            curr=curr.next
            node2=node2.next
        return list3.next

        