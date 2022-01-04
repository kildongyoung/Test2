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
		
		//�⺻ JFrame ����
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 2000);
		
		
		ImageIcon backImg = new ImageIcon("�ڷΰ���1.png");
		ImageIcon homeImg = new ImageIcon("Ȩ��ư.png");
		ImageIcon againImg = new ImageIcon("�ٽ���õ�ޱ�.png");
		ImageIcon reservationImg = new ImageIcon("�����ϱ�.png");
		ImageIcon left = new ImageIcon("����.png");
		ImageIcon right = new ImageIcon("������.png");
		
		
		//��ư ����
		JButton Backbutton = new JButton(backImg);
		JButton ftFirstTime = new JButton(homeImg);
		JButton again = new JButton(againImg);
		JButton reservation = new JButton(reservationImg);
		JButton leftbutton = new JButton(left);
		JButton rightbutton = new JButton(right);
		
		
		//��ư����
		Backbutton.setContentAreaFilled(false);
		ftFirstTime.setContentAreaFilled(false);
		again.setContentAreaFilled(false);
		reservation.setContentAreaFilled(false);
		
		
		Backbutton.setBorderPainted(false);
		leftbutton.setBorderPainted(false);
		rightbutton.setBorderPainted(false);

		//��ư������ ����
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
		
		//��ư�߰�
		add(Backbutton);
		add(ftFirstTime);
		add(again);
		add(reservation);
		add(leftbutton);
		add(rightbutton);
		
		//�ؽ�Ʈ������ �߰�
		TextArea font=new TextArea();
		font.setBounds(0, 350, 600, 300);
		add(font);
		
		//�ѽ� ���� ���
		
		//RestaurantDto dto = Run.getRandomRestaurantByCategory2(data, "�߽�");

	

		
		
		
		 // for(int i=0;i<data.makeList().size();i++) { 
	
		
		
			Data data = new Data();
		  RestaurantDto dto=Run.getAllListRestaurant(data,page2);
		  font.append("�Ĵ��̸�: \t"+dto.getPlaceName()+"\n");
		  font.append("��ǥ�޴�: \t"+dto.getPlaceBest()+"\n");
		  font.append("�ּ�: \t\t"+dto.getAddressName()+"\n");
		  font.append("�����ּ�: \t"+dto.getPlaceUrl()+"\n"); 
		  font.setFont(new Font("����",Font.BOLD, 22));
		  
		  
		  
		  ImageIcon kFoodPhoto=new ImageIcon(dto.getImage()); 
		  JLabel kFphotoset=new JLabel(kFoodPhoto); 
		  kFphotoset.setSize(600,500);
		  kFphotoset.setLocation(-15,0); 
		  add(kFphotoset);
		  
		//  }
		 
		
		
		//��ư�׼�
		  
		
		//�ڷΰ���
		Backbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new ManualInfo2());
			}
		});
		
		//ó������
		ftFirstTime.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				page2=0;
				FrameBase.getDispose();
				FrameBase.getInstance(new Manual());
			}
		});
		
		//������
		rightbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				page2++;
				
				if(page2<data.makeList().size()&&page2>0) {
					
					FrameBase.getDispose();
					FrameBase.getInstance(new AllList());
				}else if(page2>data.makeList().size()){
					page2=data.makeList().size();
					
					JOptionPane.showMessageDialog(null, "�������������Դϴ�.");
					if(page2==data.makeList().size()) 
					{
						page2--;
						
					}
					
				}
				
				
			}
		});
		//����
		leftbutton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				left();
			}
		});
		
		//�����ϱ�
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
			JOptionPane.showMessageDialog(null, "ù��°�������Դϴ�.");
		}
	}


}
