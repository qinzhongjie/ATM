package ATM;
import java.util.*;
public class ATM_GO {
	public static void main(String[] args){
		int cc;
		ATM atm = new ATM();
		Scanner in = new Scanner(System.in);
		atm.check();
		while(true){
			System.out.println("1--����ѯ\n2--��Ҫȡ��\n3--��Ҫ���\n4--�޸�����\n������˳�ϵͳ");
			cc = in.nextInt();
			if(cc==1){
				//����ѯ
				atm.see();
			}
			else if(cc==2){
				//��Ҫȡ��
				atm.transfer();
			}
			else if(cc==3){
				//��Ҫ���
				atm.save();
			}
			else if(cc==4){
				//�޸�����
				atm.change();
			}
			else{
				//�˳�ϵͳ
				System.out.println("�Ѿ���ȫ�˳�ϵͳ");
				System.exit(0);
			}
		}
	}
}
