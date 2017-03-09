/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable.gui;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import timetable.model.TaskPriority;
import timetable.model.Task;
import timetable.callback.TaskActionListener.AddTaskActionListener;
import timetable.helper.JOptionPaneHelper;
import timetable.manager.DatabaseManager;
import timetable.model.Subject;

/**
 *
 * @author Pri
 */
public class AddTask extends javax.swing.JDialog {

    private AddTaskActionListener taskActionListener;
    private final DefaultComboBoxModel<Subject> taskSubjectModel;

    /**
     * Creates new form AddTask
     *
     * @param parent the Parent window
     * @param modal prohibit focusing on the parent window if value is true
     */
    public AddTask(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.taskSubjectModel = new DefaultComboBoxModel<>();
        this.taskSubject.setModel(this.taskSubjectModel);
        List<Subject> allSubjects = DatabaseManager.getInstance().getAllSubjects();
        int subjectsSize = allSubjects.size();
        for (int i = 0; i < subjectsSize; i++) {
            this.taskSubjectModel.addElement(allSubjects.get(i));
        }
        if (subjectsSize <= 0) {
            this.warningLabel.setText("You need to add subjects first!!!");
        }
    }

    /**
     * This method is used to get the reference of the parent view
     *
     * @param taskActionListener (The view reference)
     */
    public void setTaskActionListener(AddTaskActionListener taskActionListener) {
        this.taskActionListener = taskActionListener;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        taskName = new javax.swing.JTextField();
        taskDate = new datechooser.beans.DateChooserCombo();
        taskPriority = new javax.swing.JComboBox<>();
        taskSubject = new javax.swing.JComboBox<>();
        saveTaskButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Task name:");

        jLabel2.setText("Submission date:");

        jLabel3.setText("Priority:");

        jLabel4.setText("Subject:");

        taskPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));

        saveTaskButton.setText("Save Task");
        saveTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTaskButtonActionPerformed(evt);
            }
        });

        warningLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(warningLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveTaskButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taskPriority, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taskSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taskDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(taskDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(taskPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(taskSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(saveTaskButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(warningLabel)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTaskButtonActionPerformed
        String taskNameValue = this.taskName.getText();
        if (taskNameValue.isEmpty()) {
            JOptionPaneHelper.showWarningMessage(this, "Please specify a task name", "Error Occured");
            return;
        }
        Object taskSubjectObject = this.taskSubject.getSelectedItem();
        if (taskSubjectObject == null) {
            JOptionPaneHelper.showWarningMessage(this, "Please add subjects first!!", "Error Occured");
            return;
        }
        String taskSubjectValue = this.taskSubject.getSelectedItem().toString();

        if (taskSubjectValue.isEmpty()) {
            JOptionPaneHelper.showWarningMessage(this, "Please add subjects first!!", "Error Occured");
            return;
        }

        if (this.taskActionListener != null) {
            Task task = new Task();
            task.setTaskName(taskNameValue);
            task.setTaskDate(taskDate.getText());
            task.setTaskPriority(TaskPriority.getPriority(taskPriority.getSelectedIndex()));
            task.setTaskSubject(taskSubjectValue);
            this.taskActionListener.onTaskAdded(task);
            dispose();
        }
    }//GEN-LAST:event_saveTaskButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton saveTaskButton;
    private datechooser.beans.DateChooserCombo taskDate;
    private javax.swing.JTextField taskName;
    private javax.swing.JComboBox<String> taskPriority;
    private javax.swing.JComboBox<Subject> taskSubject;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
