
package Components;


import Model.Model_Menu;


public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setOpaque(false);
        init();
       
    }
private void init(){
    listMenu1.setOpaque(false);
    listMenu1.itemAdded(new Model_Menu("33", "Dashboard", Model_Menu.MenuType.MENU));
    listMenu1.itemAdded(new Model_Menu("22", "My Tracks", Model_Menu.MenuType.MENU));
    listMenu1.itemAdded(new Model_Menu("11", "Favourite", Model_Menu.MenuType.MENU));
    listMenu1.itemAdded(new Model_Menu("44", "Message", Model_Menu.MenuType.MENU));
    listMenu1.itemAdded(new Model_Menu("55", "Setings", Model_Menu.MenuType.MENU));
 
    listMenu1.itemAdded(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    listMenu1.itemAdded(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    listMenu1.itemAdded(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    listMenu1.itemAdded(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    listMenu1.itemAdded(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    listMenu1.itemAdded(new Model_Menu("66", "Logout", Model_Menu.MenuType.MENU));
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new swing.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new Components.ListMenu<>();

        panelShadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelShadow1.setShadowSize(2);
        panelShadow1.setShadowType(swing.ShadowType.BOT_RIGHT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NaijaAir");

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(listMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private Components.ListMenu<String> listMenu1;
    private swing.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
