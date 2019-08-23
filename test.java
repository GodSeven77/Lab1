package 崔员宁;

public class test {

	public int sanjiaoxing(int x, int arr[][])// (三角形的个数，三角形的三条边)
	{
		int a[][] = new int[100][3];// 存放输入的三角形
		int n = x;
		if (n < 0 || n == 0) {
			return 1;// 三角形的个数必须为正数
		} else {
			if (n < 100 || n == 100) {// 三角形的个数不能超过100
				int r = 0;// 存放返回结果
				for (int i = 0; i < x; i++) {
					for (int j = 0; j < 3; j++) {
						a[i][j] = arr[i][j];
					}
					if (a[i][0] > 0 && a[i][1] > 0 && a[i][2] > 0) {// 三角形三条边必须为正数
						if (a[i][0] + a[i][1] > a[i][2] && a[i][0] + a[i][2] > a[i][1] && a[i][2] + a[i][1] > a[i][0]) {// 满足两边之和大于第三边
							r = r * 10 + 2;
						} else {
							r = r * 10 + 3;// 不能构成三角形
						}
					} else {
						r = r * 10 + 4;// 三角形的边不能为负值
					}
				}
				return r;
			} else {
				return 5;// 被测三角形的个数不能超过100
			}
		}
	}
}
