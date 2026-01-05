#include <stdio.h>

#define P 5   // Number of processes
#define R 4   // Number of resources

int main() {

    /* Allocation Matrix */
    int alloc[P][R] = {
        {0, 0, 1, 2},
        {2, 0, 0, 0},
        {0, 0, 3, 4},
        {2, 3, 5, 4},
        {0, 3, 3, 2}
    };

    /* Maximum Requirement Matrix */
    int max[P][R] = {
        {0, 0, 1, 2},
        {2, 7, 5, 0},
        {6, 6, 5, 6},
        {4, 3, 5, 6},
        {0, 6, 5, 2}
    };

    /* Total instances of each resource */
    int total[R] = {6, 7, 12, 12};

    int need[P][R];
    int avail[R];
    int avail_original[R];
    int finish[P] = {0};
    int safeSeq[P];

    /* --------- (a) Calculate NEED Matrix --------- */
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < R; j++) {
            need[i][j] = max[i][j] - alloc[i][j];
        }
    }

    /* --------- Calculate AVAILABLE = TOTAL - ALLOCATED --------- */
    for (int j = 0; j < R; j++) {
        int sum = 0;
        for (int i = 0; i < P; i++)
            sum += alloc[i][j];
        avail[j] = total[j] - sum;
        avail_original[j] = avail[j];   // Save original available
    }

    /* Print Need Matrix */
    printf("Need Matrix:\n");
    for (int i = 0; i < P; i++) {
        for (int j = 0; j < R; j++)
            printf("%d ", need[i][j]);
        printf("\n");
    }

    /* --------- (b) Safety Algorithm --------- */
    int count = 0;

    while (count < P) {
        int found = 0;

        for (int i = 0; i < P; i++) {
            if (!finish[i]) {
                int j;
                for (j = 0; j < R; j++) {
                    if (need[i][j] > avail[j])
                        break;
                }

                if (j == R) {
                    for (int k = 0; k < R; k++)
                        avail[k] += alloc[i][k];

                    safeSeq[count++] = i;
                    finish[i] = 1;
                    found = 1;
                }
            }
        }

        if (!found)
            break;
    }

    if (count == P) {
        printf("\nSystem is in a SAFE state.\nSafe Sequence: ");
        for (int i = 0; i < P; i++)
            printf("P%d ", safeSeq[i] + 1);
        printf("\n");
    } else {
        printf("\nSystem is NOT in a safe state.\n");
    }

    /* --------- (c) Request by P3 --------- */
    int request[R] = {0, 1, 0, 1};   // Request: R1 R2 R3 R4
    int p = 2;  // P3 (0-based index)

    printf("\nRequest by P3: {0, 1, 0, 1}\n");

    int canGrant = 1;

    /* Check request <= need */
    for (int j = 0; j < R; j++) {
        if (request[j] > need[p][j]) {
            canGrant = 0;
            break;
        }
    }

    /* Check request <= ORIGINAL available */
    for (int j = 0; j < R; j++) {
        if (request[j] > avail_original[j]) {
            canGrant = 0;
            break;
        }
    }

    if (canGrant)
        printf("The request CAN be granted immediately.\n");
    else
        printf("The request CANNOT be granted immediately.\n");

    return 0;
}
