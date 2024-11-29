#include <stdio.h>

int main() {
    int num, reversedNum = 0, remainder;

    // Input a number from the user
    printf("Enter a number: ");
    scanf("%d", &num);

    int originalNum = num; // Store the original number

    // Reverse the number
    while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }

    // Check if the reversed number is a palindrome
    if (originalNum == reversedNum) {
        printf("The palindrome of %d is %d\n", originalNum, reversedNum);
    } else {
        printf("The number %d is not a palindrome\n", originalNum);
    }

    return 0;
}