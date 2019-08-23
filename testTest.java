package 崔员宁;

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
	public void test() {// 待测三角形的数目不能小于0
		int t[] = new int[] { 1 };// 存放错误代码，i不能小于1
		int arr[][] = new int[][] { { 0, 0, 0 } };// 存放三角形三条边
		int a[] = new int[] { 0 };// 存放输入个数
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test1() {// 三角形的三条边必须为正数
		int t[] = new int[] { 444 };
		int arr[][] = new int[][] { { 3, 4, -1 }, { 3, -4, 1 }, { -3, 4, 1 } };
		int a[] = new int[] { 3 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test2() {// 三角形的三条边必须满足任意两边之和大于第三边
		int t[] = new int[] { 333 };
		int arr[][] = new int[][] { { 2, 1, 1 }, { 1, 2, 1 }, { 1, 1, 2 } };
		int a[] = new int[] { 3 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test3() {// 待测三角形的数目必须在100以内
		int t[] = new int[] { 5 };
		int arr[][] = new int[][] {};
		int a[] = new int[] { 101 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

	@Test
	public void test4() {// 满足三角形
		int t[] = new int[] { 2 };
		int arr[][] = new int[][] { { 3, 4, 5 } };
		int a[] = new int[] { 1 };
		for (int i = 0; i < 1; i++) {
			assertEquals(t[i], T.sanjiaoxing(a[i], arr));
		}
	}

}
