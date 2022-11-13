import java.util.LinkedList;
import java.util.List;

public class GenealogicalTree<T extends Nameable> {
    private GenealogicalTreeNode<T> root;

    public GenealogicalTree(T human) {
        this.root = new GenealogicalTreeNode<>(human);
    }

    public void addchild(T adam, T eva, T child) {
        GenealogicalTreeNode<T> newNode = new GenealogicalTreeNode<>(child,adam,eva);
        GenealogicalTreeNode<T> currentNode = searchHuman(root, adam);
        T partner = eva;
        if(currentNode == null ){
            currentNode = searchHuman(root, eva);
            partner = adam;
        }
        if(currentNode != null ){
            if (currentNode.getPartner() == null) {
                currentNode.setPartner(partner);
            }
            List<GenealogicalTreeNode<T>> children = currentNode.getChildren();
            if (children == null) {
                children = new LinkedList<>();
                currentNode.setChildren(children);
            }
            children.add(newNode);
        }
    }

    private GenealogicalTreeNode<T> searchHuman(GenealogicalTreeNode<T> root, T human){
        GenealogicalTreeNode<T> result = null;
        List<GenealogicalTreeNode<T>> children = root.getChildren();
        if (root.getCurrentHuman().equals(human)){
            return root;
        }
        for (GenealogicalTreeNode<T> child: children) {
            if(child.getCurrentHuman().equals(human)){
                return child;
            }
            if(child.getChildren() != null){
                result = searchHuman(child,human);
            }
        }
        return result;
    }
    public void printChildren(T human){
         GenealogicalTreeNode<T> targetHuman = searchHuman(root, human);
        if(targetHuman.getChildren() != null){
            System.out.print("Children of " + human + ": ");
            System.out.println(targetHuman.getChildren());
        }
        else
            System.out.println(human + " is child free.");
    }
}
