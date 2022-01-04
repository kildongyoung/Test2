package rnadomfoodVO;



import java.awt.Image;
import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Run {

    /**
     * 사이즈 중에서 랜덤 번호 추출
     * @param size
     * @return
     */
    public static int getRandomNumber(int size){
        return new Random().nextInt(size);
    }

    /**
     * 랜덤 레스토랑 데이터 추출
     * @param data
     * @return 
     */
   /* public static  void getRandomRestaurant(Data data){
        int i = getRandomNumber(data.makeList().size());
        data.makeList().get(i);.print();
    }
    */
   
    
    public static  RestaurantDto getRandomRestaurant(Data data){
    	
    	int i = getRandomNumber(data.makeList().size());
    	
    	 
        return data.makeList().get(i);
    }
    
    public static  RestaurantDto getAllListRestaurant(Data data ,int a){
    	
    	JPanel j=new JPanel();
    	
    	ImageIcon popcon = new ImageIcon();
		JLabel lblPopcon = new JLabel(popcon);
		lblPopcon.setSize(600, 280);
		lblPopcon.setLocation(0, 0);
		j.add(lblPopcon);
    	
    	
    	return data.makeList().get(a);
    }
    
    
    

    /**
     * 카테고리별 레스토랑 데이터 추출
     * @param data
     * @param category
     * @return
     */
    public static RestaurantDto getRandomRestaurantByCategory2(Data data, String category) {

        ArrayList<RestaurantDto> categorys = new ArrayList<>();
        for (int i = 0; i < data.makeList().size(); i++) {
            if (data.makeList().get(i).getCategoryName().equals(category)) {
                categorys.add(data.makeList().get(i));
            }
        }
        int num = getRandomNumber(categorys.size());
        RestaurantDto restaurantDto = categorys.get(num);
        return restaurantDto;
    }
	/*
	 * public static void getRandomRestaurantByCategory(Data data, String category)
	 * {
	 * 
	 * ArrayList<RestaurantDto> categorys = new ArrayList<>(); for (int i = 0; i <
	 * data.makeList().size(); i++) { if
	 * (data.makeList().get(i).getCategoryName().equals(category)) {
	 * categorys.add(data.makeList().get(i)); } } int num =
	 * getRandomNumber(categorys.size()); categorys.get(num).print(); }
	 */
    
    

    /**
     * run
     * @param args
     */
	/*
	 * public static void main(String[] args) {
	 * 
	 * Data data = new Data(); Scanner scan = new Scanner(System.in); boolean run =
	 * true; int i;
	 * 
	 * while (run) { System.out.println(SYSTEM_START); System.out.print(SELECT); i =
	 * scan.nextInt();
	 * 
	 * if (i == 1) { System.out.println(MENE); System.out.print(SELECT); i =
	 * scan.nextInt(); if (i == 1) { getRandomRestaurantByCategory(data, KOREAN); }
	 * else if (i == 2) { getRandomRestaurantByCategory(data, CHINESE); } else if (i
	 * == 3) { getRandomRestaurantByCategory(data, JAPANESE); } else if (i == 4) {
	 * getRandomRestaurantByCategory(data, WESTERN); } else if (i == 5) {
	 * System.out.println(SHUT_DOWN); run = false; } else {
	 * System.out.println(ERROR); } System.out.println(INFO_TXT); }else if(i==2) {
	 * getRandomRestaurant(data); } else if(i==3) { System.out.println(SHUT_DOWN);
	 * run=false; } else { System.out.println(ERROR); } } }
	 */
}