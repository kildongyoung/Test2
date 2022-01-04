package randomfoodframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import randomfRdation.Anyfood;
import randomfRdation.Cfood;

import randomfRdation.Jfood;
import randomfRdation.Kfood;

import randomfRdation.Wfood;

public class ManualInfo2 extends JPanel {
	

	public ManualInfo2() {

		// JPanel ����
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		
		ImageIcon backImg = new ImageIcon("�ڷΰ���1.png");
		ImageIcon kFoodImg = new ImageIcon("�ѽ�.png");
		ImageIcon wFoodImg = new ImageIcon("���.png");
		ImageIcon cFoodImg = new ImageIcon("�߽�.png");
		ImageIcon jFoodImg = new ImageIcon("�Ͻ�.png");
		ImageIcon fFoodImg = new ImageIcon("�н�ƮǪ��.png");
		ImageIcon sFoodImg = new ImageIcon("������.png");

		// �������� ��ư ������
		
		JButton Backbutton = new JButton(backImg);
		JButton KFoodRandom = new JButton(kFoodImg);
		JButton wFoodRandom = new JButton(wFoodImg);
		JButton cFoodRandom = new JButton(cFoodImg);
		JButton jFoodRandom = new JButton(jFoodImg);
		JButton fFoodRandom = new JButton(fFoodImg);
		JButton sFoodRandom = new JButton(sFoodImg);
		JButton anything = new JButton("�ƹ��ų�");

		//��ư �̸�
		
		
		anything.setName("�ƹ��ų�");
		anything.setFont(new Font("����", Font.BOLD, 30)); 
	
		//��ư��ġ 
		Backbutton.setBounds(10,20,80,70);
		KFoodRandom.setBounds(90,100,150,150);
		wFoodRandom.setBounds(340,100,150,150);
		cFoodRandom.setBounds(90,300,150,150);
		jFoodRandom.setBounds(340,300,150,150);
		fFoodRandom.setBounds(90,500,150,150);
		sFoodRandom.setBounds(340,500,150,150);
		anything.setBounds(90,680,400,80);
		
		
		
		
		Backbutton.setContentAreaFilled(false);	
		KFoodRandom.setContentAreaFilled(false);	
		wFoodRandom.setContentAreaFilled(false);	
		cFoodRandom.setContentAreaFilled(false);	
		jFoodRandom.setContentAreaFilled(false);	
		fFoodRandom.setContentAreaFilled(false);	
		sFoodRandom.setContentAreaFilled(false);	
		anything.setContentAreaFilled(false);
		
		
		
		Backbutton.setBorderPainted(false);
		
		//��ư �߰�
		add(Backbutton);
		add(KFoodRandom); 
		add(wFoodRandom);
		add(cFoodRandom);
		add(jFoodRandom);
		add(fFoodRandom);
		add(sFoodRandom);
		add(anything);
		
		 
		//�ڷΰ����ư �׼�
		Backbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Manual());
			}
		});
		
		//�ѽ� ��ư �׼�
		KFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FrameBase.getDispose();
				FrameBase.getInstance(new Kfood());
			}
		});
		
		//��Ĺ�ư �׼�
		wFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Wfood());
			}
		});
		//�߽Ĺ�ư �׼�
		cFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Cfood());
			}
		});
		//�ϽĹ�ư �׼�
		jFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Jfood());
			}
		});
		
		//�н�ƮǪ���ư �׼�
		fFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "�ش� ������ ���������ʽ��ϴ�");
			}
		});
		
		//�������ư �׼�
		sFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "�ش� ������ ���������ʽ��ϴ�");
			}
		});
		
		//�ƹ��ų���ư �׼�
		anything.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Anyfood());
			}
		});
	}//ManualInfo �޼���
}//class
