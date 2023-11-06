public class IntPriorityQueue {
    
    private SortedLinkedList refList;

    public IntPriorityQueue() {

        refList = new SortedLinkedList();
    }

    public boolean isEmpty() {

        return refList.isEmpty();
    }

    public void insert(int key) {

        refList.insert(key);
    }

    public Link remove() {

        return refList.remove();
    }

    public void displayQueue() {

        refList.displayList();
    }

    public int sumTasks() {

        return refList.sumData();
    }
}
