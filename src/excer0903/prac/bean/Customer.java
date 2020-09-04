package excer0903.prac.bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Yourname
 * @Date: 2020/09/03/19:48
 * @Description:
 */
public class Customer {
	private  String name;
	private int age;
	private String email;
	private String phoneNumbet;

	public Customer() {
	}

	public Customer(String name, int age, String email, String phoneNumbet) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNumbet = phoneNumbet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumbet() {
		return phoneNumbet;
	}

	public void setPhoneNumbet(String phoneNumbet) {
		this.phoneNumbet = phoneNumbet;
	}
}
