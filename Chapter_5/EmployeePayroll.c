#include <stdio.h>

#define MAX_EMPLOYEE_NUMBER 9999
#define MAX_PAY_RATE 60.00
#define OVERTIME_MULTIPLIER 1.5

double calculateRegularPay(double hoursWorked, double payRate) {
    double regularHours = hoursWorked < 40 ? hoursWorked : 40;
    return regularHours * payRate;
}

double calculateOvertimePay(double hoursWorked, double payRate) {
    if (hoursWorked > 40) {
        double overtimeHours = hoursWorked - 40;
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }
    return 0.0;
}

int main() {
    int employeeNumber = 1234;
    double payRate = 25.5;

    if (employeeNumber > MAX_EMPLOYEE_NUMBER) {
        printf("Error: Employee number exceeds max allowed.\n");
        return 1;
    }

    if (payRate > MAX_PAY_RATE) {
        printf("Error: Pay rate exceeds max allowed.\n");
        return 1;
    }

    double hoursWorked = 45.0;
    double regularPay = calculateRegularPay(hoursWorked, payRate);
    double overtimePay = calculateOvertimePay(hoursWorked, payRate);
    double totalPay = regularPay + overtimePay;

    printf("Total pay: $%.2f\n", totalPay);

    return 0;
}
