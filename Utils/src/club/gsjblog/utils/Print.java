package club.gsjblog.utils;

import java.io.PrintStream;

/**
 * print 输出工具类
 * @author gengzi
 * @time 2018年3月8日09:15:11
 *
 */
public class Print {
	/**
	 * 输出一个新行
	 * @param obj
	 */
	public static void print(Object obj) {
		System.out.println(obj);
	}

	/**
	 * 输出一个空行
	 */
	public static void print() {
		System.out.println();
	}

	/**
	 *  输出不换行
	 * @param obj
	 */
	public static void printb(Object obj) {
		System.out.print(obj);
	}

	/**
	 *<p> printf<p> 
	 * <p>可以与python 中的 print 进行对比
	 * <p><<<<<<<<<<<<<<< 说明>>>>>>>>>>>>>>                           <P>
	 * <p> format：  "%"表示进行格式化输出，"%"之后的内容为格式的定义。<P>
	 * <p> printf("%s", str);// "s"表示输出字符串                      <P>
	 * <p> printf("%f", f);// "f"表示格式化输出浮点数                  <P>
	 * <p> printf("%9.2f", f);// "9.2"中的9表示输出的长度，2表示小数点后的位数<P>
	 * <p> printf("%+9.2f", f);// "+"表示输出的数带正负号              <P>
	 * <p> printf("%-9.4f", f);// "-"表示输出的数左对齐（默认为右对齐）<P>
	 * <p> printf("%+-9.3f", f);// "+-"表示输出的数带正负号且左对齐    <P>
	 * <p> printf("%d", d);// "d"表示输出十进制整数                    <P>
	 * <p> printf("%o", d);// "o"表示输出八进制整数                    <P>
	 * <p> printf("%x", d);// "x"表示输出十六进制整数                  <P>
	 * <p> printf("%#x", d);// "#x"表示输出带有十六进制标志的整数      <P>
	 * <p> printf("%#o", d);// "#o"表示输出带有八进制标志的整数        <P>
	 * <p>                                                             <P>
	 * <p> 可以输出多个变量，注意顺序。                                <P>
	 * <p> printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s", f, d, str);<P>
	 * <p> "X$"表示第几个变量。比如 1$ 表示第一个变量                  <P>
	 * <p> printf("字符串：%2$s，%1$d的十六进制数：%1$#x", d, str);    <P>
	 * <p>                                                             <P>
	 * <p>                                                             <P>
	 * <p><<<<<<<<<<<<<<< 结束>>>>>>>>>>>>>>                           <P>
	 * @param format 格式化str
	 * @param args 数组
	 * @return 格式化后的输出
	 */
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}

}
