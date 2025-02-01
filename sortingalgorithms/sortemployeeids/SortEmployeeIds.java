package sortingalgorithms.sortemployeeids;

public class SortEmployeeIds {
    public void insertionSort(int[]employeeIds){
        for(int i=0;i<=employeeIds.length;i++){
            for(int j=i-1;j>0;j--){
                if(employeeIds[j]<employeeIds[j-1]){
                    int temp=employeeIds[j];
                    employeeIds[j]=employeeIds[j-1];
                    employeeIds[j-1]=temp;
                }
                else break;
            }
        }
    }
}
