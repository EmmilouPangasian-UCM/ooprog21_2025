#include <stdio.h>

int main() {
    int num = 10;     // Simulated user input
    int num2 = 2;     // Simulated user input

    if ((num2 != 0 && num % num2 == 0) || (num != 0 && num2 % num == 0)) {
        printf("One of these numbers is\n");
        printf("evenly divisible into the other.\n");
    } else {
        printf("Neither of these numbers is\n");
        printf("evenly divisible into the other.\n");
    }

    return 0;
}
