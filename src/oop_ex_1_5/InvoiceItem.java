package oop_ex_1_5;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;

	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public void setQty(int qty) {
		this.qty = qty;

	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;

	}

	public String getID() {
		return id;

	}

	public String getDesc() {
		return desc;
	}

	public int getQty() {
		return qty;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double getTotal() {
		double total = qty * unitPrice;
		return total;
	}

	public String toString() {
		return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
	}

}
