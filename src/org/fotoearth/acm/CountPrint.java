package org.fotoearth.acm;

/*
 * �б��1~100�����ݣ�������еĵƶ�����ġ���100��ͬѧ�������ݿ��أ�����������ģ���ô��������֮��
 * �ƻ���������������ģ���������֮��ƻ�����
 * ���ڿ�ʼ�����ء�
 * ��1��ͬѧ�������еĵ��ݿ��ض���һ��(�����صƵı�ţ� 1,2,3,......100)��
 * ��2��ͬѧ����һ���ư�һ��(�����صƵı�ţ� 2,4,6,......,100)��
 * ��3��ͬѧ���������ư�һ��(�����صƵı�ţ� 3,6,9,......,99)��
 * ......
 * �����ǣ��ڵ�100��ͬѧ����֮���ļ�յ�������ŵģ�
 */

public class CountPrint {
	
	private static Boolean[] data;

	public CountPrint() {
		setData(new Boolean[100]);
	}

	public static void main(String[] args) throws Exception {

		CountPrint data = new CountPrint();
		Boolean[] all = data.getData();

		for (int i = 0; i < 100; i++) {
			all[i] = true;
		}

		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < 100; i++) {
				if ((i + 1) % (j + 1) == 0) {
					all[i] = turn(all[i]);
				}
			}
			printC(all);
		}
	}

	private static Boolean turn(Boolean bool) {
		if (bool) {
			return false;
		} else {
			return true;
		}
	}

	private static void printC(Boolean[] all) {
		String data = "";
		// print
		for (int i = 0; i < 100; i++) {
			if (!all[i]) {
				data += (i + 1);
				if (i != 99) {
					data += " ";
				}
			}
		}
		System.out.println(data);
	}

	private void setData(Boolean[] data) {
		CountPrint.data = data;
	}

	public Boolean[] getData() {
		return data;
	}

}
