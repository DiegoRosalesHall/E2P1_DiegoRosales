
package E2P1__DiegoRosales;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class Menu extends javax.swing.JFrame {
ArrayList<Numero> listaNumero;
    
    public Menu() {
        initComponents();
        listaNumero = new ArrayList<Numero>();
    }

    ArrayList<Integer> lbase = new ArrayList<>();
    ArrayList<Integer> ldecimal = new ArrayList<>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeros = new javax.swing.JButton();
        operaciones = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numeros.setText("Numeros");
        numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerosActionPerformed(evt);
            }
        });

        operaciones.setText("Operaciones");
        operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionesActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("EXAMEN II");

        jLabel2.setText("Diego Rosales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(numeros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(operaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(operaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerosActionPerformed
       int a =1;
       while(a==1){
        String opcion = JOptionPane.showInputDialog("Menu de Numeros\n1. Agregar Numeros\n2.Eliminar Numero\n3.MenuPrincipal");
        
        switch(opcion) {
            case "1":
              String decimal=JOptionPane.showInputDialog("Ingrese el numero (en base decimal)");
              String base=JOptionPane.showInputDialog("Ingrese la base a la que desea convertir");
              int newBase=Integer.parseInt(base);
              lbase.add(newBase);
              int newdecimal=Integer.parseInt(decimal);
              ldecimal.add(newdecimal);
              if(newBase>=2 && newBase<=35){
                  if(newdecimal>0){
                    Numero numero1= new Numero(newBase,newdecimal);
                    String conversion=numero1.decToBase();
                    listaNumero.add(numero1);
                    JOptionPane.showMessageDialog(null,"Resultado Conversion: "+conversion);
                  }
              
              }else{
                JOptionPane.showMessageDialog(null,"Debe de ingresar un numero de base mayor a 2 y menor a 35");
              }
              break;
            case "2":
                String lista="";
                for (int i=0;i<listaNumero.size();i++) {
                    lista+=(i+1)+"-"+listaNumero.get(i).conversion+" Base "+listaNumero.get(i).base+" : "+listaNumero.get(i).decimal+"\n";
                }
                String indice=JOptionPane.showInputDialog(lista+"Ingrese el indice del numero que desea eliminar\n");
                listaNumero.remove(Integer.parseInt(indice)-1);
                lbase.remove(Integer.parseInt(indice)-1);
                ldecimal.remove(Integer.parseInt(indice)-1);
                break; 
            case "3":
                a=2;
                
                break;
            default:
              // code block
          }
       }
    }//GEN-LAST:event_numerosActionPerformed

    private void operacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionesActionPerformed
       int b = 5;
       while(b==5){
        String opcion = JOptionPane.showInputDialog("Menu de Operaciones\n1. Sumar Numeros\n2.Restar Numero\n3.Multiplicar Numero\n4.MenuPrincipal\nIngrese el indice de la operacion.");
                     
        switch(opcion) {
            case "1":
                String lista="";
                for (int i=0;i<listaNumero.size();i++) {
                    lista+=(i+1)+"-"+listaNumero.get(i).conversion+" Base "+listaNumero.get(i).base+" : "+listaNumero.get(i).decimal+"\n";
                }
                String num1=JOptionPane.showInputDialog(lista+"Ingrese el indice del primer numero\n");
                String num2=JOptionPane.showInputDialog(lista+"Ingrese el indice del segundo numero\n");
               
                int indice1=Integer.parseInt(num1)+1;
                int indice2=Integer.parseInt(num2)+1;
                int base1 = lbase.get(Integer.parseInt(num1)-1);
                 
                int decimal1 = ldecimal.get(Integer.parseInt(num1)-1);
               int base2 =lbase.get(Integer.parseInt(num2)-1);
               int decimal2 =ldecimal.get(Integer.parseInt(num2)-1);
                int base_final=1;
               int decimalfinal=decimal1+decimal2;
                if(base1>base2){
                    base_final=base1;
                }
                else if(base2>base1){
                    base_final=base2;
                } 
                Numero numero2 = new Numero(base_final,decimalfinal);
                String conversion2 = numero2.decToBase();
                JOptionPane.showMessageDialog(null, "Resultado de la suma: "+conversion2);
                
                JOptionPane.showMessageDialog(null, "Decimal final: "+decimalfinal+" Base final: "+base_final);
                
                break;
                
            case "2":
               String listaa ="";
                for (int i=0;i<listaNumero.size();i++) {
                    listaa+=(i+1)+"-"+listaNumero.get(i).conversion+" Base "+listaNumero.get(i).base+" : "+listaNumero.get(i).decimal+"\n";
                }
                String numm1=JOptionPane.showInputDialog(listaa+"Ingrese el indice del primer numero\n");
                String numm2=JOptionPane.showInputDialog(listaa+"Ingrese el indice del segundo numero\n");
               
                int indicee1=Integer.parseInt(numm1)+1;
                int indicee2=Integer.parseInt(numm2)+1;
                int basee1 = lbase.get(Integer.parseInt(numm1)-1);
                 
                int decimall1 = ldecimal.get(Integer.parseInt(numm1)-1);
               int basee2 =lbase.get(Integer.parseInt(numm2)-1);
               int decimall2 =ldecimal.get(Integer.parseInt(numm2)-1);
               
                int base_final1=1;
               int decimalfinal1=decimall1-decimall2;
                if(basee1>basee2){
                    base_final1=basee1;
                }
                else if(basee2>basee1){
                    base_final1=basee2;
                } 
                Numero numero3 = new Numero(base_final1,decimalfinal1);
                String conversion3 = numero3.decToBase();
                JOptionPane.showMessageDialog(null, "Resultado de la resta: "+conversion3);
                
                JOptionPane.showMessageDialog(null, "Decimal final: "+decimalfinal1+" Base final: "+base_final1);
                
                break;
                
            case "3":
                String lista3 ="";
                for (int i=0;i<listaNumero.size();i++) {
                    lista3+=(i+1)+"-"+listaNumero.get(i).conversion+" Base "+listaNumero.get(i).base+" : "+listaNumero.get(i).decimal+"\n";
                }
                String num31=JOptionPane.showInputDialog(lista3+"Ingrese el indice del primer numero\n");
                String num32=JOptionPane.showInputDialog(lista3+"Ingrese el indice del segundo numero\n");
               
                int indice31=Integer.parseInt(num31)+1;
                int indice32=Integer.parseInt(num32)+1;
                int base31 = lbase.get(Integer.parseInt(num31)-1);
                 
                int decimal31 = ldecimal.get(Integer.parseInt(num31)-1);
               int base32 =lbase.get(Integer.parseInt(num32)-1);
               int decimal32 =ldecimal.get(Integer.parseInt(num32)-1);
               
                int base_final3=1;
               int decimalfinal3 =decimal31*decimal32;
                if(base31>base32){
                    base_final3=base31;
                }
                else if(base32>base31){
                    base_final3=base32;
                } 
                Numero numero4 = new Numero(base_final3,decimalfinal3);
                String conversion4 = numero4.decToBase();
                JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion: "+conversion4);
                
                JOptionPane.showMessageDialog(null, "Decimal final: "+decimalfinal3+" Base final: "+base_final3);
                break;
                
            case "4":
                b=4;
                break;
                
           
        }
        
       }
       
       
    }//GEN-LAST:event_operacionesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton numeros;
    private javax.swing.JButton operaciones;
    // End of variables declaration//GEN-END:variables
}
