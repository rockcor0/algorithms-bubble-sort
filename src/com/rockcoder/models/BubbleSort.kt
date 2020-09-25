package com.rockcoder.models

/*
Bubble sort
 */
fun bubbleSort(arr: MutableList<Int>){
    for(i in arr.indices){
        for(j in arr.size-1 downTo i+1){
            if(arr[j] < arr[j-1]){
                val temp = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = temp
            }
        }
    }
}