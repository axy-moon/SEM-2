#include<stdio.h>

//Complexity : O()

int a[] = {5,2,1,65,34,21,12};
int size = sizeof(a)/sizeof(a[0]);

int b[size];

void MergeSort(int low,int high) {
    if(low<=high) {
    
        int mid = (low+high)/2;
        MergeSort(low,mid);
        MergeSort(mid+1,high);
        Merge(low,mid,high);
    }
}

void Merge(int low,int mid,int high) {
    int h = low,i=low,j=mid+1;
    while(h<=mid && j<=high) {
        if(a[h]<a[j]){
            b[i] = a[h];
            h = h+1;
        }
        else {
            b[i] = a[j];
            j = j+1;
        }
        i=i+1;
    }
    if(h>mid) {
        for(int k=j;k<=high;k++) {
            b[]
        }
    }
}



int main() {
    int low = 0;
    MergeSort(low,size);

    printf("Sorted List\n");
    for(int i=0;i<size;i++)
        printf("%d ",a[i]);

}

