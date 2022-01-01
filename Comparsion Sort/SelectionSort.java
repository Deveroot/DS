package com.company;

public class SelectionSort {
    //big O Notation  --> (n^2)
    public  void  sort( int [] array ){
        for (var i = 0; i < array.length ; i++) {
            var minIndex = i;
            for (var j = i ;j < array.length ;j++)
                if (array[j] <= array[minIndex] )// if   index2 less than minIndex
                    minIndex = j; // minIndex  = index2
                   swap(array, minIndex ,i ); // to swap  minIndex with  index1
        }
    }
    //this fun his two variable  index 1 ,index 2  and the array نكتب بي العربي  ولا احسن بي الانفليزي
    private  void swap (int [] array ,int index1 ,int index2){
        var temp =array[index1];  // copy array index1  into  temp
        array[index1] =array[index2]; // copy index into index2
        array[index2] =temp; // copy index2 into temp
    }
}
