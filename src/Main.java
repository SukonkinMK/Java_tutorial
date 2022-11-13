public class Main {
    public static void main(String[] args) {
        Human ivan = new Human("Ivan", "Ivanov");
        GenealogicalTree<Human> tree = new GenealogicalTree<>(ivan);
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
        System.out.println();

        Dog sharik = new Dog("Sharik");
        Dog tuzik = new Dog("Tuzik");
        Dog elly = new Dog("Elly");
        GenealogicalTree<Dog> dogGenealogicalTree = new GenealogicalTree<>(sharik);
        dogGenealogicalTree.addchild(sharik,elly,tuzik);
        dogGenealogicalTree.printChildren(sharik);
        dogGenealogicalTree.printChildren(tuzik);
    }
}