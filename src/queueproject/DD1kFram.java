package queueproject;

import com.orsonpdf.util.Args;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class DD1kFram extends javax.swing.JFrame {

    public DD1kFram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Lambda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_k = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_time = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Mu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_M = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numberOfCustmers = new javax.swing.JTextField();
        getNumberOfCustomersAtT = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        MM1_Btn = new javax.swing.JButton();
        MM1k_Btn = new javax.swing.JButton();
        MMCK_Btn = new javax.swing.JButton();
        MMC_Btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lamba : ");

        txt_Lambda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LambdaActionPerformed(evt);
            }
        });

        jLabel2.setText("Mu :");

        txt_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kActionPerformed(evt);
            }
        });

        jLabel3.setText("Time : ");

        txt_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timeActionPerformed(evt);
            }
        });

        jLabel6.setText("k :");

        txt_Mu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MuActionPerformed(evt);
            }
        });

        jLabel7.setText("M :");

        txt_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Lambda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_k)
                            .addComponent(txt_time)
                            .addComponent(txt_Mu, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txt_M))))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Lambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Mu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_k, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_M, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel4.setText("number of custmers : ");

        numberOfCustmers.setEditable(false);
        numberOfCustmers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfCustmersActionPerformed(evt);
            }
        });

        getNumberOfCustomersAtT.setText("get number of customer");
        getNumberOfCustomersAtT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNumberOfCustomersAtTActionPerformed(evt);
            }
        });

        showBtn.setText("show graph");
        showBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showBtnMouseClicked(evt);
            }
        });
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Queueing thormy");

        MM1_Btn.setText("MM1");
        MM1_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MM1_BtnActionPerformed(evt);
            }
        });

        MM1k_Btn.setText("MM1K");
        MM1k_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MM1k_BtnActionPerformed(evt);
            }
        });

        MMCK_Btn.setText("MMCK");
        MMCK_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMCK_BtnActionPerformed(evt);
            }
        });

        MMC_Btn.setText("MMC");
        MMC_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMC_BtnActionPerformed(evt);
            }
        });

        jLabel8.setText("D / D / 1 / K-1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(getNumberOfCustomersAtT))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showBtn)
                                    .addComponent(numberOfCustmers, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MMCK_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MM1_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MM1k_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MMC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getNumberOfCustomersAtT)
                            .addComponent(showBtn))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(numberOfCustmers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MM1_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MM1k_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MMC_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MMCK_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_LambdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LambdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LambdaActionPerformed

    private void txt_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kActionPerformed

    private void txt_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timeActionPerformed

    private void getNumberOfCustomersAtTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNumberOfCustomersAtTActionPerformed
        double Lambda, Mu;
        int k ,M,time;
         Lambda = validateUserInput.validateNumber(txt_Lambda.getText());
         Mu = validateUserInput.validateNumber(txt_Mu.getText());
         time = (int) validateUserInput.validateNumber(txt_time.getText());
         k = (int) validateUserInput.validateNumber(txt_k.getText());
         M = (int) validateUserInput.validateNumber(txt_M.getText());
        if(Lambda == -1 || Mu == -1 || time ==-1 || M == -1 || k == -1)
        {
            errorMsg msg = new errorMsg();
            msg.setVisible(true);
            return;
        }
        
//        queueDD1k dD1k = new queueDD1k(Lambda, Mu); 
//        int numberOfCustomer = dD1k.getNUmberOgCustomersAtTimeT(time);
//        numberOfCustmers.setText(((numberOfCustomer >= 0)?numberOfCustomer:0)+"");
        queueDD dD = new queueDD(Lambda, Mu, 0, M, 50);
        int numberOfCustomer = (int)dD.getNt(time);
        numberOfCustmers.setText(((numberOfCustomer >= 0)?numberOfCustomer:0)+"");
    }//GEN-LAST:event_getNumberOfCustomersAtTActionPerformed

    private void numberOfCustmersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfCustmersActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_numberOfCustmersActionPerformed


    private void showBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showBtnMouseClicked
private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String series1 = "test";

        dataset.addValue(1, series1, "1");
        dataset.addValue(1, series1, "1.9");
        dataset.addValue(2, series1, "2");
        dataset.addValue(2, series1, "2.9");

     return dataset;
}
private XYDataset createDataset2(int k, int M,double serviceTime,double arrivalTime) {
      final XYSeries system = new XYSeries( "system flow" );           
      int NumberOfCus = M;
    for(int i=0;i<50;i++){
            //detremin lambda > me or not
            if(arrivalTime >= serviceTime)
            {
                if (i % serviceTime == 0 && NumberOfCus >= 1 && i!=0) {
                    --NumberOfCus;
//                        System.out.print(" number -- ");
                }  
                if (i % arrivalTime == 0 && i != 0) {
    //                System.out.print(" number ++ ");
                    ++NumberOfCus;
                }
            }else{
                if (i % serviceTime == arrivalTime && i >= serviceTime) {
                    --NumberOfCus;
//                        System.out.print(" number2 -- ");
                } 
                if (i % arrivalTime == 0 && i != 0 && k > NumberOfCus) {
//                System.out.print(" number ++ ");
                ++NumberOfCus;
                }
            }
             system.add(i, NumberOfCus);
//          System.out.println(i +" : " + NumberOfCus);
    }      
      /**
      for(int i=0 ;i<system.getItemCount();i++){
          System.out.println(system.getDataItem(i).getX() + "  "+ system.getDataItem(i).getY());
      }*/
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries(system ); 
      return dataset;
}

