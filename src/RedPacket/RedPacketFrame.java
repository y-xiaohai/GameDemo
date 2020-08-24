package RedPacket;

import javax.swing.JFrame;

public class RedPacketFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	/* ownerName : 群主名称 */
	public String ownerName = "谁谁谁谁";
	/* openMode : 红包的类型 [普通红包/手气红包] */
	public OpenMode openMode = null;
	
	/**
	* 构造方法:生成红包界面.
	*/
	public RedPacketFrame(String title) {
		super(title);
		init();// 页面相关的初始化操作
	}
	/* set方法 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setOpenMode(OpenMode openMode) {
		this.openMode = openMode;
	}
	
	void init(){
		
	}
}
