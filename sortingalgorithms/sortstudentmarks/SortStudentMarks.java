package sortingalgorithms.sortstudentmarks;

public class SortStudentMarks {
    public void bubbleSort(int[]marks){
        boolean swapped;
        for(int i=0;i<marks.length;i++){
            swapped=false;
            for(int j=0;j<marks.length-i-1;j++){
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
