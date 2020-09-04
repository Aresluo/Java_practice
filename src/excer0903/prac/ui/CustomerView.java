package excer0903.prac.ui;

import excer0903.prac.service.CustomersList;
import excer0903.prac.tool.CMUtility;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Yourname
 * @Date: 2020/09/03/19:47
 * @Description:
 */
public class CustomerView {

	private static CMUtility pic = new CMUtility();
	private static CustomersList customerss = new CustomersList(10);
	public static void main(String[] args){

		boolean runFlag = true;

		while(runFlag){
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("\t\t\t\t\t1 添 加 客 户");
			System.out.println("\t\t\t\t\t2 修 改 客 户");
			System.out.println("\t\t\t\t\t3 删 除 客 户-");
			System.out.println("\t\t\t\t\t4 客 户 列 表");
			System.out.println("\t\t\t\t\t5 退           出");
			System.out.print("\n\t\t请选择(1-5)：");
			char mainMenuSelection = pic.readChar();
			switch (mainMenuSelection){
				case '1' :
					System.out.println("---------------------添加客户---------------------");
					customerss.addCustomer();
					break;
				case '2' :
					System.out.print("---------------------修改客户---------------------\n" +"请选择待修改客户编号(-1退出):");
					int index_1 = pic.readInt();
					if(index_1 == -1)break;
					else{
						customerss.editCustomer(index_1);
						break;
					}

				case '3' :
					System.out.print("---------------------删除客户---------------------\n " + "请选择待删除客户编号(-1退出)：");
					int index_2 = pic.readInt();
					if(index_2 == -1)break;
					else{
						customerss.delCustomer(index_2);
						break;
					}

				case '4' :
					System.out.printf("编号\t\t\t"+"姓名 \t\t\t"+"年龄\t\t\t"+ "电话\t\t\t"+"邮箱\t\t\t"+ "\n"	);
					customerss.getCustomers();
					break;
				case '5' :
					runFlag = false;
					break;
				default :
					System.out.println("错误输入，重试 ！！");
			}








		}
	}

}
