import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Test extends javax.swing.JFrame {

    public Test() {
        initComponents();
        jPanel1.setLayout(new BorderLayout());
        lbl.setHorizontalAlignment(SwingUtilities.CENTER);
        lbl.setVerticalAlignment(SwingUtilities.CENTER);
        jPanel1.add(lbl, BorderLayout.CENTER);
        jSlider_FontSize.setValue(lbl.getFont().getSize());
    }

    JLabel lbl = new JLabel("Message");
                              
    private void initComponents() {
    	
        jSlider_FontSize = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();

        jSlider_FontSize.setMinimum(14);
        jSlider_FontSize.setMaximum(50);
        jSlider_FontSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_FontSizeStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                
                  .addComponent(jSlider_FontSize, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(jSlider_FontSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
        
    }                      

    private void jSlider_FontSizeStateChanged(javax.swing.event.ChangeEvent evt) {                                              
        lbl.setFont(new Font(lbl.getFont().getName(), lbl.getFont().getStyle(), jSlider_FontSize.getValue()));
    }
        
    public static void main(String args[]) {
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }                  
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider_FontSize;
}