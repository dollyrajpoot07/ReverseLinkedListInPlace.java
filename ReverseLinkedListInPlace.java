// // Given the head of a singly linked list, reverse it in-place.
// import java.util.*;

// class ReverseLinkedListInPlace {
//     struct ListNode {
//         int val;
//         ListNode *next;
//         ListNode() : val(0), next(nullptr) {}
//         ListNode(int x) : val(x), next(nullptr) {}
//         ListNode(int x, ListNode *next) : val(x), next(next) {}
//         };
    
//     public ListNode reverseList(ListNode head) {
//         return reverseListInt(head , null);
//     }
    
//     private ListNode reverseListInt(ListNode head, ListNode newHead) {
//         if (head == null)
//             return newHead;
//         ListNode next = head.next;
//         head.next = newHead;
//         return reverseListInt(next, head);
//     }
// }