package windowProgramming;

public class Window {
	//Ŭ���� ����
	private int width;
	private int height;
	private boolean isVisible; //���̴°�?
	private int top; //��ǥ ���ʿ��� �Ÿ�
	private int left; //��ǥ ���ʿ��� �Ÿ�
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
}
