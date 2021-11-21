package Lesson5;

public class TollBox {
    public static void main(String[] args) {
        Box box = new Box("box1", 10);
        Tools tools = new Tools("hummer");
        box.startThis(tools);
    }
}

class Box {
    String name;
    int weight;

    public Box(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void startThis(Tools tools) {
        tools.infoToolsAndBox(this);
    }
}

class Tools {
    String tools;

    public Tools(String tools) {
        this.tools = tools;
    }

    void infoToolsAndBox(Box box) {
        System.out.println(box.name + " " + box.weight + " " + tools);
    }
}
