import java.util.List;

public class GenealogicalTreeNode {
    private Nameable parent1;
    private Nameable parent2;
    private Nameable currentHuman;
    private Nameable partner;
    List<GenealogicalTreeNode> children;

    public GenealogicalTreeNode(Nameable human) {
        this.currentHuman = human;
    }
    public GenealogicalTreeNode(Nameable human, Nameable parent1, Nameable parent2) {
        this.currentHuman = human;
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public Nameable getCurrentHuman() {
        return currentHuman;
    }

    public Nameable getPartner() {
        return partner;
    }

    public void setPartner(Nameable human){
        this.partner = human;
    }

    public List<GenealogicalTreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<GenealogicalTreeNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return currentHuman.toString();
    }
}
