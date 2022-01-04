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

public class AllList extends JPanel {
	
	public static int page2=0;
	Data data = new Data();
	

	public AllList() {
		
		//기본 JFrame 구조
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		
		ImageIcon backImg = new ImageIcon("뒤로가기1.png");
		ImageIcon homeImg = new ImageIcon("홈버튼.png");
		ImageIcon againImg = new ImageIcon("다시추천받기.png");
		ImageIcon reservationImg = new ImageIcon("예약하기.png");
		ImageIcon left = new ImageIcon("왼쪽.png");
		ImageIcon right = new ImageIcon("오른쪽.png");
		
		
		//버튼 선언
		JButton Backbutton = new JButton(backImg);
		JButton ftFirstTime = new JButton(homeImg);
		JButton again = new JButton(againImg);
		JButton reservation = new JButton(reservationImg);
		JButton leftbutton = new JButton(left);
		JButton rightbutton = new JButton(right);
		
		
		//버튼투명도
		Backbutton.setContentAreaFilled(false);
		ftFirstTime.setContentAreaFilled(false);
		again.setContentAreaFilled(false);
		reservation.setContentAreaFilled(false);
		
		
		Backbutton.setBorderPainted(false);
		leftbutton.setBorderPainted(false);
		rightbutton.setBorderPainted(false);

		//버튼사이즈 설정
		Backbutton.setBounds(10,20,80,70);
		ftFirstTime.setSize(200, 200);
		again.setSize(200, 200);
		reservation.setSize(200, 200);
		leftbutton.setBounds(0,190,40,90);
		rightbutton.setBounds(545,190,40,90);
		
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
		add(leftbutton);
		add(rightbutton);
		
		//텍스트에리어 추가
		TextArea font=new TextArea();
		font.setBounds(0, 350, 600, 300);
		add(font);
		
		//한식 랜덤 출력
		
		//RestaurantDto dto = Run.getRandomRestaurantByCategory2(data, "중식");

	

		
		
		
		 // for(int i=0;i<data.makeList().size();i++) { 
	
		
		
			Data data = new Data();
		  RestaurantDto dto=Run.getAllListRestaurant(data,page2);
		  font.append("식당이름: \t"+dto.getPlaceName()+"\n");
		  font.append("대표메뉴: \t"+dto.getPlaceBest()+"\n");
		  font.append("주소: \t\t"+dto.getAddressName()+"\n");
		  font.append("예약주소: \t"+dto.getPlaceUrl()+"\n"); 
		  font.setFont(new Font("굴림",Font.BOLD, 22));
		  
		  
		  
		  ImageIcon kFoodPhoto=new ImageIcon(dto.getImage()); 
		  JLabel kFphotoset=new JLabel(kFoodPhoto); 
		  kFphotoset.setSize(600,500);
		  kFphotoset.setLocation(-15,0); 
		  add(kFphotoset);
		  
		//  }
		 
		
		
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
				page2=0;
				FrameBase.getDispose();
				FrameBase.getInstance(new Manual());
			}
		});
		
		//오른쪽
		rightbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				page2++;
				
				if(page2<data.makeList().size()&&page2>0) {
					
					FrameBase.getDispose();
					FrameBase.getInstance(new AllList());
				}else if(page2>data.makeList().size()){
					page2=data.makeList().size();
					
					JOptionPane.showMessageDialog(null, "마지막페이지입니다.");
					if(page2==data.makeList().size()) 
					{
						page2--;
						
					}
					
				}
				
				
			}
		});
		//왼쪽
		leftbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				left();
			}
		});
		
		//예약하기
		reservation.addActionListener(new ActionListener() {
					
		@Override
		public void actionPerformed(ActionEvent e) {
			
			FrameBase.getInstance(new Reservation());
		}
		});
				
		
	}
	
	
	public void left() {
		if(page2<=data.makeList().size()&&page2>0) {
			page2--;
			FrameBase.getDispose();
			FrameBase.getInstance(new AllList());
		}else if(page2<=0){
			page2=0;
			JOptionPane.showMessageDialog(null, "첫번째페이지입니다.");
		}
	}


}
