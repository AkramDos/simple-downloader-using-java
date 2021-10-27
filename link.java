import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class link extends Frame implements ActionListener{
	TextField Link=new TextField();
	Label L=new Label("Link:-");
	Button ok=new Button("OK");
	Label L1=new Label("«·ÕÃ„");
	Label L2=new Label(" „  Õ„Ì·Â");
	Label L3=new Label("‰”»… «· Õ„Ì·");
	Label L4=new Label(" Waiting for obtaining iformation.....");
	TextField size=new TextField("0.0KB");
	TextField down=new TextField("0.0KB");
	TextField percent=new TextField("0.0%");
	BufferedInputStream in = null;
	FileOutputStream fout = null;
    public link() {
  	    setSize(420,150);
		setLayout(null);
		//_______________________________________________
		Link.setBounds(20,70,390,25);
		add(Link);
		L.setBounds(20,50,50,20);
		L.setFont(new Font("Times New Roman",Font.BOLD,14));
		add(L);
		ok.setBounds(360,100,50,25);
		ok.setBackground(new Color(0,0,0));
		ok.setForeground(new Color(255,255,255));
		ok.setFont(new Font("Times New Roman",Font.BOLD,16));
		ok.addActionListener(this);
		add(ok);
		percent.setBounds(20,80,50,20);
		percent.setEditable(false);
		percent.setFont(new Font("Times New Roman",Font.BOLD,12));
		L3.setBounds(90,80,70,25);
		L3.setFont(new Font("Arial",Font.BOLD,14));
		down.setBounds(160,80,80,20);
		down.setEditable(false);
		down.setFont(new Font("Times New Roman",Font.BOLD,12));
		L2.setBounds(240,80,50,25);
		L2.setFont(new Font("Arial",Font.BOLD,14));
		size.setBounds(300,80,80,20);
		size.setEditable(false);
		size.setFont(new Font("Times New Roman",Font.BOLD,12));
		L1.setBounds(380,80,30,25);
		L1.setFont(new Font("Arial",Font.BOLD,14));
		L4.setBounds(20,80,250,25);
		L4.setFont(new Font("Arial",Font.BOLD,12));
		//_______________________________________________
		addWindowListener(new WindowAdapter()
        {
        public void windowClosing(WindowEvent e)
        {
            int x = JOptionPane.showConfirmDialog(null,"Are You Sure To cancel The download!!!???","Warining",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(x==JOptionPane.YES_OPTION)
            {
            	try{
            		in.close();
			    	fout.close();
            	}catch(Exception ex)
            	{}
			    dispose();
            }
        }
        }
        );
		//_______________________________________________
    	setLocationRelativeTo(null);
    	setVisible(true);
    	setResizable(false);
    	show();
    }
    public void actionPerformed(ActionEvent a)
        {
        	if(a.getSource()==ok)
        	{
        		String url=Link.getText();
        		if(url.length()<=0)
        		{
        			JOptionPane.showMessageDialog(null,"you should inter a URL link","Warining",JOptionPane.WARNING_MESSAGE);
        		}
        		else
        		{
        			L.setBounds(20,300,50,20);
	        		ok.setBounds(230,300,50,25);
	        		Link.setBounds(20,300,260,25);
	        		//String file_name="D:\\yyyy\\aaaa.mp4";
	        		String file_name="D:\\yyyy\\"+url.substring(url.lastIndexOf("/"));
	        		try{
	        			saveUrl(file_name,url);
	        			}catch(Exception e)
		        		{
		        			try{
			            		in.close();
						    	fout.close();
			            	}catch(Exception ex)
			            	{}
		        			JOptionPane.showMessageDialog(null,e.getStackTrace(),"Warining",JOptionPane.WARNING_MESSAGE);
		        		}
        		}
        	}
        }
        public void saveUrl(final String filename, final String urlString)throws Exception {
        	add(L4);
		    try {
		    	URLConnection connect=new URL(urlString).openConnection();
		    	System.out.println (connect.getFileNameMap());
		        in = new BufferedInputStream(connect.getInputStream());
		        fout = new FileOutputStream(filename);
		        int sizes=(connect.getContentLength()/1000);
		        String sized=sizes+"  KB";
		        String downed="";
		        String precentage="";
		        int i=0;
				L4.setBounds(20,300,120,25);
				setpointerofdownload();
		        final byte data[] = new byte[1024];
		        int count;
		        while ((count = in.read(data, 0, 1024)) != -1) {
		        	size.setText(sized);
		            fout.write(data, 0, count);
		            downed=(++i)+"  KB";
		            down.setText(downed);
		            precentage=((i*100)/sizes)+"  %";
		            percent.setText(precentage);
		        }
		    } finally {
		        if (in != null) {
		            in.close();
		        }
		        if (fout != null) {
		            fout.close();
		        }
		    }
		    dispose();
		    JOptionPane.showMessageDialog(null,"Download Done Successfully","Warining",JOptionPane.PLAIN_MESSAGE);
}
 	public void setpointerofdownload()
 	{
 		add(percent);
		add(L3);
		add(down);
		add(L2);
		add(size);
		add(L1);
 	}
}