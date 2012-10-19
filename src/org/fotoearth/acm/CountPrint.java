package org.fotoearth.acm;

/*
 * 有编号1~100个灯泡，起初所有的灯都是灭的。有100个同学来按灯泡开关，如果灯是亮的，那么按过开关之后，
 * 灯会灭掉。如果灯是灭的，按过开关之后灯会亮。
 * 现在开始按开关。
 * 第1个同学，把所有的灯泡开关都按一次(按开关灯的编号： 1,2,3,......100)。
 * 第2个同学，隔一个灯按一次(按开关灯的编号： 2,4,6,......,100)。
 * 第3个同学，隔两个灯按一次(按开关灯的编号： 3,6,9,......,99)。
 * ......
 * 问题是，在第100个同学按过之后，哪几盏灯是亮着的？
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
