package ATM;
import java.util.Scanner;
public class ATM {
	private int username = 123456;
	private int password = 123456;
	private int money = 1000;
	int username1;
	int password1;
	Scanner sc = new Scanner(System.in);

	
	
	//��֤��¼
	public void check(){
		System.out.println("��ӭʹ��ATMϵͳ--\n-------------");
		System.out.println("�����뿨�ţ�");
		username1 = sc.nextInt();
		System.out.println("���������룺");
		password1 = sc.nextInt();
		for(int i=0; i<2; i++){
			if(username1==getUsername()&&password1==getPassword()){
				System.out.println("��¼�ɹ���");
				break;
			}else{
				System.out.println("����������������������:");
				System.out.println("�����뿨�ţ�");
				username1 = sc.nextInt();
				System.out.println("���������룺");
				password1 = sc.nextInt();
				if(i==1){
					System.out.println("���Ļ����Ѿ����꣬���˳�ϵͳ");
					System.exit(0);
				}
			}
		}
	}
	
	
	//����ѯ
	public void see(){
		System.out.println("��Ŀǰ�Ŀ������Ϊ"+getMoney()+"Ԫ");
	}
	
	//��Ҫȡ��
	public void transfer(){
		System.out.println("��������Ҫȡ�����Ŀ��");
		int money1 = sc.nextInt();
		if(money1%100==0&&money1<=getMoney()){
			setMoney((getMoney()-money1));
			System.out.println("ȡ��ɹ���");
		}else{
			System.out.println("ȡ��ʧ��!\n����ֻ��ȡ100Ԫ��");
		}
	}
	
	//��Ҫ���
	public void save(){
		System.out.println("��������Ҫ������Ŀ��");
		int money2 = sc.nextInt();
		if(money2<0){
			System.out.println("���ܳ��ָ����");
		}else{
			setMoney(getMoney()+money2);
		}
	}
	
	//�޸�����
	public void change(){
		System.out.println("�����������룺");
		int password2 = sc.nextInt();
		System.out.println("��������һ�Σ�");
		int password3 = sc.nextInt();
		if(password2==password3){
			setPassword(password3);
			System.out.println("�����޸ĳɹ���");
		}else{
			System.out.println("�������벻һ�£�����ʧ�ܣ�");
		}
	}
	
	//��װ��Ա����
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
