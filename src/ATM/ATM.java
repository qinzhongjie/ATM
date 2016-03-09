package ATM;
import java.util.Scanner;
public class ATM {
	private int username = 123456;
	private int password = 123456;
	private int money = 1000;
	int username1;
	int password1;
	Scanner sc = new Scanner(System.in);

	
	
	//验证登录
	public void check(){
		System.out.println("欢迎使用ATM系统--\n-------------");
		System.out.println("请输入卡号：");
		username1 = sc.nextInt();
		System.out.println("请输入密码：");
		password1 = sc.nextInt();
		for(int i=0; i<2; i++){
			if(username1==getUsername()&&password1==getPassword()){
				System.out.println("登录成功！");
				break;
			}else{
				System.out.println("您的输入有误，请重新输入:");
				System.out.println("请输入卡号：");
				username1 = sc.nextInt();
				System.out.println("请输入密码：");
				password1 = sc.nextInt();
				if(i==1){
					System.out.println("您的机会已经用完，已退出系统");
					System.exit(0);
				}
			}
		}
	}
	
	
	//余额查询
	public void see(){
		System.out.println("您目前的可用余额为"+getMoney()+"元");
	}
	
	//我要取款
	public void transfer(){
		System.out.println("请输入您要取款的数目：");
		int money1 = sc.nextInt();
		if(money1%100==0&&money1<=getMoney()){
			setMoney((getMoney()-money1));
			System.out.println("取款成功！");
		}else{
			System.out.println("取款失败!\n最少只能取100元！");
		}
	}
	
	//我要存款
	public void save(){
		System.out.println("请输入您要存款的数目：");
		int money2 = sc.nextInt();
		if(money2<0){
			System.out.println("不能出现负存款");
		}else{
			setMoney(getMoney()+money2);
		}
	}
	
	//修改密码
	public void change(){
		System.out.println("请输入新密码：");
		int password2 = sc.nextInt();
		System.out.println("请再输入一次：");
		int password3 = sc.nextInt();
		if(password2==password3){
			setPassword(password3);
			System.out.println("密码修改成功！");
		}else{
			System.out.println("两次输入不一致，操作失败！");
		}
	}
	
	//封装成员变量
	public void setUsername(int username){
		this.username = username;
	}
	public int getUsername(){
		return this.username;
	}
	public void setPassword(int password){
		this.password = password;
	}
	public int getPassword(){
		return this.password;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return this.money;
	}
}
