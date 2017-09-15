package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by nitesh.u on 21/07/17.
 */
public class Composite extends Component{

    private final String name;
    private final List<Component> children;
    private Component parent;
    public void setParent(Component component) {
        this.parent = component;
    }
    public Composite getParent(){return parent;};
    public List<Component> getComponent() {
        return children;
    }
    public String getName() {
        return name;
    }


    public Composite(String name, List<Component> children) {
        this.name = name;
        this.children = children;

        for (Component component : children) {
            component.setParent(this);
        }
    }
    public int getSize() {
        int sum = 0;

        for (Component child : children) {
            sum += child.getSize();
        }

        return sum;
    }

    public void delete() {

        while ( this.getComponent().size()>0) {
            this.getComponent().get(0).delete();
            this.getParent().removeEntry(this.getComponent().get(0));
            removeEntry(this.getComponent().get(0));
        }
        this.getParent().removeEntry(this);
    }

    public void removeEntry(Component component) {
        this.getComponent().remove(component);
    }


    public boolean isComponentExists(String name){
        if(this.getName().equals(name))
            return true;
        else {
            for (Component child : this.getComponent()) {
                if (child.isComponentExists(name))
                    return true;
            }
        }
        return false;
        }

    }



