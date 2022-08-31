
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Model_Menu {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the Type
     */
    public Menutype getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(Menutype Type) {
        this.Type = Type;
    }
    private String icon;
    private String name;
    private String description;
    private Menutype Type;

    public Model_Menu(String icon, String name, String description, Menutype Type) {
        this.icon = icon;
        this.name = name;
        this.description = description;
        this.Type = Type;
    }

    public Model_Menu() {
    }
    
    public Icon toImage(){
        return new ImageIcon(getClass().getResource("/cool/icon" +icon+ ".png"));
    }
    public static enum Menutype{
        MENU, TITLE, EMPTY
    }
}
