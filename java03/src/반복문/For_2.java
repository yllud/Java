package 반복문;

import javax.swing.JOptionPane;

public class For_2 {

	public static void main(String[] args) {
		for (; ;) { //臾댄븳 猷⑦봽(諛섎났) , while(true)
			System.out.println("�옒�벐吏� �븡�쓬.");
			String data = JOptionPane.showInputDialog("醫낅즺�븷源뚯슂?? y瑜� �엯�젰");
			//== �뿰�궛�옄�뒗 湲곕낯�뜲�씠�꽣留� 鍮꾧탳 媛��뒫
			//String遺��뭹�뿉�꽌 �젣怨듯븯�뒗 湲곕뒫�쓣 �궗�슜�빐�꽌 鍮꾧탳�빐二쇱뼱�빞 �븿.
			if (data.equals("y")) { //true!�씠硫�
				System.out.println("�븞�뀞�엳媛��꽭�슂!!!");
				break; //for臾몄쓽 break!안녕
			} 
		}
	}
}
