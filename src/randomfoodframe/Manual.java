package randomfoodframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Manual extends JPanel {
	
	// �����ڿ� ���� �߰�
	public Manual() {
		

		// JPanel ����
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		
		ImageIcon mmIMG = new ImageIcon("������2.png");
		ImageIcon mmIMG1 = new ImageIcon("������õ.png");
		ImageIcon mmIMG2 = new ImageIcon("������õ2.png");
		ImageIcon mmIMG3 = new ImageIcon("�ֱٿ� �������.png");
		JLabel MnImg = new JLabel(mmIMG);
		MnImg.setSize(590, 600);
		MnImg.setLocation(0, 0);
		add(MnImg);
		

		// 
		
		JButton btn1 = new JButton(mmIMG1);
		JButton btn2 = new JButton(mmIMG2);
		JButton btn3 = new JButton(mmIMG3);
		
		
		JTextField jtext=new JTextField();
		
		
		  btn1.setText("<HTML>���� <br>�ѷ�����</HTML>");
		  btn1.setFont(new Font("����", Font.BOLD, 20)); 
		  btn1.setContentAreaFilled(false);	  
				  
				  
		  btn2.setText("<HTML>���� <br>��õ�ޱ�</HTML>");
		  btn2.setFont(new Font("����", Font.BOLD, 15));
		  btn2.setContentAreaFilled(false);	  
				  
		  btn3.setText("<HTML>�ֱٿ� <dr>�������</HTML>");
		  btn3.setFont(new Font("����", Font.BOLD, 17));
		  btn3.setContentAreaFilled(false); 
		  
		  

		
		
		
		btn1.setSize(200, 200);
		btn2.setSize(200, 200);
		btn3.setSize(200, 200);
		
		btn1.setBorderPainted(false);
		btn2.setBorderPainted(false);
		btn3.setBorderPainted(false);
		
		//��ư ���� ����
		
		
		
		
		btn1.setFocusPainted(false);
		btn2.setFocusPainted(false);
		btn3.setFocusPainted(false);
		
		btn1.setLocation(
				((int) getSize().getWidth() / 2) - 310, 
				(int) getLocation().getY() / 2 + 570);
		btn2.setLocation(
				((int) getSize().getWidth() / 2) - 110, 
				(int) getLocation().getY() / 2 + 570);
		btn3.setLocation(
				((int) getSize().getWidth() / 2) +90, 
				(int) getLocation().getY() / 2 + 570);
		add(btn1);
		add(btn2);
		add(btn3);
		
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FrameBase.getDispose();
				FrameBase.getInstance(new ManualInfo1());
				
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new ManualInfo2());
				
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				JOptionPane.showMessageDialog(null,"���� �̱��� �ܰ��Դϴ�");
				
			}
		});
		
		

		

		

	}// ������
}
