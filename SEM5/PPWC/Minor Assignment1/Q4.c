#include <stdio.h>

int main() {
    float meters;
    printf("Enter distance in meters: ");
    scanf("%f", &meters);

    float km = meters * 0.001;
    float cm = meters * 100;
    float mm = meters * 1000;
    float feet = meters * 3.28084;
    float inches = meters * 39.3701;
    
    printf("\nDistance Conversions:\n");
    printf("Meters      : %.2f\n", meters);
    printf("Kilometers  : %.2f\n", km);
    printf("Centimeters : %.2f\n", cm);
    printf("Millimeters : %.2f\n", mm);
    printf("Feet        : %.2f\n", feet);
    printf("Inches      : %.2f\n", inches);

    return 0;
}

/*

Enter distance in meters: 12.5

Distance Conversions:
Meters      : 12.50
Kilometers  : 0.01
Centimeters : 1250.00
Millimeters : 12500.00
Feet        : 41.01
Inches      : 492.13

*/