#include <iostream>

using namespace std;

int main()
{
    int stock, demand, reorderPoint, orderQuantity, days;

    cout << "Enter initial stock: ";
    cin >> stock;

    cout << "Enter daily demand: ";
    cin >> demand;

    cout << "Enter reorder point: ";
    cin >> reorderPoint;

    cout << "Enter order quantity: ";
    cin >> orderQuantity;

    cout << "Enter number of days: ";
    cin >> days;

    cout << "\nDay\tDemand\tStock\n";

    for (int day = 1; day <= days; day++)
    {
        stock -= demand;

        if (stock <= reorderPoint)
        {
            cout << "Day " << day
                 << ": Reordered "
                 << orderQuantity
                 << " units\n";

            stock += orderQuantity;
        }

        cout << day
             << "\t" << demand
             << "\t" << stock
             << endl;
    }

    return 0;
}