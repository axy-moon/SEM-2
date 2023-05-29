#include<stdio.h>

//Complexity : O(n^2)

int main() {
    int a[] = {5,2,1,65,34,21,12};
    int size = sizeof(a)/sizeof(a[0]);
    for(int i=0;i<size;i++) {
        for(int j=1;j<size-i;j++) {
            if(a[j-1]>a[j]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp; }
        }
    }

    printf("Sorted List\n");
    for(int i=0;i<size;i++)
        printf("%d ",a[i]);
}

