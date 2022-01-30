public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = new String[][]{{"1", "2", "5", "4"}, {"5", "v", "7", "8"}, {"1", "2", "3", "4"}, {"5", "6", "7", "8"}};
        try {
            masive(array);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива больше заданного");
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("В массиве содержится не числовое значение");
            e.printStackTrace();
        }

    }


    public static void masive(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        String s1 = "[0-9]";
        if (array.length != 4) {
            throw new MyArraySizeException(" ");
        } else {
            int[][] intarray = new int[array.length][array.length];

            for (int i = 0; i < intarray.length; i++) {
                for (int j = 0; j < intarray.length; j++) {
                    if (array[i][j].matches(s1)) {
                        intarray[i][j] = Integer.parseInt(array[i][j].trim());
                        sum = intarray[i][j] + sum;
                        System.out.print(intarray[i][j]);
                    } else if (!array[i][j].matches(s1)) throw new MyArrayDataException(" ");
                    
                }
                System.out.println();


            }System.out.println(sum);
        }
    }
}

