public class Main {

    public static void printArray(int [] array)
    {
        for(int i=0; i < array.length; i++)
        {
            System.out.println("array["+i+"] = "+array[i]);
        }
        System.out.println();
    }

    public static void leftShiftArray(int [] array)
    {
        int buffer = array[0];
        for(int i=1; i < array.length; i++)
        {
            array[i-1]=array[i];
        }
        array[array.length-1] = buffer;
    }

    public static int[] range(int start, int end, int step)
    {
        int [] array = new int[(end - start)/step];
        for(int val=start, i = 0; val < end; val+=step, i++)
        {
            array[i] = val;
        }
        return array;
    }

    public static void main(String[] args) {
        //объявляем переменную с именем array которая яляеться ссылкой на цлочисленный массив
        //и помещаем в переменную array результат работы функции range
        //которая возврящат ссылку на целочисленный массив
        int [] array = range(10,100,10);
        //ввзять ссылкку хранимую в переменной array и передать ее в качестве параметра функции
        //printArray
        printArray(array);//иди в функцию printArray и поработай с массивом array
        leftShiftArray(array);
        leftShiftArray(array);
        leftShiftArray(array);
        printArray(array);
        int [] array2 = range(20,200,30);
        printArray(array2);
        leftShiftArray(array2);
        printArray(array2);
        /*
        //выводит все элементы кроме нудевого так как i должно быть больше 0
        for(int i=array.length-1; i >0; i--)
        {
            System.out.println("array["+i+"] = "+array[i]);
        }*/

    }
}
