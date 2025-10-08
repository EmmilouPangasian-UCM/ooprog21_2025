#include <stdio.h>

int main() {
    int one, two, three, four;
    int highest;

    // Simulated input (you can change these values to test)
    one = 10;
    two = 25;
    three = 7;
    four = 20;

    highest = one;

    if (two > highest)
        highest = two;

    if (three > highest)
        highest = three;

    if (four > highest)
        highest = four;

    printf("The highest number is %d\n", highest);

    return 0;
}

