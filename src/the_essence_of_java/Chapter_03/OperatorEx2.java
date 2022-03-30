package the_essence_of_java.Chapter_03;

class OperatorEx2 {
	public static void main(String args[]) {
		int i=5, j=0;

		j = i++;
		System.out.println("j=i++; ���� ��, i=" + i +", j="+ j);

		i=5;         // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;

		j = ++i;
		System.out.println("j=++i; ���� ��, i=" + i +", j="+ j);
	}
}
