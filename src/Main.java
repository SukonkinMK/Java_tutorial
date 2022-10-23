public class Main {
    public static void main(String[] args) {
        Human ivan = new Human("Ivan", "Ivanov");
        GenealogicalTree tree = new GenealogicalTree(ivan);
        Human natasha = new Human("Natasha", "Petrova");
        Human dima = new Human("Dima", "Ivanov");
        Human katya = new Human("Katya", "Ivanova");
        tree.addchild(ivan, natasha,dima);
        tree.addchild(ivan, natasha,katya);
        Human kolya = new Human("Nikolay", "Romanov");
        Human vasya = new Human("Vasya", "Romanov");
        tree.addchild(katya, kolya, vasya);
        tree.printChildren(ivan);
        tree.printChildren(katya);
        tree.printChildren(dima);
    }
}