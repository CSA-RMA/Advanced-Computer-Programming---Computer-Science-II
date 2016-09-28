import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.BadLocationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
class Website {
    String URL;
    String password;
    Website(String URL, String password){
        this.URL=URL;
        this.password=password;
    }
    Website(String URL){
        this.URL=URL;
        password="Enter a password here, or press the button above to generate one!";
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getURL(){
        return URL;
    }
    public void setURL(String URL){
        this.URL=URL;
    }
    public String toString() {
        return URL+"-"+password;
    }
}
class Account { 
    ArrayList<Website> websites=new ArrayList<Website>();
    String name;
    Account(String name,ArrayList<Website>websites){
        this.name=name;
        this.websites=websites;
    }
    Account(String name){
        this.name=name;
    }
    Account(){
    }
    public ArrayList getWebsites(){
        return websites;
    }
    public void setWebsites(ArrayList<Website>websites){
        this.websites=websites;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class GUI extends javax.swing.JFrame {
    //public String[] websites = { "https://facebook.com/", "https://youtube.com/", "https://google.com/", "https://wikipedia.org/", "https://amazon.com/", "https://twitter.com/", "https://ebay.com/", "https://reddit.com/", "https://netflix.com/", "https://tumblr.com/", "https://paypal.com/" };
    public String[] stringaccounts = {}; 
    public ArrayList<Account> accounts=new ArrayList<Account>();
    public int currentaccount=0;
    /**
     * Creates new form GUI
     */
    public GUI() throws FileNotFoundException {
        Scanner reader=new Scanner(new File("info.txt"));
        int o=0;
        while(reader.hasNextLine()){
            Account account=new Account();
            String accountssites=reader.nextLine();
            //System.out.printf("%s///2==0: %s\n",o,(o%2==0));
            if(o%2==1){
                String[] urlspasswords= accountssites.split("\t");
                ArrayList<Website> websites=new ArrayList<Website>();
                for(int i=0;i<urlspasswords.length;i++){
                    String[] urlpassword=urlspasswords[i].split("-");
                    Website website=new Website(urlpassword[0],urlpassword[1]);
                    websites.add(website);
                }
                accounts.get((o/2)).setWebsites(websites);
            } else {
                account.setName(accountssites);
                accounts.add(account);
            }
            o++;
        }
        List<String> accountnames=new ArrayList<String>() {};
        for(int i=0;i<accounts.size();i++){
            accountnames.add(accounts.get(i).getName());
        }
        stringaccounts=accountnames.toArray(new String[0]);
        initComponents();
    }
    
    public static String getDefaultBrowser(){
        try{
            Process process=Runtime.getRuntime().exec("REG QUERY HKEY_CLASSES_ROOT\\http\\shell\\open\\command");
            Scanner kb=new Scanner(process.getInputStream());
            while (kb.hasNextLine()){
                String registry=(kb.nextLine()).replaceAll("\\\\", "/").trim();
                Matcher matcher=Pattern.compile("/(?=[^/]*$)(.+?)[.]").matcher(registry);
                if (matcher.find()){
                    kb.close();
                    String defaultBrowser=matcher.group(1);
                    defaultBrowser=defaultBrowser.substring(0, 1).toUpperCase() + defaultBrowser.substring(1, defaultBrowser.length());
                    return defaultBrowser;
                }
            }
            kb.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        // Have to return something if everything fails
        return "Error: Unable to get default browser";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        OuterPanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        EmailUsernameLabel = new javax.swing.JLabel();
        UsernameEmailComboBox = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        UsernameEnteringTextPane = new javax.swing.JTextPane();
        AddtoAccountListButton = new javax.swing.JButton();
        InnerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        URLList = new javax.swing.JList();
        GoToURLButton = new javax.swing.JButton();
        GeneratePasswordButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PasswordEnteringTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        URLEnteringTextPane = new javax.swing.JTextPane();
        SavePasswordButton = new javax.swing.JButton();
        SaveChangesButton = new javax.swing.JButton();
        AddtoURLListButton = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        EmailUsernameLabel.setText("E-Mail/Username: ");
        EmailUsernameLabel.setName(""); // NOI18N
        jToolBar1.add(EmailUsernameLabel);

        UsernameEmailComboBox.setModel(new javax.swing.DefaultComboBoxModel(stringaccounts));
        UsernameEmailComboBox.setMaximumSize(new java.awt.Dimension(111129, 29));
        UsernameEmailComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                UsernameEmailComboBoxPropertyChange(evt);
            }
        });
        UsernameEmailComboBox.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                currentaccount=Arrays.asList(stringaccounts).indexOf((String)UsernameEmailComboBox.getSelectedItem());
                DefaultListModel listModel=new DefaultListModel();
                for (int i=0; i<accounts.get(currentaccount).getWebsites().size(); i++) {
                    listModel.addElement(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0]);
                }
                URLList.setModel(listModel);
            }
        });
        jToolBar1.add(UsernameEmailComboBox);

        UsernameEnteringTextPane.setText("Enter a username/email here!");
        UsernameEnteringTextPane.setMaximumSize(new java.awt.Dimension(29, 22));
        UsernameEnteringTextPane.setMinimumSize(new java.awt.Dimension(29, 22));
        UsernameEnteringTextPane.setPreferredSize(new java.awt.Dimension(120, 20));
        jScrollPane4.setViewportView(UsernameEnteringTextPane);

        jToolBar1.add(jScrollPane4);

        AddtoAccountListButton.setText("Add to List");
        AddtoAccountListButton.setFocusable(false);
        AddtoAccountListButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddtoAccountListButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AddtoAccountListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoAccountListButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(AddtoAccountListButton);

        InnerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        URLList.setModel(new javax.swing.AbstractListModel() {
            public int getSize() { return accounts.get(currentaccount).getWebsites().size(); }
            public Object getElementAt(int i) { return accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0]; }
        });
        URLList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        URLList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                String selected = (String) URLList.getSelectedValue();
                if (!arg0.getValueIsAdjusting()) {
                    for(Account account: accounts){
                        for(int i=0;i<account.getWebsites().size();i++){
                            if(account.getWebsites().get(i).toString().split("-")[0].equals(URLList.getSelectedValue())){
                                PasswordEnteringTextPane.setText(account.getWebsites().get(i).toString().split("-")[1]);
                            }
                        }
                    }
                }
            }
        });
        URLList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                URLListMouseClicked(evt);
            }
        });
        URLList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                URLListPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(URLList);

        GoToURLButton.setText("Go to Website");
        GoToURLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToURLButtonActionPerformed(evt);
            }
        });

        GeneratePasswordButton.setText("Generate Password");
        GeneratePasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeneratePasswordButtonMouseClicked(evt);
            }
        });

        PasswordEnteringTextPane.setBackground(new java.awt.Color(174, 178, 195));
        PasswordEnteringTextPane.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(PasswordEnteringTextPane);

        URLEnteringTextPane.setBackground(new java.awt.Color(174, 178, 195));
        URLEnteringTextPane.setText("Enter URL here!");
        jScrollPane3.setViewportView(URLEnteringTextPane);

        SavePasswordButton.setText("Save Password");
        SavePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavePasswordButtonActionPerformed(evt);
            }
        });

        SaveChangesButton.setText("Save Changes");
        SaveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveChangesButtonActionPerformed(evt);
            }
        });

        AddtoURLListButton.setText("Add to List");
        AddtoURLListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoURLListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InnerPanelLayout = new javax.swing.GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddtoURLListButton)
                        .addGap(10, 10, 10)))
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(SavePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GoToURLButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InnerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GeneratePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SaveChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        InnerPanelLayout.setVerticalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addGroup(InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GeneratePasswordButton)
                            .addComponent(AddtoURLListButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SavePasswordButton)
                        .addGap(18, 18, 18)
                        .addComponent(SaveChangesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GoToURLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InnerPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );

        GeneratePasswordButton.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout OuterPanelLayout = new javax.swing.GroupLayout(OuterPanel);
        OuterPanel.setLayout(OuterPanelLayout);
        OuterPanelLayout.setHorizontalGroup(
            OuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OuterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        OuterPanelLayout.setVerticalGroup(
            OuterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void URLListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_URLListPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_URLListPropertyChange

    private void GoToURLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToURLButtonActionPerformed
        try {
            String selected = (String) URLList.getSelectedValue();
            WebDriver driver=new FirefoxDriver();
            if(getDefaultBrowser().equals("Chrome")){
                driver=new ChromeDriver();
            } if(getDefaultBrowser().equals("Opera")){
                driver=new OperaDriver();
            } if(getDefaultBrowser().equals("Safari")){
                driver=new SafariDriver();
            }
            driver.get(selected);
            try {
                WebElement email=driver.findElement(By.id("email"));
                email.sendKeys(accounts.get(currentaccount).getName());
            } catch(Throwable e) {
                WebElement username=driver.findElement(By.id("username"));
                username.sendKeys(accounts.get(currentaccount).getName());
            }
            try {
                WebElement pass = driver.findElement(By.name("pass"));
                for(int i=0;i<accounts.get(currentaccount).getWebsites().size();i++){
                    if(selected.equals(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0])){
                        pass.sendKeys(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[1]);
                    }
                }
            } catch(Throwable e) {
                WebElement pass = driver.findElement(By.name("password"));
                for(int i=0;i<accounts.get(currentaccount).getWebsites().size();i++){
                    if(selected.equals(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0])){
                        pass.sendKeys(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[1]);
                    }
                }
            }
        } catch(Throwable e) {
        }
        /*try {
            Desktop.getDesktop().browse(new URL(selected).toURI());
        } catch (Exception e) {}*/
    }//GEN-LAST:event_GoToURLButtonActionPerformed

    private void URLListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URLListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_URLListMouseClicked

    private void GeneratePasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeneratePasswordButtonMouseClicked
        Random randomnumgen=new Random();
        for(int i=0;i<50;i++) {
            String characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            char[] text = new char[20];
            for (int o=0;o<20;o++) {
                text[o] = characters.charAt(randomnumgen.nextInt(characters.length()));
            }
        PasswordEnteringTextPane.setText(new String(text)); 
        }
    }//GEN-LAST:event_GeneratePasswordButtonMouseClicked

    private void AddtoAccountListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoAccountListButtonActionPerformed
        try {
            accounts.add(new Account(UsernameEnteringTextPane.getDocument().getText(0, UsernameEnteringTextPane.getDocument().getLength())));
            List<String> accountnames=new ArrayList<String>() {};
            for(int i=0;i<accounts.size();i++){
                accountnames.add(accounts.get(i).getName());
            }
            stringaccounts=accountnames.toArray(new String[0]);
        } catch (BadLocationException ex) {
        }
        DefaultComboBoxModel model=new DefaultComboBoxModel(stringaccounts);
        UsernameEmailComboBox.setModel(model);
    }//GEN-LAST:event_AddtoAccountListButtonActionPerformed

    private void UsernameEmailComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_UsernameEmailComboBoxPropertyChange

    }//GEN-LAST:event_UsernameEmailComboBoxPropertyChange

    private void AddtoURLListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoURLListButtonActionPerformed
        DefaultListModel listModel=new DefaultListModel();
        try {
            String fromtextpane=URLEnteringTextPane.getDocument().getText(0, URLEnteringTextPane.getDocument().getLength());
            ArrayList<Website> accountwebsites=new ArrayList<Website>() {};
            for(int i=0;i<accounts.get(currentaccount).getWebsites().size();i++){
                accountwebsites.add((Website)accounts.get(currentaccount).getWebsites().get(i));
                listModel.addElement(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0]);
            }
            accountwebsites.add(new Website(fromtextpane));
            listModel.addElement(new Website(fromtextpane).toString().split("-")[0]);
            accounts.get(currentaccount).setWebsites(accountwebsites);
        } catch (BadLocationException ex) {
        }
        URLList.setModel(listModel);
    }//GEN-LAST:event_AddtoURLListButtonActionPerformed

    private void SavePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavePasswordButtonActionPerformed
        DefaultListModel listModel=new DefaultListModel();
        try {
            ArrayList<Website> accountwebsites=new ArrayList<Website>() {};
            for(int i=0;i<accounts.get(currentaccount).getWebsites().size();i++){
                if(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0].equals(URLList.getSelectedValue())){
                    Website website=new Website(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0],PasswordEnteringTextPane.getDocument().getText(0, PasswordEnteringTextPane.getDocument().getLength()));
                    accountwebsites.add(website);
                    listModel.addElement(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0]);
                }else {
                    accountwebsites.add((Website)accounts.get(currentaccount).getWebsites().get(i));
                    listModel.addElement(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0]);
                }
            }
            accounts.get(currentaccount).setWebsites(accountwebsites);
        } catch (BadLocationException ex) {
        }
        URLList.setModel(listModel);
    }//GEN-LAST:event_SavePasswordButtonActionPerformed

    private void SaveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveChangesButtonActionPerformed
        DefaultListModel listModel=new DefaultListModel();
        try {
            ArrayList<Website> accountwebsites=new ArrayList<Website>() {};
            for(int i=0;i<accounts.get(currentaccount).getWebsites().size();i++){
                if(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0].equals(URLList.getSelectedValue())){
                    Website website=new Website(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0],PasswordEnteringTextPane.getDocument().getText(0, PasswordEnteringTextPane.getDocument().getLength()));
                    accountwebsites.add(website);
                    listModel.addElement(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0]);
                }else {
                    accountwebsites.add((Website)accounts.get(currentaccount).getWebsites().get(i));
                    listModel.addElement(accounts.get(currentaccount).getWebsites().get(i).toString().split("-")[0]);
                }
            }
            accounts.get(currentaccount).setWebsites(accountwebsites);
        } catch (BadLocationException ex) {
        }
        URLList.setModel(listModel);
        try {
            FileWriter fw = new FileWriter(new File("info.txt"));
            for(Account account: accounts){
                fw.write(account.getName()+"\n");
                for(int i=0;i<account.getWebsites().size();i++){
                    fw.write(account.getWebsites().get(i).toString()+"\t");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error saving file!");
        }
    }//GEN-LAST:event_SaveChangesButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoAccountListButton;
    private javax.swing.JButton AddtoURLListButton;
    private javax.swing.JLabel EmailUsernameLabel;
    private javax.swing.JButton GeneratePasswordButton;
    private javax.swing.JButton GoToURLButton;
    private javax.swing.JPanel InnerPanel;
    private javax.swing.JPanel OuterPanel;
    private javax.swing.JTextPane PasswordEnteringTextPane;
    private javax.swing.JButton SaveChangesButton;
    private javax.swing.JButton SavePasswordButton;
    private javax.swing.JTextPane URLEnteringTextPane;
    private javax.swing.JList URLList;
    private javax.swing.JComboBox UsernameEmailComboBox;
    private javax.swing.JTextPane UsernameEnteringTextPane;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}