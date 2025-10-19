#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number: ";
    cin >> n;

    cout << "Prime numbers up to " << n << " are: ";

    for (int i = 2; i <= n; i++) {
        bool isPrime = true;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            cout << i << " ";
    }

    return 0;
}

