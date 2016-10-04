/*
��Ҫһ������used��������Ƶ�iλΪ1��ʾ����i���ֹ����տ�ʼ���Ǳ���1��9��
����ÿ�������������֣�����used�б���Ѿ����ֹ���Ȼ���ڵ��õݹ麯����
�ڵݹ麯���У�����������С�����ֵ������res����1�����򷵻�res��
Ȼ�����0��9�������ǰ����û����used�г��ֹ�����ʱ��used�б�ǣ�
Ȼ�����ǰ���ֳ���10����i���ټ������õݹ麯�����������ǿ��Ա��������е������
�μ��������£�
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