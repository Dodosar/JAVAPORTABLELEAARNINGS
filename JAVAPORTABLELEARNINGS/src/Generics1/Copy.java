package Generics1;

import java.util.List;

public class Copy {

	public Copy() {
		// TODO Auto-generated constructor stub
	}
	public void copy(List<? extends Product> src, List<? super Product> dest){ 
		/*
		 * super this wildcard(reserved word) 
		 * extends - ����������� ������
		 * super - ����������� �����
		 * IN - ��������: �������������� �������� - extends
		 * OUT - ��������: ��������� �������� - super
		 * ���� �� In ����� ���������� ������ ������ Object , ����� ����������� ?
		 * ���� ��������� ������������ in and out  ��  �� ������������ wildcard
		 */
		for (Product p : src){
			dest.add(p);
		}
	}
}
