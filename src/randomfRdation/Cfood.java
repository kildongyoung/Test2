package randomfRdation;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import randomfoodframe.FrameBase;
import randomfoodframe.Manual;
import randomfoodframe.ManualInfo2;
import rnadomfoodVO.Data;
import rnadomfoodVO.RestaurantDto;
import rnadomfoodVO.Run;

public class Cfood extends JPanel {
	
	public Cfood() {
		
		//기본 JFrame 구조
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		
		ImageIcon backImg = new ImageIcon("뒤로가기1.png");
		ImageIcon homeImg = new ImageIcon("홈버튼.png");
		ImageIcon againImg = new ImageIcon("다시추천받기.png");
		ImageIcon reservationImg = new ImageIcon("예약하기.png");
		
		
		//버튼 선언
		JButton Backbutton = new JButton(backImg);
		JButton ftFirstTime = new JButton(homeImg);
		JButton again = new JButton(againImg);
		JButton reservation = new JButton(reservationImg);
		
		Backbutton.setContentAreaFilled(false);
		ftFirstTime.setContentAreaFilled(false);
		again.setContentAreaFilled(false);
		reservation.setContentAreaFilled(false);
		Backbutton.setBorderPainted(false);
		

		//버튼사이즈 설정
		Backbutton.setBounds(10,20,80,70);
		ftFirstTime.setSize(200, 200);
		again.setSize(200, 200);
		reservation.setSize(200, 200);
		
		
		ftFirstTime.setLocation(
				((int) getSize().getWidth() / 2) - 310, 
				(int) getLocation().getY() / 2 + 570);
		again.setLocation(
				((int) getSize().getWidth() / 2) - 110, 
				(int) getLocation().getY() / 2 + 570);
		reservation.setLocation(
				((int) getSize().getWidth() / 2) +90, 
				(int) getLocation().getY() / 2 + 570);
		
		//버튼추가
		add(Backbutton);
		add(ftFirstTime);
		add(again);
		add(reservation);
		
		//텍스트에리어 추가
		TextArea font=new TextArea();
		font.setBounds(0, 350, 600, 300);
		add(font);
		
		//한식 랜덤 출력
		Data data = new Data();
		RestaurantDto dto = Run.getRandomRestaurantByCategory2(data, "중식");
		
		font.append("식당이름: \t"+dto.getPlaceName()+"\n");
		font.append("대표메뉴: \t"+dto.getPlaceBest()+"\n");
		font.append("주소: \t\t"+dto.getAddressName()+"\n");
		font.append("예약주소: \t"+dto.getPlaceUrl()+"\n");
		font.setFont(new Font("굴림", Font.BOLD, 22)); 
		
		ImageIcon kFoodPhoto=new ImageIcon(dto.getImage());
		JLabel kFphotoset=new JLabel(kFoodPhoto);
		kFphotoset.setSize(600,300);
		kFphotoset.setLocation(-15,100);
		add(kFphotoset);
		
		
		
		//버튼액션
		  
		
		//뒤로가기
		Backbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new ManualInfo2());
			}
		});
		
		//처음으로
		ftFirstTime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Manual());
			}
		});
		
		//다시추천받기
		again.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new Cfood());
				
				
			}
		});
		
		//예약하기
		reservation.addActionListener(new ActionListener() {
					
		@Override
		public void actionPerformed(ActionEvent e) {
			FrameBase.getDispose();
			
			FrameBase.getInstance(new Reservation());
		}
		});
				
		
	}
	
	


}
