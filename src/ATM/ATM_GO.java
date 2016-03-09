package ATM;
import java.util.*;
public class ATM_GO {
	public static void main(String[] args){
		int cc;
		ATM atm = new ATM();
		Scanner in = new Scanner(System.in);
		atm.check();
		while(true){
			System.out.println("1--余额查询\n2--我要取款\n3--我要存款\n4--修改密码\n任意键退出系统");
			cc = in.nextInt();
			if(cc==1){
				//余额查询
				atm.see();
			}
			else if(cc==2){
				//我要取款
				atm.transfer();
			}
			else if(cc==3){
				//我要存款
				atm.save();
			}
			else if(cc==4){
				//修改密码
				atm.change();
			}
			else{
				//退出系统
				System.out.println("已经安全退出系统");
				System.exit(0);
			}
		}
	}
}
