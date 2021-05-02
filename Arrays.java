class Arrays {

    public static void main(String[] args) {

        int[] intArr = new int[10];

        int[] intArr2 = { 10, 20, 30 };

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

        for (int num : intArr2) {
            System.out.println(num);
        }

        String[] strArr = new String[10];

        for (String str : strArr) {
            System.out.println(str);
        }

    }

}