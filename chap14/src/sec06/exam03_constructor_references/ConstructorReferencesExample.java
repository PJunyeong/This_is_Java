package sec06.exam03_constructor_references;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member :: new;
		// Member ��ü�� �����Ѵ�. �Ű����� String�� �Ķ���ͷ� ������ ������ new�� ȣ��ȴ�.
		Member member1 = function1.apply("angel");
		//Member(String id) ����
		BiFunction<String, String, Member> function2 = Member :: new;
		// Member ��ü�� ������ ��, �Ķ���� String String�� ������ ȣ��ȴ�.
		Member member2 = function2.apply("�̸�", "angel");
		// Member(String name, String id) ����
	}

}
