package RedPacket;

import java.util.ArrayList;

//������ͽӿ�
public interface OpenMode {
	/**
	* @param totalMoney �ܽ��,��λ��"��"���ܽ��Ϊ�������,�Ѿ�ת��Ϊ����,��λΪ�֡�
	* @param count �������
	* @return ArrayList<Integer> Ԫ��Ϊ��������Ľ��ֵ,����Ԫ�ص�ֵ�ۺ͵����ܽ��.
	*
	* �뽫totalMoney,�ֳ�count��,���浽ArrayList<Integer>��,���ؼ���.
	* �������ķ���
	*/
	public abstract ArrayList<Integer> divide(int totalMoney, int count);
}
