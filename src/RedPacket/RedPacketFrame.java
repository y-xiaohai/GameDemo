package RedPacket;

import javax.swing.JFrame;

public class RedPacketFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	/* ownerName : Ⱥ������ */
	public String ownerName = "˭˭˭˭";
	/* openMode : ��������� [��ͨ���/�������] */
	public OpenMode openMode = null;
	
	/**
	* ���췽��:���ɺ������.
	*/
	public RedPacketFrame(String title) {
		super(title);
		init();// ҳ����صĳ�ʼ������
	}
	/* set���� */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setOpenMode(OpenMode openMode) {
		this.openMode = openMode;
	}
	
	void init(){
		
	}
}