public static void createXYStepChart(String title, String xAxisLabel,
            String yAxisLabel, XYDataset dataset, PlotOrientation orientation,
            boolean legend, boolean tooltips, boolean urls) {

        Args.nullNotPermitted(orientation, "orientation");
        NumberAxis xAxis = new NumberAxis(xAxisLabel);
        NumberAxis yAxis = new NumberAxis(yAxisLabel);
        
        yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        XYToolTipGenerator toolTipGenerator = null;
        if (tooltips) {
            toolTipGenerator = new StandardXYToolTipGenerator();
        }

        XYURLGenerator urlGenerator = null;
        if (urls) {
            urlGenerator = new StandardXYURLGenerator();
        }
        XYItemRenderer renderer = new XYStepRenderer(toolTipGenerator,
                urlGenerator);

        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, null);
        plot.setRenderer(renderer);
        plot.setOrientation(orientation);
        plot.setDomainCrosshairVisible(false);
        plot.setRangeCrosshairVisible(false);
        JFreeChart chart = new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT,
                plot, legend);
//        currentTheme.apply(chart);
        BarRenderer renderer2 =null;
        
        
        renderer2 = new BarRenderer();
        ChartFrame frame = new ChartFrame("queue system flow", chart);
        frame.setVisible(true);
        frame.setSize(1000,750);
    }


    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        // TODO add your handling code here:

//        CategoryDataset dataset = createDataset();
//        JFreeChart freeChart = ChartFactory.createLineChart("title", "y lable", "x label ", dataset);
        
//        JFreeChart freeChart2 = ChartFactory.createXYStepChart("number of customers over time", "time", "n(t)",createDataset2() );
//        BarRenderer renderer =null;
//        CategoryPlot plot = null;
//       
//        
//        renderer = new BarRenderer();
//        ChartFrame frame = new ChartFrame("queue system flow", freeChart2);
//        frame.setVisible(true);
//        frame.setSize(1000,750); 
        double Lambda, Mu,time;
        int M,k;
         Lambda = validateUserInput.validateNumber(txt_Lambda.getText());
         Mu = validateUserInput.validateNumber(txt_Mu.getText());
         time = validateUserInput.validateNumber(txt_time.getText());
        k = (int) validateUserInput.validateNumber(txt_k.getText());
         M = (int) validateUserInput.validateNumber(txt_M.getText());
        --k;
        if(Lambda == -1 || Mu == -1 || time ==-1|| M == -1 || k == -1)
        {
            errorMsg msg = new errorMsg();
            msg.setVisible(true);
            return;
        }
        
        double serviceTime = Math.round( 1 / Mu);
        double arrivalTime =  Math.round( 1 / Lambda);
//    System.out.println("serviceTime : "+serviceTime);
//    System.out.println("serviceTime : "+serviceTime);
//    System.out.println("k : "+k);
//      System.out.println("M : "+M);
        createXYStepChart("number of customers over time", "time", "n(t)",createDataset2(k, M, serviceTime, arrivalTime),
        PlotOrientation.VERTICAL,true,true,false );

    }//GEN-LAST:event_showBtnActionPerformed

    private void txt_MuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MuActionPerformed

    private void txt_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MActionPerformed

    private void MM1_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MM1_BtnActionPerformed
        // TODO add your handling code here:
        MM1Fram mM1Fram = new MM1Fram(this);
        mM1Fram.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_MM1_BtnActionPerformed

    private void MM1k_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MM1k_BtnActionPerformed
        // TODO add your handling code here:
        MM1KFram mM1KFram = new MM1KFram(this);
        mM1KFram.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MM1k_BtnActionPerformed

    private void MMC_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMC_BtnActionPerformed
        // TODO add your handling code here:
        MMCFram mMCFram = new MMCFram(this);
        mMCFram.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_MMC_BtnActionPerformed

    private void MMCK_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMCK_BtnActionPerformed
        // TODO add your handling code here:
        MMCKFram mMCKFram =new MMCKFram(this);
        mMCKFram.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MMCK_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(DD1kFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DD1kFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DD1kFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DD1kFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DD1kFram().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MM1_Btn;
    private javax.swing.JButton MM1k_Btn;
    private javax.swing.JButton MMCK_Btn;
    private javax.swing.JButton MMC_Btn;
    private javax.swing.JButton getNumberOfCustomersAtT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numberOfCustmers;
    private javax.swing.JButton showBtn;
    private javax.swing.JTextField txt_Lambda;
    private javax.swing.JTextField txt_M;
    private javax.swing.JTextField txt_Mu;
    private javax.swing.JTextField txt_k;
    private javax.swing.JTextField txt_time;
    // End of variables declaration//GEN-END:variables
}
