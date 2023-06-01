package docrob.cag.framework.menu;

        /*
        a menu item is a label and either a screen or a function
         */

public abstract class MenuItem {
    protected int id;
    protected String label;
    protected boolean hidden;
    protected boolean hiddenDefault;

    public abstract void doIt();

    public MenuItem() {
    }

    public MenuItem(int id, String label, boolean hidden, boolean hiddenDefault) {
        this.id = id;
        this.label = label;
        this.hidden = hidden;
        this.hiddenDefault = hiddenDefault;
    }

    @Override
    public String toString() {
        return id + ": " + label;
    }

    public boolean getHiddenDefault() {
        return hiddenDefault;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isHiddenDefault() {
        return hiddenDefault;
    }

    public void setHiddenDefault(boolean hiddenDefault) {
        this.hiddenDefault = hiddenDefault;
    }
}