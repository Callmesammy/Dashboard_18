
package Components;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu_item extends javax.swing.JPanel {

    /**
     * @param selected the selected to set
     */
   

    private boolean selected;
    
    public Menu_item(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_Menu.MenuType.MENU) {
            
            Isicon.setIcon(data.toIcon());
            Isdescription.setText(data.getName());
           
        }else if (data.getType()==Model_Menu.MenuType.TITLE) {
            Isicon.setText(data.getName());
            Isicon.setFont(new Font("sansserif", 1, 12));
            Isdescription.setVisible(false);
            
        }else if (data.getType()==Model_Menu.MenuType.EMPTY) {
            Isdescription.setText(" ");
            
        }
    }
 public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Isicon = new javax.swing.JLabel();
        Isdescription = new javax.swing.JLabel();

        Isdescription.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        Isdescription.setText("Enter Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Isicon)
                .addGap(10, 10, 10)
                .addComponent(Isdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Isicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Isdescription, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
       Graphics2D g2 = (Graphics2D)g;
       g2.setColor(new Color(248, 78, 240));
       g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
       g2.fillRect(getWidth()-5, -2, getWidth(), getHeight());
        }
      
        super.paintComponent(g); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Isdescription;
    private javax.swing.JLabel Isicon;
    // End of variables declaration//GEN-END:variables
}
