#include <stdio.h>

int main() {
    char grade;
    float min_avg, current_avg, final_weight, required_score;

    printf("Enter desired grade> ");
    scanf("%c", &grade);

    printf("Enter minimum average required> ");
    scanf("%f", &min_avg);

    printf("Enter current average in course> ");
    scanf("%f", &current_avg);

    printf("Enter how much the final counts as a percentage of the course grade> ");
    scanf("%f", &final_weight);
    final_weight = final_weight / 100.0;

    required_score = (min_avg - current_avg * (1 - final_weight)) / final_weight;

    printf("You need a score of %.2f on the final to get a %c.\n", required_score, grade);
    return 0;
}


/*
    Enter desired grade> A
    Enter minimum average required> 95
    Enter current average in course> 97
    Enter how much the final counts as a percentage of the course grade> 25
    You need a score of 89.00 on the final to get a A.
*/