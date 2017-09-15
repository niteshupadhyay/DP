package net.media.training.designpattern.composite;

import java.util.List;

/**
 * Created by nitesh.u on 21/07/17.
 */
public abstract class Component {


    public abstract void setParent(Component component);
    public abstract Composite getParent();
    public abstract String getName();
    public abstract int getSize();
    public abstract void delete() ;

    public abstract List<Component> getComponent();
   // public abstract void removeEntry(Component component);
    public abstract boolean isComponentExists(String name);

}
