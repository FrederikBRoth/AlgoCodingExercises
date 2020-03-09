package Lektion04;

import java.util.ArrayList;

import Common.ArrayFiller;

class QuickSorter{

    
    public void Quicksort(ArrayList<Integer> A, int p, int r){
        if(p < r){
            int q = Partition(A, p, r);
            Quicksort(A, p, q-1);
            Quicksort(A, q+1, r);
        }
    }

    public int Partition(ArrayList<Integer> A, int p, int r){
        int x = A.get(r);
        int i = p - 1;
        int temp;
        for(int j = p; j <= r - 1; j++){
            if(A.get(j) <= x){
                i++;
                temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
            }
        }
        temp = A.get(i+1);
        A.set(i+1, A.get(r));
        A.set(r, temp);
        return i + 1;
    }
}

class Main{
    public static void main(String[] args) {
        QuickSorter sorter = new QuickSorter();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayFiller.FillArrayRandom(a, 20000);
        System.out.println(a);
        long startTime = System.currentTimeMillis();
        sorter.Quicksort(a, 0, a.size() - 1);
        System.out.println(a);
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed + " millisec");
    }
}