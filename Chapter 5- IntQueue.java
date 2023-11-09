public class IntQueue {
    
    private LinkedList refList;

    public IntQueue() {

        refList = new LinkedList();
    }

    public boolean isEmpty() {

        return refList.isEmpty();
    }

    public void insert(int d) {

        refList.insertLast(d);
    }

    public Link remove() {

        return refList.deleteFirst();
    }

    public void displayQueue() {

        System.out.println("Queue front to rear: ");
        refList.displayList();
    }

    public int getElementData() {

        return refList.getFirst().getData();
    }

    public int sumTasks() {

        return refList.sumData();
    }

    public LinkedList getRefList() {

        return refList;
    }
}
