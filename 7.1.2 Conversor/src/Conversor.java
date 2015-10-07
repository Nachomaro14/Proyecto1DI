
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Conversor extends javax.swing.JFrame {

    public Conversor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtCantidad1 = new javax.swing.JTextField();
        comboMoneda1 = new javax.swing.JComboBox();
        sliderCantidad1 = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        txtCantidad2 = new javax.swing.JTextField();
        comboMoneda2 = new javax.swing.JComboBox();
        sliderCantidad2 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sliderCantidad1, org.jdesktop.beansbinding.ELProperty.create("${value}"), txtCantidad1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtCantidad1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCantidad1InputMethodTextChanged(evt);
            }
        });
        txtCantidad1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtCantidad1PropertyChange(evt);
                txtCantidad1PropertyChange1(evt);
            }
        });

        comboMoneda1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Euro", "Dollar", "Pound" }));
        comboMoneda1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMoneda1ItemStateChanged(evt);
            }
        });

        sliderCantidad1.setMaximum(1000);
        sliderCantidad1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCantidad1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sliderCantidad1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(txtCantidad1))
                .addGap(18, 18, 18)
                .addComponent(comboMoneda1, 0, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMoneda1)
                    .addComponent(txtCantidad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, sliderCantidad2, org.jdesktop.beansbinding.ELProperty.create("${value}"), txtCantidad2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtCantidad2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtCantidad2InputMethodTextChanged(evt);
            }
        });
        txtCantidad2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtCantidad2PropertyChange(evt);
            }
        });

        comboMoneda2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Euro", "Dollar", "Pound" }));
        comboMoneda2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMoneda2ItemStateChanged(evt);
            }
        });

        sliderCantidad2.setMaximum(1000);
        sliderCantidad2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderCantidad2StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sliderCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comboMoneda2, 0, 144, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboMoneda2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtCantidad2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderCantidad1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCantidad1StateChanged
        if(comboMoneda1.getSelectedItem().equals("Euro") && comboMoneda2.getSelectedItem().equals("Euro")){
            txtCantidad2.setText(txtCantidad1.getText());
        }else if(comboMoneda1.getSelectedItem().equals("Euro") && comboMoneda2.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 1.12298;
            int i = (int) d;
            txtCantidad2.setText(String.valueOf(i));
        }else if(comboMoneda1.getSelectedItem().equals("Euro") && comboMoneda2.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 0.738086396;
            int i = (int) d;
            txtCantidad2.setText(String.valueOf(i));
        }else if(comboMoneda1.getSelectedItem().equals("Dollar") && comboMoneda2.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 0.890487809;
            int i = (int) d;
            txtCantidad2.setText(String.valueOf(i));
        }else if(comboMoneda1.getSelectedItem().equals("Dollar") && comboMoneda2.getSelectedItem().equals("Dollar")){
            txtCantidad2.setText(txtCantidad1.getText());
        }else if(comboMoneda1.getSelectedItem().equals("Dollar") && comboMoneda2.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 0.657256938;
            int i = (int) d;
            txtCantidad2.setText(String.valueOf(i));
        }else if(comboMoneda1.getSelectedItem().equals("Pound") && comboMoneda2.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 1.35485494;
            int i = (int) d;
            txtCantidad2.setText(String.valueOf(i));
        }else if(comboMoneda1.getSelectedItem().equals("Pound") && comboMoneda2.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 1.521475;
            int i = (int) d;
            txtCantidad2.setText(String.valueOf(i));
        }else if(comboMoneda1.getSelectedItem().equals("Pound") && comboMoneda2.getSelectedItem().equals("Pound")){
            txtCantidad2.setText(txtCantidad1.getText());
        }
    }//GEN-LAST:event_sliderCantidad1StateChanged

    private void sliderCantidad2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderCantidad2StateChanged
        if(comboMoneda2.getSelectedItem().equals("Euro") && comboMoneda1.getSelectedItem().equals("Euro")){
            txtCantidad1.setText(txtCantidad2.getText());
        }else if(comboMoneda2.getSelectedItem().equals("Euro") && comboMoneda1.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 1.12298;
            int i = (int) d;
            txtCantidad1.setText(String.valueOf(i));
        }else if(comboMoneda2.getSelectedItem().equals("Euro") && comboMoneda1.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 0.738086396;
            int i = (int) d;
            txtCantidad1.setText(String.valueOf(i));
        }else if(comboMoneda2.getSelectedItem().equals("Dollar") && comboMoneda1.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 0.890487809;
            int i = (int) d;
            txtCantidad1.setText(String.valueOf(i));
        }else if(comboMoneda2.getSelectedItem().equals("Dollar") && comboMoneda1.getSelectedItem().equals("Dollar")){
            txtCantidad1.setText(txtCantidad2.getText());
        }else if(comboMoneda2.getSelectedItem().equals("Dollar") && comboMoneda1.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 0.657256938;
            int i = (int) d;
            txtCantidad1.setText(String.valueOf(i));
        }else if(comboMoneda2.getSelectedItem().equals("Pound") && comboMoneda1.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 1.35485494;
            int i = (int) d;
            txtCantidad1.setText(String.valueOf(i));
        }else if(comboMoneda2.getSelectedItem().equals("Pound") && comboMoneda1.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 1.521475;
            int i = (int) d;
            txtCantidad1.setText(String.valueOf(i));
        }else if(comboMoneda2.getSelectedItem().equals("Pound") && comboMoneda1.getSelectedItem().equals("Pound")){
            txtCantidad1.setText(txtCantidad2.getText());
        }
    }//GEN-LAST:event_sliderCantidad2StateChanged

    private void txtCantidad1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCantidad1PropertyChange
        
    }//GEN-LAST:event_txtCantidad1PropertyChange

    private void txtCantidad1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCantidad1InputMethodTextChanged
        
    }//GEN-LAST:event_txtCantidad1InputMethodTextChanged

    private void txtCantidad1PropertyChange1(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCantidad1PropertyChange1

    }//GEN-LAST:event_txtCantidad1PropertyChange1

    private void comboMoneda1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMoneda1ItemStateChanged
        if(comboMoneda1.getSelectedItem().equals("Euro") && comboMoneda2.getSelectedItem().equals("Euro")){
            txtCantidad2.setText(txtCantidad1.getText());
        }else if(comboMoneda1.getSelectedItem().equals("Euro") && comboMoneda2.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 1.12298;
            txtCantidad2.setText(String.valueOf(d));
        }else if(comboMoneda1.getSelectedItem().equals("Euro") && comboMoneda2.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 0.738086396;
            txtCantidad2.setText(String.valueOf(d));
        }else if(comboMoneda1.getSelectedItem().equals("Dollar") && comboMoneda2.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 0.890487809;
            txtCantidad2.setText(String.valueOf(d));
        }else if(comboMoneda1.getSelectedItem().equals("Dollar") && comboMoneda2.getSelectedItem().equals("Dollar")){
            txtCantidad2.setText(txtCantidad1.getText());
        }else if(comboMoneda1.getSelectedItem().equals("Dollar") && comboMoneda2.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 0.657256938;
            txtCantidad2.setText(String.valueOf(d));
        }else if(comboMoneda1.getSelectedItem().equals("Pound") && comboMoneda2.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 1.35485494;
            txtCantidad2.setText(String.valueOf(d));
        }else if(comboMoneda1.getSelectedItem().equals("Pound") && comboMoneda2.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad1.getText()) * 1.521475;
            txtCantidad2.setText(String.valueOf(d));
        }else if(comboMoneda1.getSelectedItem().equals("Pound") && comboMoneda2.getSelectedItem().equals("Pound")){
            txtCantidad2.setText(txtCantidad1.getText());
        }
    }//GEN-LAST:event_comboMoneda1ItemStateChanged

    private void comboMoneda2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMoneda2ItemStateChanged
        if(comboMoneda2.getSelectedItem().equals("Euro") && comboMoneda1.getSelectedItem().equals("Euro")){
            txtCantidad1.setText(txtCantidad2.getText());
        }else if(comboMoneda2.getSelectedItem().equals("Euro") && comboMoneda1.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 1.12298;
            txtCantidad1.setText(String.valueOf(d));
        }else if(comboMoneda2.getSelectedItem().equals("Euro") && comboMoneda1.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 0.738086396;
            txtCantidad1.setText(String.valueOf(d));
        }else if(comboMoneda2.getSelectedItem().equals("Dollar") && comboMoneda1.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 0.890487809;
            txtCantidad1.setText(String.valueOf(d));
        }else if(comboMoneda2.getSelectedItem().equals("Dollar") && comboMoneda1.getSelectedItem().equals("Dollar")){
            txtCantidad1.setText(txtCantidad2.getText());
        }else if(comboMoneda2.getSelectedItem().equals("Dollar") && comboMoneda1.getSelectedItem().equals("Pound")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 0.657256938;
            txtCantidad1.setText(String.valueOf(d));
        }else if(comboMoneda2.getSelectedItem().equals("Pound") && comboMoneda1.getSelectedItem().equals("Euro")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 1.35485494;
            txtCantidad1.setText(String.valueOf(d));
        }else if(comboMoneda2.getSelectedItem().equals("Pound") && comboMoneda1.getSelectedItem().equals("Dollar")){
            double d = Double.parseDouble(txtCantidad2.getText()) * 1.521475;
            txtCantidad1.setText(String.valueOf(d));
        }else if(comboMoneda2.getSelectedItem().equals("Pound") && comboMoneda1.getSelectedItem().equals("Pound")){
            txtCantidad1.setText(txtCantidad2.getText());
        }
    }//GEN-LAST:event_comboMoneda2ItemStateChanged

    private void txtCantidad2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCantidad2PropertyChange
        
    }//GEN-LAST:event_txtCantidad2PropertyChange

    private void txtCantidad2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtCantidad2InputMethodTextChanged
        
    }//GEN-LAST:event_txtCantidad2InputMethodTextChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox comboMoneda1;
    public javax.swing.JComboBox comboMoneda2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JSlider sliderCantidad1;
    public javax.swing.JSlider sliderCantidad2;
    public javax.swing.JTextField txtCantidad1;
    public javax.swing.JTextField txtCantidad2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}