#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    int arr[n];
    cout << "Enter " << n << " numbers (from 0 to " << n << ", one missing):" << endl;

    int sum = 0;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
        sum += arr[i];
    }

    int total = n * (n + 1) / 2; // Sum of numbers from 0 to n
    int missing =total-sum;

    cout << "The missing number is: " << missing << endl;

    return 0;
}

