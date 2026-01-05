#include <stdio.h>

typedef struct {
    int pid;
    int arrival;
    int burst;
    int remaining;
    int start;
    int completion;
    int waiting;
    int turnaround;
    int response;
    int started;
} Process;

void resetProcesses(Process p[], int n) {
    for (int i = 0; i < n; i++) {
        p[i].remaining  = p[i].burst;
        p[i].start      = 0;
        p[i].completion = 0;
        p[i].waiting    = 0;
        p[i].turnaround = 0;
        p[i].response   = 0;
        p[i].started    = 0;
    }
}

void fcfs(Process p[], int n) {
    int time = 0;
    float awt = 0, att = 0, art = 0;

    printf("\nGantt Chart:\n|");

    for (int i = 0; i < n; i++) {
        if (time < p[i].arrival)
            time = p[i].arrival;

        p[i].start = time;
        p[i].response = p[i].start - p[i].arrival;

        time += p[i].burst;

        p[i].completion = time;
        p[i].turnaround = p[i].completion - p[i].arrival;
        p[i].waiting = p[i].turnaround - p[i].burst;

        printf(" P%d |", p[i].pid);

        awt += p[i].waiting;
        att += p[i].turnaround;
        art += p[i].response;
    }

    printf("\nAverage Waiting Time = %.2f", awt / n);
    printf("\nAverage Turnaround Time = %.2f", att / n);
    printf("\nAverage Response Time = %.2f\n", art / n);
}

void roundRobin(Process p[], int n, int tq) {
    int time = 0, completed = 0;
    float awt = 0, att = 0, art = 0;

    printf("\nGantt Chart:\n|");

    while (completed < n) {
        int executedInThisCycle = 0;

        for (int i = 0; i < n; i++) {
            if (p[i].arrival <= time && p[i].remaining > 0) {
                executedInThisCycle = 1;

                if (!p[i].started) {
                    p[i].start = time;
                    p[i].response = p[i].start - p[i].arrival;
                    p[i].started = 1;
                }

                printf(" P%d |", p[i].pid);

                if (p[i].remaining > tq) {
                    time += tq;
                    p[i].remaining -= tq;
                } else {
                    time += p[i].remaining;
                    p[i].remaining = 0;

                    p[i].completion = time;
                    p[i].turnaround = p[i].completion - p[i].arrival;
                    p[i].waiting = p[i].turnaround - p[i].burst;

                    completed++;
                    awt += p[i].waiting;
                    att += p[i].turnaround;
                    art += p[i].response;
                }
            }
        }

        if (!executedInThisCycle) {
            int nextArrival = -1;
            for (int i = 0; i < n; i++) {
                if (p[i].remaining > 0) {
                    if (nextArrival == -1 || p[i].arrival < nextArrival) {
                        nextArrival = p[i].arrival;
                    }
                }
            }
            if (nextArrival > time) {
                time = nextArrival;
            }
        }
    }

    printf("\nAverage Waiting Time = %.2f", awt / n);
    printf("\nAverage Turnaround Time = %.2f", att / n);
    printf("\nAverage Response Time = %.2f\n", art / n);
}

int main() {
    int n = 5, choice, tq;

    Process p[5] = {
        {1, 0, 3, 3, 0, 0, 0, 0, 0, 0},
        {2, 2, 6, 6, 0, 0, 0, 0, 0, 0},
        {3, 4, 4, 4, 0, 0, 0, 0, 0, 0},
        {4, 6, 5, 5, 0, 0, 0, 0, 0, 0},
        {5, 8, 2, 2, 0, 0, 0, 0, 0, 0}
    };

    while (1) {
        printf("\n1. FCFS\n2. Round Robin\n5. Exit\nEnter choice: ");
        scanf("%d", &choice);

        switch (choice) {
        case 1:
            resetProcesses(p, n);
            fcfs(p, n);
            break;
        case 2:
            resetProcesses(p, n);
            printf("Enter Time Quantum: ");
            scanf("%d", &tq);
            roundRobin(p, n, tq);
            break;
        case 5:
            return 0;
        default:
            printf("Invalid choice\n");
        }
    }
}
