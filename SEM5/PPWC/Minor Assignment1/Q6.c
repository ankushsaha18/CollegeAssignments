#include <stdio.h>

int main() {
    double vi, s, a, t;

    printf("Enter takeoff speed (in km/hr): ");
    scanf("%lf", &vi);

    printf("Enter distance (in meters): ");
    scanf("%lf", &s);

    vi *= (1000.0 / 3600.0);    // Convert km/hr to m/s
    a = (vi * vi) / (2 * s);    //  v^2 = u^2 + 2as  =>  a = v^2/2s
    t = vi / a;                 //  v = u + at  =>  t = v/a

    printf("Acceleration: %.2f m/s^2\n", a);
    printf("Time to Takeoff: %.2f seconds\n", t);

    return 0;
}


/*
    Enter takeoff speed (in km/hr): 278
    Enter distance (in meters): 94
    Acceleration: 31.72 m/s^2
    Time to Takeoff: 2.43 seconds
*/