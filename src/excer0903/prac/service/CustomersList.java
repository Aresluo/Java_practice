package excer0903.prac.service;

import excer0903.prac.bean.Customer;
import excer0903.prac.tool.CMUtility;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Aresluo
 * @Date: 2020/09/03/19:46
 * @Description: test
 */
public class CustomersList {
	private Customer[] customers;
	private int total;
	private CMUtility cmu = new CMUtility();

	public CustomersList() {
	}

	public CustomersList(int mount){
		customers = new Customer[mount];
	}

	public boolean addCustomer(){
		if(customers == null && total >= customers.length){
			System.out.println("---------账户目录不存在或已满，添加失败！----------");
			return  false;
		}
		else{
			System.out.print("请输入用户姓名：");
			String name =  CMUtility.readString(15);
			System.out.print("请输入用户年龄：");
			int age = cmu.readInt();
			System.out.print("请输入用户邮箱：");
			String email = cmu.readString(30);
			System.out.print("请输入用户电话号码：");
			String phoneNumber= cmu.readString(15);
			customers[total++] = new Customer(name, age, email, phoneNumber);
			System.out.println("---------------------添加完成---------------------");
			return true;
		}


	}

	public boolean delCustomer(int index){
		if((index-1<0 || total <index) || customers == null){
			System.out.println("序号错误或用户列表不存在，删除失败！");
			return  false;
		}
		else{
			System.out.print("确认是否删除(Y/N)：");
			char c = cmu.readConfirmSelection();
			if(c == 'Y'){
				for(int i = index-1;i < total-1; ){
					customers[i] = customers[++i];
				}
				customers[--total] = null;
				System.out.print("---------------------删除完成---------------------\n");
				return true;
			}
			else return false;


		}

	}

	public boolean editCustomer(int index){
		if((index-1<0 || total < index) || customers  == null){
			System.out.println("序号错误，修改失败！");
			return  false;
		}
		else{
			System.out.print("请输入用户姓名：");
			String name =  cmu.readString(15,customers[index-1].getName());
			System.out.print("请输入用户年龄：");
			int age = cmu.readInt(customers[index-1].getAge());
			System.out.print("请输入用户邮箱：");
			String email = cmu.readString(30, customers[index-1].getEmail());
			System.out.print("请输入用户电话号码：");
			String phoneNumber= cmu.readString(15,customers[index-1].getPhoneNumbet());
			customers[index-1] = new Customer(name, age, email, phoneNumber);       //会产生多余垃圾

			/**
			 * 下述方法在原对象上修改则可能会发生异常退出时数据被修改一部分
			 *   			customers[index-1].setAge(age);
			 * 			customers[index-1].setName(name);
			 * 			customers[index-1].setEmail(email);
			 * 			customers[index-1].setPhoneNumbet(phoneNumber);
			 */
		}
		return true;
	}

	public boolean getCustomer(int index){
		if((index-1<0 || total <index) || customers == null){
			System.out.println("序号错误或用户列表不存在，查询失败！");
			return  false;
		}
		else{
			System.out.printf( index+"\t\t\t"+customers[index-1].getName() +"\t\t\t"+customers[index-1].getAge() +"\t\t\t"+customers[index-1].getPhoneNumbet() +"\t\t\t"+customers[index-1].getEmail() + "\n");
			return true;
		}

	}

	public void getCustomers(){
		if(total == 0 || customers == null){
			System.out.println("用户列表不存在或为空 ！");

		}
		else{
			for(int i = 1; i <= total ; i ++){
				getCustomer(i);
			}
		}

	}

}
