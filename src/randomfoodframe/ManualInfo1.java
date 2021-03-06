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

import randomfRdation.AllList;
import randomfRdation.Anyfood;
import randomfRdation.Cfood;

import randomfRdation.Jfood;
import randomfRdation.Kfood;

import randomfRdation.Wfood;

public class ManualInfo1 extends JPanel {
	

	public ManualInfo1() {

		// JPanel 구조
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		

		//이미지 생성
		ImageIcon backImg = new ImageIcon("뒤로가기1.png");
		ImageIcon kFoodImg = new ImageIcon("한식.png");
		ImageIcon wFoodImg = new ImageIcon("양식.png");
		ImageIcon cFoodImg = new ImageIcon("중식.png");
		ImageIcon jFoodImg = new ImageIcon("일식.png");
		ImageIcon fFoodImg = new ImageIcon("패스트푸드.png");
		ImageIcon sFoodImg = new ImageIcon("샐러드.png");
		
		
		// 음식종류 버튼 생성자
		
		JButton Backbutton = new JButton(backImg);
		JButton KFoodRandom = new JButton(kFoodImg);
		JButton wFoodRandom = new JButton(wFoodImg);
		JButton cFoodRandom = new JButton(cFoodImg);
		JButton jFoodRandom = new JButton(jFoodImg);
		JButton fFoodRandom = new JButton(fFoodImg);
		JButton sFoodRandom = new JButton(sFoodImg);
		JButton allList = new JButton("전체보기");
		
		
		allList.setFont(new Font("굴림", Font.BOLD, 30)); 

		//버튼 이름
		
		
		/*
		 * Backbutton.setName("뒤로돌아가기"); KFoodRandom.setName("한식");
		 * wFoodRandom.setName("양식"); cFoodRandom.setName("중식");
		 * jFoodRandom.setName("일식"); fFoodRandom.setName("패스트푸드");
		 * sFoodRandom.setName("샐러드"); allList.setName("아무거나");
		 */
	
		//버튼위치 
		Backbutton.setBounds(10,20,80,70);
		KFoodRandom.setBounds(90,100,150,150);
		wFoodRandom.setBounds(340,100,150,150);
		cFoodRandom.setBounds(90,300,150,150);
		jFoodRandom.setBounds(340,300,150,150);
		fFoodRandom.setBounds(90,500,150,150);
		sFoodRandom.setBounds(340,500,150,150);
		allList.setBounds(90,680,400,80);
		
		
		
		//버튼 투명도
		Backbutton.setContentAreaFilled(false);	
		KFoodRandom.setContentAreaFilled(false);	
		wFoodRandom.setContentAreaFilled(false);	
		cFoodRandom.setContentAreaFilled(false);	
		jFoodRandom.setContentAreaFilled(false);	
		fFoodRandom.setContentAreaFilled(false);	
		sFoodRandom.setContentAreaFilled(false);	
		allList.setContentAreaFilled(false);
		
		
		
		Backbutton.setBorderPainted(false);
		
		
		//버튼 추가
		add(Backbutton);
		add(KFoodRandom); 
		add(wFoodRandom);
		add(cFoodRandom);
		add(jFoodRandom);
		add(fFoodRandom);
		add(sFoodRandom);
		add(allList);
		
		 
		//뒤로가기버튼 액션
		Backbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Manual());
			}
		});
		
		//한식 버튼 액션
		KFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FrameBase.getDispose();
				FrameBase.getInstance(new Kfood());
			}
		});
		
		//양식버튼 액션
		wFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Wfood());
			}
		});
		//중식버튼 액션
		cFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Cfood());
			}
		});
		//일식버튼 액션
		jFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Jfood());
			}
		});
		
		//패스트푸드버튼 액션
		fFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "해당 지점이 존재하지않습니다");
			}
		});
		
		//샐러드버튼 액션
		sFoodRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "해당 지점이 존재하지않습니다");
			}
		});
		
		//전체보기버튼 액션
		allList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new AllList());
			}
		});
	}//ManualInfo 메서드
}//class
