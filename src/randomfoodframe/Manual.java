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
	
	// 생성자에 내용 추가
	public Manual() {
		

		// JPanel 구조
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		
		ImageIcon mmIMG = new ImageIcon("맛집이2.png");
		ImageIcon mmIMG1 = new ImageIcon("맛집추천.png");
		ImageIcon mmIMG2 = new ImageIcon("맛집추천2.png");
		ImageIcon mmIMG3 = new ImageIcon("최근에 생긴맛집.png");
		JLabel MnImg = new JLabel(mmIMG);
		MnImg.setSize(590, 600);
		MnImg.setLocation(0, 0);
		add(MnImg);
		

		// 
		
		JButton btn1 = new JButton(mmIMG1);
		JButton btn2 = new JButton(mmIMG2);
		JButton btn3 = new JButton(mmIMG3);
		
		
		JTextField jtext=new JTextField();
		
		
		  btn1.setText("<HTML>맛집 <br>둘러보기</HTML>");
		  btn1.setFont(new Font("굴림", Font.BOLD, 20)); 
		  btn1.setContentAreaFilled(false);	  
				  
				  
		  btn2.setText("<HTML>맛집 <br>추천받기</HTML>");
		  btn2.setFont(new Font("굴림", Font.BOLD, 15));
		  btn2.setContentAreaFilled(false);	  
				  
		  btn3.setText("<HTML>최근에 <dr>생긴맛집</HTML>");
		  btn3.setFont(new Font("굴림", Font.BOLD, 17));
		  btn3.setContentAreaFilled(false); 
		  
		  

		
		
		
		btn1.setSize(200, 200);
		btn2.setSize(200, 200);
		btn3.setSize(200, 200);
		
		btn1.setBorderPainted(false);
		btn2.setBorderPainted(false);
		btn3.setBorderPainted(false);
		
		//버튼 투명도 설정
		
		
		
		
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
				JOptionPane.showMessageDialog(null,"아직 미구현 단계입니다");
				
			}
		});
		
		

		

		

	}// 생성자
}
