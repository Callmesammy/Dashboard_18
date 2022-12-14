
package Components;

import Model.Model_Menu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 */
public class ListMenu <E extends Object> extends JList<E>{

    private int selectedIndex = -1;
    private final DefaultListModel model;
    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object value = model.getElementAt(index);
                    if (value instanceof Model_Menu) {
                        Model_Menu menu = (Model_Menu)value;
                        if (menu.getType()==Model_Menu.MenuType.MENU) {
                            selectedIndex = index;
                        }else{
                           
                        }
                    }
                    
                }
            }
        });
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Model_Menu data;
                if (value instanceof Model_Menu) {
                    data = (Model_Menu)value;
                }else{
                    data = new Model_Menu("", value+ "",Model_Menu.MenuType.EMPTY);
                }
                Menu_item item = new Menu_item(data);
                    item.setSelected(selectedIndex==index);
                    return item;
                
            }
            
        };
    }
    
    public void itemAdded(Model_Menu data){
        model.addElement(data);
    }
}
