package Lektion05;

import java.util.ArrayList;

import Common.ArrayFiller;

class Countingsorter{
    public void CountingSort(ArrayList<Integer> A, ArrayList<Integer> B, int k){
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
            C.add(0);
        }
        for(int j = 0; j < A.size(); j++){
            C.set(A.get(j), C.get(A.get(j))+1);
        }
        for(int i = 1; i < k; i++){
            C.set(i, (C.get(i) + C.get(i-1)));
        }
        for(int i = A.size()-1; i >= 0; i--){
            B.set(C.get(A.get(i))-1, A.get(i));
            C.set(A.get(i), C.get(A.get(i))-1);

        }
    }
}

class Main{
    public static void main(String[] args) {
        int k = 8;
        Countingsorter sorter = new Countingsorter();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayFiller.FillArrayRandom(A, 10, k);
        System.out.println(A);
        ArrayList<Integer> sorted = new ArrayList<>();
        ArrayFiller.FillArrayEmpty(sorted, 10);
        sorter.CountingSort(A, sorted, k);
        System.out.println(sorted);
    }
}