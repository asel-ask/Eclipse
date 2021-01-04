package assignments.assign_14.question14;
import java.util.ArrayList;
import java.util.List;
public class TJMaxx {

	 private List<Item> regularItems; 
	 private List<OnSaleItem> onSaleItems;
	 public TJMaxx() {
		ArrayList<Item> item=new ArrayList<>();
		ArrayList<OnSaleItem> onSaleItem=new ArrayList<>();
	 }
	 
	 public void addRegularItem(Item item) {
		 regularItems.add(item);
	 }
	 public void addOnSaleItem(OnSaleItem item) {
		 addOnSaleItem(item);
	 }
	 public List<Item> getRegularItems() {
		 	return regularItems;   
	 }
	 public List<OnSaleItem> getOnSaleItems() {
		 return onSaleItems;  
	}
	 public int regularItemsCount() {     
		 	return -1;	 }
}
