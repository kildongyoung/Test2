package randomfRdation;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import randomfoodframe.FrameBase;
import randomfoodframe.Manual;

public class Reservation extends JPanel{
	
	public Reservation() {
		
		
		
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		JLabel title=new JLabel("예약하기");
		title.setFont(new Font("나눔고딕코딩",Font.PLAIN, 20));
		title.setBounds(350,30,200,50);
		add(title);
		
		ImageIcon mmIMG = new ImageIcon("예약라이언.png");
		JLabel MnImg = new JLabel(mmIMG);
		MnImg.setSize(590, 500);
		MnImg.setLocation(0, 130);
		add(MnImg);
		
		
		Choice movieTime = new Choice();
		long time = System.currentTimeMillis();

		SimpleDateFormat dayTime = 
			new SimpleDateFormat("MM월 dd일(EE)");//(EE:요일)

		String str = dayTime.format( new Date(time) );

		String[] timeSlot = { 
				"시간대 선택", 
				str + " 10:00~11:00",
				str + " 11:00~12:00", 
				str + " 12:00~13:00", 
				str + " 13:00~14:00", 
				str + " 14:00~15:00",
				str + " 15:00~16:00", 
				str + " 16:00~17:00", 
				str + " 17:00~18:00", 
				str + " 18:00~19:00", 
				str + " 19:00~20:00", 
				str + " 20:00~21:00", 
				};

		for (int i = 0; i < timeSlot.length; i++) {
			movieTime.add(timeSlot[i]);
		}

		movieTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
		movieTime.setSize(300, 200);
		movieTime.setLocation(260, 100);

		add(movieTime);
		
		JButton btnBuy = new JButton("예약하기");
		JButton home = new JButton("처음으로");
		

		
		home.setSize(200, 200);
		home.setLocation(((int) getSize().getWidth() / 2) - 310, 
				(int) getLocation().getY() / 2 + 570);
		home.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		
		btnBuy.setSize(200, 200);
		btnBuy.setLocation(
				((int) getSize().getWidth() / 2) +90, 
				(int) getLocation().getY() / 2 + 570);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		
		
		
		
		home.setBorderPainted(false);
		home.setContentAreaFilled(false);
		home.setFocusPainted(false);
		
		btnBuy.setBorderPainted(false);
		btnBuy.setContentAreaFilled(false);
		btnBuy.setFocusPainted(false);
		
		
		add(btnBuy);
		add(home);
		
		
		
		btnBuy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (movieTime.getSelectedItem().equals("시간대 선택")) {
					JOptionPane.showMessageDialog(null, "시간을 선택해 주세요");
			}else {
				JOptionPane.showMessageDialog(null, "예약을 완료하였습니다");
			}
		}
			
		});
		
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Manual());
			}
		});
		
		
		
		
	

	}
	
	

}
