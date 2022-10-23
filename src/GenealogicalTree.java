import java.util.LinkedList;
import java.util.List;

public class GenealogicalTree {
    private GenealogicalTreeNode root;

    public GenealogicalTree(Nameable human) {
        this.root = new GenealogicalTreeNode(human);
    }

    public void addchild(Nameable adam, Nameable eva, Nameable child) {
        GenealogicalTreeNode newNode = new GenealogicalTreeNode(child,adam,eva);
        GenealogicalTreeNode currentNode = searchHuman(root, adam);
        Nameable partner = eva;
        if(currentNode == null ){
            currentNode = searchHuman(root, eva);
            partner = adam;
        }
        if(currentNode != null ){
            if (currentNode.getPartner() == null) {
                currentNode.setPartner(partner);
            }
            List<GenealogicalTreeNode> children = currentNode.getChildren();
            if (children == null) {
                children = new LinkedList<>();
                currentNode.setChildren(children);
            }
            children.add(newNode);
        }
    }

    private GenealogicalTreeNode searchHuman(GenealogicalTreeNode root, Nameable human){
        GenealogicalTreeNode result = null;
        List<GenealogicalTreeNode> children = root.getChildren();
        if (root.getCurrentHuman().equals(human)){
            return root;
        }
        for (GenealogicalTreeNode child: children) {
            if(child.getCurrentHuman().equals(human)){
                return child;
            }
            if(child.getChildren() != null){
                result = searchHuman(child,human);
            }
        }
        return result;
    }
    public void printChildren(Nameable human){
        GenealogicalTreeNode targetHuman = searchHuman(root, human);
        if(targetHuman.getChildren() != null){
            System.out.print("Children of " + human + ": ");
            System.out.println(targetHuman.getChildren());
        }
        else
            System.out.println(human.getName() + " is child free.");
    }
}
