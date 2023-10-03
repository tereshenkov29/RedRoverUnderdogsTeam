import com.google.common.primitives.Ints;

import java.util.*;

public class Main {
        public static String OddEven(int a) {
        String result = "Undefined";
        if (a % 2 == 0) {
            result = "Even";
            return result;
        } else if (a % 2 !=0){
            result = "Odd";
            return result;
        }
        else return result;
    }
    public static int[] OddIndices(int[] array) {
        List<Integer> oddArr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                oddArr.add(array[i]);
            }
        }
        int[] ints = Ints.toArray(oddArr);
        return ints;
    }

    public static int SumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int BiggerValue(int a, int b) {
        return (a > b) ? a : b;
    }

    public static boolean IsPositiveNumber(int a) {
        return (a >= 0) ? true : false;
    }

    public static int AreNumbersEqual(int a, int b) {
        int areEqual = 0;
        if (a == b) {
            areEqual = 0;
        } else if (a < b) {
            areEqual = -1;
        } else if (a > b) {
            areEqual = 1;
        }
        return areEqual;
    }

    public static String M(int m) {
        String value = "";
        if (m == 0) {
            value = "-1";
        } else if (m % 3 == 0 && m % 5 != 0) {
            value = "Bad Number";
        } else if (m % 5 == 0 && m % 3 != 0) {
            value = "Poor Number";
        } else if (m % 5 == 0 && m % 3 == 0) {
            value = "Good Number";
        } else value = "-1";
        return value;
    }

    public static int[] MinMaxAve(int[] arr, int a, int b) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ave = 0;
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = a; i <= b; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = a; i <= b; i++) {
            ave += arr[i];
            count++;
        }
        ave = ave / count;

        int[] ints = {min, max, ave};
        return ints;
    }

    public static int[] Intersection(int[] a, int[] b) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    arrayList.add(a[i]);
                }
            }
        }
        int[] ints = Ints.toArray(arrayList);
        return ints;
    }

    ///!!!!!!!!!!!!!!
    public static int[] PeakElement(int[] a) {
        List<Integer> arrayList = new ArrayList<>();
        if (a[0] > a[1]) {
            arrayList.add(a[0]);
        }
        for (int j = 1; j < a.length - 1; j++) {
            if (a[j] > a[j + 1] && a[j] > a[j - 1]) {
                arrayList.add(a[j]);
            }
        }
        int[] ints = Ints.toArray(arrayList);
        return ints;
    }  //!!!!!!!!!!!!!!!!!!1

    public static int[] ReverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = b;
        }
        return a;
    }

    public static int[] SortArray(int[] a) {
        Arrays.sort(a);
        return a;
    }

    public static int KthLargest(int[] a, int b) {
        Integer[] arr = new Integer[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[b - 1];
    }

    public static int[] NegativeOnTheRight(int[] arrInt) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arrNeg = new ArrayList<>();
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < 0) {
                arrNeg.add(arrInt[i]);
            } else arr.add(arrInt[i]);
        }
        arr.addAll(arrNeg);
        int[] ints = Ints.toArray(arr);
        return ints;
    }

    public static int[][] SumOfTwo(int[] array, int sum) {
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<>();
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int s = array[first] + array[last];
            if (s == sum) {
                map.put(array[first], array[last]);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
        int[][] nums = map.entrySet().stream().map(entry -> new int[]{entry.getKey(),
                entry.getValue()}).toArray(int[][]::new);
        return nums;
    }

    public static int[][] NumberOccurrences(int[] array) {
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : array) {
            Integer value = map.get(i);
            if (value == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++value);
            }
        }
        int[][] nums = map.entrySet().stream().map(entry -> new int[]{entry.getKey(),
                entry.getValue()}).toArray(int[][]::new);
        return nums;
    }

    public static void main(String[] args) {
        // System.out.println(OddEven(2147483647 + 1));
        int[] arr = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[] arr1 = {3, 2, 7, 5, 1, 9, 23, 1};
        int[][] arr12 = NumberOccurrences(arr);
        for (int[] ints : arr12) {
            System.out.println(Arrays.toString(ints));
        }
        //System.out.println(Arrays.toString(SumOfTwo(arr, 12)));
        // System.out.println(KthLargest(arr, 3));
        //SumOfTwo(arr, 12);
    }
}
