package com.epam.algo;

public class BubbleSort {
        private int[] a;
        private int value;

        public BubbleSort(int max){
            a = new int[max];
            value = 0;
        }

        public void into(int value){
            a[this.value] = value;
            this.value++;
        }

        public void showMassive(){
            for (int i = 0; i < value; i++){
                System.out.print(a[i] + " ");
                System.out.println("");
            }
        }

        private void swapValue(int first, int second){
            int b = a[first];
            a[first] = a[second];
            a[second] = b;
        }

        public void bubbleSorter(){
            for (int out = value - 1; out >= 1; out--){
                for (int in = 0; in < out; in++){
                    if(a[in] > a[in + 1])
                        swapValue(in, in + 1);
                }
            }
        }
}
