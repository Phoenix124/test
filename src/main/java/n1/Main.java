package n1;

import static java.lang.System.out;

public class Main {
    /**
     * Description: Application contains custom linked list implementation
     * and loops through the list to print each element
     * Task: Implement 'reverseIteration' method for this linked list that modify the list in following way:
     * original: 1->2->3
     * expected: 3->2->1
     * <p>
     * Do not change 'Node' class
     */
    public static void main(String[] args) {

        Node<Integer> linkedListHead = new Node<>(1);
        linkedListHead
                .setNextNode(new Node<>(2))
                .setNextNode(new Node<>(3))
                .setNextNode(new Node<>(4));

        print(linkedListHead);
        out.println();
        print(reverseRecursion(linkedListHead));
    }

    private static void print(Node<Integer> head) {

        Node<Integer> currrentNode = head;
        while (currrentNode != null) {

            out.print(currrentNode.value);

            currrentNode = currrentNode.getNextNode();
            if (currrentNode != null) out.print("->");
        }
    }

    /**
     * Reverse with Iteration
     */
    private static Node<Integer> reverseIteration(Node<Integer> head) {
        Node<Integer> previousNode = null;
        Node<Integer> currentNode = head;
        while (currentNode != null) {
            Node<Integer> current = currentNode;
            currentNode = currentNode.getNextNode();
            current.setNextNode(previousNode);
            previousNode = current;
        }
        return previousNode;
    }

    /**
     * Reverse with recursion
     */
    private static Node<Integer> reverseRecursion(Node<Integer> head) {
        if(head == null || head.getNextNode() == null)
            return head;

        Node second = head.getNextNode();
        head.setNextNode(null);

        Node node = reverseRecursion(second);
        second.setNextNode(head);

        return node;
    }

}
