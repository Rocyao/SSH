package entity;

public class NewTitle {
	private int id;            
	private String titleName;  //标题
	private String creater;    //作者
	public NewTitle() {
	}
	public NewTitle(int id, String titleName, String creater) {
		this.id = id;
		this.titleName = titleName;
		this.creater = creater;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	@Override
	public String toString() {
		return "NewTitle [id=" + id + ", titleName=" + titleName + ", creater=" + creater + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	//重写equals()方法
	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; NewTitle other = (NewTitle) obj; if (id != other.id) return false;
	 * return true; }
	 */
	
	
	
}
