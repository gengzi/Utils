package club.gsjblog.utils.test;

// 为了直接使用方法，直接导入静态的包
import static club.gsjblog.utils.Print.*;

import java.io.PrintStream;

import org.junit.Test;

public class PrintTest {

	@Test
	public void fun01() throws InterruptedException {
		print();
		print("hello world");
		printb("不换行的 hello world");
		String format = "%s";
		printf(format, "<<<hello world");
		PrintStream printf = printf("我的年龄是  %d", 1111);
	}

}
