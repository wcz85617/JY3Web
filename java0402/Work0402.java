import java.util.*;
public class Work0402
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入要转换的数字/字符:");
		//定义char转换int方法
		String num = scanner.next();
		//charAt 根据指定的索引返回char类型的值
		char specialChar = num.charAt(0);
		int result = f(specialChar);
		System.out.print("转换后的字符为:"+result);


		//定义int转换char方法
		//int num = scanner.nextInt();
		//char c = getIntToChar(num);
		//System.out.print("转换后的字符为:"+c);
		//开方
		//Math.sqrt();

	}
	//定义int转换char方法
	//public static char getIntToChar(int num)
	//{
		//return (char)num;
	//}
	public static int f(char c)
	{
		return c;
	
	}
	




}