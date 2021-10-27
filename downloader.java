import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class downloader extends Frame implements ActionListener{
	Panel head=new Panel();
	Panel side=new Panel();
	Panel img_panel=new Panel();
	Button video=new Button("Video");
	Button audio=new Button("Audio");
	Button decoment=new Button("Decoment");
	Button compressed=new Button("Compressed");
	Button programs=new Button("Programs");
	Button others=new Button("Others");
	JLabel img=new JLabel();
	Label L1=new Label(" „  ’„Ì„ «·»—‰«„Ã »Ê«”ÿ… ");
	Label L2=new Label("„/√ﬂ‹‹‹‹‹‹‹‹‹—„ «·ÃÊ·Õ‹‹‹‹‹‹‹‹‹‹‹Ì");
	Label L3=new Label("Â« › : 771598074");
	Label L4=new Label("Ê« ”«» : 739850351");
	link L;
    public downloader() {
    	setSize(500,360);
    	setLayout(null);
    	//______________________________________________
    	img.setIcon(new ImageIcon("ad.png"));
    	img_panel.setBounds(0,30,480,60);
    	img_panel.add(img);
    	img_panel.setBackground(new Color(0,0,0));
    	add((img_panel));
    	video.setBounds(15,120,80,30);
    	video.setBackground(new Color(0,0,0));
    	video.setForeground(new Color(255,255,255));
    	video.addActionListener(this);
    	add(video);
    	audio.setBounds(15,160,80,30);
    	audio.setBackground(new Color(0,0,0));
    	audio.setForeground(new Color(255,255,255));
    	audio.addActionListener(this);
    	add(audio);
    	decoment.setBounds(15,200,80,30);
    	decoment.setBackground(new Color(0,0,0));
    	decoment.setForeground(new Color(255,255,255));
    	decoment.addActionListener(this);
    	add(decoment);
    	compressed.setBounds(15,240,80,30);
    	compressed.setBackground(new Color(0,0,0));
    	compressed.setForeground(new Color(255,255,255));
    	compressed.addActionListener(this);
    	add(compressed);
    	programs.setBounds(15,280,80,30);
    	programs.setBackground(new Color(0,0,0));
    	programs.setForeground(new Color(255,255,255));
    	programs.addActionListener(this);
    	add(programs);
    	others.setBounds(15,320,80,30);
    	others.setBackground(new Color(0,0,0));
    	others.setForeground(new Color(255,255,255));
    	others.addActionListener(this);
    	add(others);
    	head.setBounds(0,0,510,100);
    	head.setBackground(new Color(0,0,0));
    	add(head);
    	side.setBounds(0,0,100,370);
    	side.setBackground(new Color(0,0,0));
    	add(side);
    	L1.setBounds(232,200,150,20);
    	L1.setFont(new Font("Arial",Font.BOLD,14));
    	add(L1);
    	L2.setBounds(230,220,180,20);
    	L2.setFont(new Font("Arial",Font.BOLD,14));
    	L2.setForeground(new Color(0,0,255));
    	add(L2);
    	L3.setBounds(240,240,180,20);
    	L3.setFont(new Font("Arial",Font.BOLD,14));
    	L3.setForeground(new Color(255,0,0));
    	add(L3);
    	L4.setBounds(236,260,180,20);
    	L4.setFont(new Font("Arial",Font.BOLD,14));
    	L4.setForeground(new Color(255,0,0));
    	add(L4);
    	//________________________________________________________
        addWindowListener(new WindowAdapter()
        {
        public void windowClosing(WindowEvent e)
        {
            int x = JOptionPane.showConfirmDialog(null,"Are You Sure To EXITE!!!???","Warining",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x==JOptionPane.YES_OPTION)
                    System.exit(0);
        }
        }
        );
    	//_______________________________________________
    	setLocationRelativeTo(null);
    	setVisible(true);
    	setResizable(false);
    }
    public void actionPerformed(ActionEvent a)
        {
        	if(a.getSource()==video)
        		L=new link();
        	else if(a.getSource()==audio)
        		L=new link();
        	else if(a.getSource()==decoment)
        		L=new link();
        	else if(a.getSource()==compressed)
        		L=new link();
        	else if(a.getSource()==programs)
        		L=new link();
        	else if(a.getSource()==others)
        		L=new link();
        }
    
    public static void main (String[] args) {
    	new downloader();
}
}