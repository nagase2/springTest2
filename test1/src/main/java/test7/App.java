package test7;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test7/beans/beans.xml");
		OffersDAO offersDao= (OffersDAO)context.getBean("offersDao123");
		
		
		try {
			/** Update data */
			Offer offer5 = new Offer(16,"ken","ken's Email!¥ll#¥¥¥#$%&'()0='.","My name is Kate");
			int updatedCnt = offersDao.update(offer5);
			System.out.println(updatedCnt+" Recoreds have been udpated.");
			
//			/** Create data */
//			Offer offer1 = new Offer("Dave","dave@a.com","this is dave");
//			Offer offer2 = new Offer("Karen","karen@a.com","this is Karen");
//			
//			if(offersDao.create(offer1)){
//				System.out.println("create offer object1");
//			}
//			if(offersDao.create(offer2)){
//				System.out.println("create offer object1");
//			}
//			
//			/** Delete data */
//			System.out.println("delete count="+ offersDao.delete(1333));

			/** Create with list */
			List<Offer> offersList = new ArrayList<Offer>();
			
			offersList.add(new Offer("Dave2","dave@tt.com","cash for software"));
			offersList.add(new Offer("Dave3","dave3@tt.com","cash for software3"));
			
			int[] rvals = offersDao.create(offersList);
			
			for(int value: rvals){
				System.out.println("Updated" + value + "rows.");
			}
			
			/** テーブルのデータを一覧表示 */
			List<Offer> offers = offersDao.getOffers();
			for(Offer offer: offers){
				System.out.println(offer);
			}
			
			/** テーブルのデータを検索して表示 */
			Offer offer = offersDao.getOffers(2);
			System.out.println("--->" + offer);
		} 
		catch (CannotGetJdbcConnectionException ex){
			System.out.println("Cannot get database connection.");
		}
		catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());

		}
		

		((ClassPathXmlApplicationContext)context).close();
	}

}
