void merge(int *A, int l, int m, int h) {
    int i = l, j = m + 1, k = 0;
    int result[h - l + 1];

    while (i <= m && j <= h) {
        if (A[i] <= A[j]) {
            result[k++] = A[i++];
        } else {
            result[k++] = A[j++];
        }
    }

    while (i <= m) {
        result[k++] = A[i++];
    }

    while (j <= h) {
        result[k++] = A[j++];
    }

    for (i = l, k = 0; i <= h; i++, k++) {
        A[i] = result[k];
    }
}

void merge_sort(int *A, int l, int h) {
    if (l < h) {
        int m = (l + h) / 2;
        merge_sort(A, l, m);
        merge_sort(A, m + 1, h);
        merge(A, l, m, h);
    }
}

double findMedian(int arr[], int size) {
    if (size % 2 == 0) {
        return (arr[size / 2 - 1] + arr[size / 2]) / 2.0;
    } else {
        return arr[size / 2];
    }
}

double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int resultSize = nums1Size + nums2Size;
    int* result = (int*)malloc(resultSize * sizeof(int));  
    if (result == NULL) {
        printf("Memory allocation failed!\n");
        return -1;
    }
    for (int i = 0; i < nums1Size; i++) {
        result[i] = nums1[i];
    }
    for (int i = 0; i < nums2Size; i++) {
        result[nums1Size + i] = nums2[i];
    }
    merge_sort(result, 0, resultSize - 1);

    double median = findMedian(result, resultSize);
    free(result);

    return median;
}
