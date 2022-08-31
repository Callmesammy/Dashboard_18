
package Components;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu_Items extends javax.swing.JPanel {

    /**
     * @param selected the selected to set
     */
 
    private boolean selected;
    
    public Menu_Items(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_Menu.Menutype.MENU) {
            isicon.setIcon(data.toImage());
            isDescription.setText(data.getDescription());
            
        }else if (data.getType()==Model_Menu.Menutype.TITLE) {
            isicon.setIcon(data.toImage());
            isDescription.setText(data.getDescription());
            isDescription.setForeground(new Color(248, 78, 240));
            isDescription.setFont(new Font("sansserif", 1, 12));
            
        }else if (data.getType()==Model_Menu.Menutype.EMPTY) {
                isDescription.setText(" ");
            }
    }

       public void setSelected(boolean selected) {
        this.selected = selected;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isicon = new javax.swing.JLabel();
        isDescription = new javax.swing.JLabel();

        isDescription.setText("Enter Text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isicon)
                .addGap(18, 18, 18)
                .addComponent(isDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(isDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
            Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        super.paintComponent(g);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel isDescription;
    private javax.swing.JLabel isicon;
    // End of variables declaration//GEN-END:variables
}
