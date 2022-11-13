import java.util.List;

public class GenealogicalTreeNode<T extends Nameable> {
    private T parent1;
    private T parent2;
    private T currentHuman;
    private T partner;
    List<GenealogicalTreeNode<T>> children;

    public GenealogicalTreeNode(T human) {
        this.currentHuman = human;
    }
    public GenealogicalTreeNode(T human, T parent1, T parent2) {
        this.currentHuman = human;
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public T getCurrentHuman() {
        return currentHuman;
    }

    public T getPartner() {
        return partner;
    }

    public void setPartner(T human){
        this.partner = human;
    }

    public List<GenealogicalTreeNode<T>> getChildren() {
        return children;
    }

    public void setChildren(List<GenealogicalTreeNode<T>> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return currentHuman.toString();
    }
}
