/*
需要一个数组used，其二进制第i位为1表示数字i出现过，刚开始我们遍历1到9，
对于每个遍历到的数字，现在used中标记已经出现过，然后在调用递归函数。
在递归函数中，如果这个数字小于最大值，则结果res自增1，否则返回res。
然后遍历0到9，如果当前数字没有在used中出现过，此时在used中标记，
然后给当前数字乘以10加上i，再继续调用递归函数，这样我们可以遍历到所有的情况，
参见代码如下：
*/

int countNumberWithUniqueDigits2(int n){
	if (n > 10) {
		return countNumberWithUniqueDigits2(10);
	}
	int count = 1; // x == 0
	long max = (long) Math.pow(10, n);

	boolean[] used = new boolean[10];

	for (int i = 1; i < 10; i++) {
		used[i] = true;
		count += search(i, max, used);
		used[i] = false;
	}

	return count;
}
int search(long prev, long max, boolean[] used) {
	int count = 0;
	if (prev < max) {
		count += 1;
	} else {
		return count;
	}

	for (int i = 0; i < 10; i++) {
		if (!used[i]) {
			used[i] = true;
			long cur = 10 * prev + i;
			count += search(cur, max, used);
			used[i] = false;
		}
	}

	return count;
 }