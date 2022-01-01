package com.company;

public class BubbleSort {
public  void sort (int [] array){
//big O Notation  --> (n^2)
    for (var i =0 ; i < array.length ;i++)// n time
        for (var j = 1 ; j < array.length ;j++) // n time
            if (array[j]< array[j-1])// this for test indexes if index2 less than index1
               swap(array, j ,j-1); // call fun
    }
    //this fun his two variable  index 1 ,index 2  and the array نكتب بي العربي  ولا احسن بي الانفليزي
    private  void swap (int [] array ,int index1 ,int index2){
    var temp =array[index1];  // copy array index1  into  temp
    array[index1] =array[index2]; // copy index into index2
    array[index2] =temp; // copy index2 into temp
    }
}