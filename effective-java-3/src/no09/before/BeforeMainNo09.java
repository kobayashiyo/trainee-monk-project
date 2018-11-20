package no09.before;

public class BeforeMainNo09 {
	public static void main(String[] args) {
		System.out.println("hello No.09");

		try {
			System.out.println("--- example01");
			example01();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("--- example02");
			example02();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			System.out.println("--- example02ext");
			example02ext();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 問題01:in.read()の例外をfinally句の例外が隠蔽してしまう
	 */
	public static void example01() {
		FileInputStream in = new FileInputStream("example01 input!");
		try {
			in.read(); //実は最初にexception投げてるのこいつだよ
			System.out.println("example01 execute !!!!");
		} finally {
			in.close();
		}
	}

	/**
	 * 問題02:out.close()で例外が発生するとin.close()が呼ばれないので開放漏れする
	 */
	public static void example02() {
		FileInputStream in = new FileInputStream("example02 input!");
		FileOutputStream out = new FileOutputStream("example02 output!");
		try {
			in.read();
			out.write();
			System.out.println("example02 execute !!!!");
		} finally {
			out.close();
			in.close(); //こいつ呼ばれないので開放漏れするよ
		}
	}

	/**
	 * 問題02:out.close()で例外が発生するとin.close()が呼ばれないので開放漏れするのを考慮したtry-catchにすると面倒
	 */
	public static void example02ext() {
		FileInputStream in = new FileInputStream("example02ext input!");
		try {
			FileOutputStream out = new FileOutputStream("example02ext output!");
			try {
				in.read();
				out.write();
				System.out.println("example02ext execute !!!!");
			} finally {
				out.close();
			}
		} finally {
			in.close(); //こいつも呼ばれるよ
		}
	}
}
