package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by nitesh.u on 21/07/17.
 */
public class Leaf implements Component {

    private final String name;
    private int size;
    private Component parent;

    public Leaf(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }
    public Component getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }


    public List<Component> getComponent() {
        return null;
    }

    public void delete() {

        this.getParent().removeEntry(this);

    }
    public boolean isComponentExists(String name) {
        return this.getName().equals(name);

    }


}
