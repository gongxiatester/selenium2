package wuziqi;

public class paihangbang {
	
	private int jushu;
	private int bushu;
	private String jieguo;
	public int getJushu() {
		return jushu;
	}
	public void setJushu(int jushu) {
		if(jushu<1){
			this.jushu = 1;
		}
		this.jushu = jushu;
	}
	public int getBushu() {
		return bushu;
	}
	public void setBushu(int bushu) {
		this.bushu = bushu;
	}
	public String getJieguo() {
		return jieguo;
	}
	public void setJieguo(String jieguo) {
		this.jieguo = jieguo;
	}
}
