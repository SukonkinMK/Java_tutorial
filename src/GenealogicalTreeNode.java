import java.util.List;

public class GenealogicalTreeNode {
    private Human parent1;
    private Human parent2;
    private Human currentHuman;
    private Human partner;
    List<GenealogicalTreeNode> children;

    public GenealogicalTreeNode(Human human) {
        this.currentHuman = human;
    }
    public GenealogicalTreeNode(Human human, Human parent1, Human parent2) {
        this.currentHuman = human;
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public Human getCurrentHuman() {
        return currentHuman;
    }

    public Human getPartner() {
        return partner;
    }

    public void setPartner(Human human){
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
