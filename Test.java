import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		MyFrame mfr = new MyFrame("Bank Menu",100,200,300,300);
		mfr.setVisible(true);
	}
}

class MyFrame extends JFrame implements ActionListener
{
	JButton apply = new JButton("Apply For BankAccount");
	JButton login = new JButton("Login");
	
	MyFrame(String title, int x, int y, int c1, int c2) {
		super(title);
		setLocation(x,y);
		setSize(c1,c2);
		setLayout(new FlowLayout());
		add(apply);
		add(login);
		apply.addActionListener(this);
		login.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==apply) {
			//this.setVisible(false);
			apply.setEnabled(false);
			ApplicantFrame applicantFrame= new ApplicantFrame("Applicant",100,200,300,300,this);
			applicantFrame.setVisible(true);
		}
		else if(e.getSource()==login) {
			//this.setVisible(false);
			login.setEnabled(false);
			LoginFrame loginFrame = new LoginFrame("Login",100,200,300,300,this);
			loginFrame.setVisible(true);
		}
		
	}
	
}
class LoginFrame extends JFrame implements WindowListener
{
	MyFrame mfr;
	LoginFrame(String title, int x, int y, int c1, int c2,MyFrame mfr) {
		super(title);
		this.mfr=mfr;
		setLocation(x,y);
		setSize(c1,c2);
		setLayout(new FlowLayout());
		this.addWindowListener(this);
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.mfr.login.setEnabled(true);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class ApplicantFrame extends JFrame implements WindowListener
{
	MyFrame mfr;
	
	ApplicantFrame(String title, int x, int y, int c1, int c2, MyFrame mfr) {
		super(title);
		this.mfr = mfr;
		setLocation(x,y);
		setSize(c1,c2);
		setLayout(new FlowLayout());
		this.addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.mfr.apply.setEnabled(true);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
