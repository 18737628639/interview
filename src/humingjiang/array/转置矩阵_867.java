package humingjiang.array;

/**
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 *
 * 输入：[[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 * @author xmmm
 */
public class 转置矩阵_867 {

    public static void main(String[] args) {
        transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});
    }

    public static int[][] transpose(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0][];
        }
        int[][] result = new int[array[0].length][array.length];
        // 按列进行遍历原数组即可
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[j][i];
            }
        }
        return result;
    }
}
