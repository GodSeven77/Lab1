package ��Ա��;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class testTest {
	private test T;

	@Before
	public void setUp() throws Exception {
		T = new test();
	}

	@Test
	public void test() {// ���������ε���Ŀ����С��0
		int t[] = new int[] { 1 };// ��Ŵ�����룬i����С��1
		int arr[][] = new int[][] { { 0, 0, 0 } };// ���������������
		int a[] = new int[] { 0 };// ����������
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test1() {// �����ε������߱���Ϊ����
		int t[] = new int[] { 444 };
		int arr[][] = new int[][] { { 3, 4, -1 }, { 3, -4, 1 }, { -3, 4, 1 } };
		int a[] = new int[] { 3 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test2() {// �����ε������߱���������������֮�ʹ��ڵ�����
		int t[] = new int[] { 333 };
		int arr[][] = new int[][] { { 2, 1, 1 }, { 1, 2, 1 }, { 1, 1, 2 } };
		int a[] = new int[] { 3 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test3() {// ���������ε���Ŀ������100����
		int t[] = new int[] { 5 };
		int arr[][] = new int[][] {};
		int a[] = new int[] { 101 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test4() {// ����������
		int t[] = new int[] { 2 };
		int arr[][] = new int[][] { { 3, 4, 5 } };
		int a[] = new int[] { 1 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

}
