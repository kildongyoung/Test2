package rnadomfoodVO;

import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import randomfRdation.AllList;

public class RestaurantDto {

    private String placeName;
    private String categoryName;
    private String categoryDetail;
    private String phone;
    private String addressName;
    private String placeBest;
    private String roadAddressName;
    private String placeUrl;
    private String id;
    private String image;
    private int pageNum;
    
    public void test(int b) {
		pageNum=b+1;

	}
    
    

    public RestaurantDto(String placeName, String categoryName, 
    		String categoryDetail, String phone, String addressName,
    		String placeBest, String roadAddressName, String placeUrl, 
    		String id,String image) {
        this.placeName = placeName;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;
        this.phone = phone;
        this.addressName = addressName;
        this.placeBest = placeBest;
        this.roadAddressName = roadAddressName;
        this.placeUrl = placeUrl;
        this.id = id;
        this.image=image;
        
       
    }

    public String getImage() {
		return image;
	}

	public void setImage(String image) {
		
		this.image = image;
	}

	public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getPlaceBest() {
        return placeBest;
    }

    public void setPlaceBest(String placeBest) {
        this.placeBest = placeBest;
    }

    public String getRoadAddressName() {
        return roadAddressName;
    }

    public void setRoadAddressName(String roadAddressName) {
        this.roadAddressName = roadAddressName;
    }

    public String getPlaceUrl() {
        return placeUrl;
    }

    public void setPlaceUrl(String placeUrl) {
        this.placeUrl = placeUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

	
   
    
	/*
	 * public void print() {
	 * 
	 * 
	 * TextArea st=new TextArea(); st.setSize(580,280); st.setLocation(0,375);
	 * 
	 * 
	 * this.str= "| ���� �̸� : " + placeName + "\t|"+ "| ī�װ� : " + categoryName +
	 * " > " + categoryDetail + "\t|" +"| �ּ� : " + roadAddressName + "\t|"
	 * +"| ��ǥ �޴� : " + placeBest + "\t|" +"| ���� ����ó : " + phone + "\t|"+ "| ��ũ : " +
	 * placeUrl + "\t|";
	 * 
	 * 
	 * System.out.println("| ���� �̸� : " + placeName + "\t|");
	 * System.out.println("| ī�װ� : " + categoryName + " > " + categoryDetail +
	 * "\t|"); System.out.println("| �ּ� : " + roadAddressName + "\t|");
	 * System.out.println("| ��ǥ �޴� : " + placeBest + "\t|");
	 * System.out.println("| ���� ����ó : " + phone + "\t|");
	 * System.out.println("| ��ũ : " + placeUrl + "\t|");
	 * 
	 * }
	 */
    

}
