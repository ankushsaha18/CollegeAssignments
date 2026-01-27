#include<stdio.h>
#include<string.h>

struct item{
    char name[20];
    float price;
    int quantity;
    float subtotal;
    float tax;
    float total;
};

int main(){
    struct item it1;
    struct item it2;
    struct item it3;
    
    for(int i = 1 ; i <= 3 ; i++){
        printf("Enter details for item %d\n", i);
        struct item *it;
        if(i == 1) it = &it1;
        else if(i == 2) it = &it2;
        else it = &it3;
        printf("Name:");
        char name[20];
        scanf("%s", name);
        strcpy(it->name, name);
        printf("Price:");
        scanf("%f", &it->price);
        printf("Quantity:");
        scanf("%d", &it->quantity);
        it->subtotal = it->price * it->quantity;
        it->tax = it->subtotal * 0.18;
        it->total = it->subtotal + it->tax;
    }

    printf("| %-11s | %6s | %8s | %8s | %6s | %6s |\n", "Item Name", "Price", "Quantity", "Subtotal", "Tax", "Total");
    printf("| %-11s | %6.2f | %8d | %8.2f | %6.2f | %6.2f |\n", it1.name, it1.price, it1.quantity, it1.subtotal, it1.tax, it1.total);
    printf("| %-11s | %6.2f | %8d | %8.2f | %6.2f | %6.2f |\n", it2.name, it2.price, it2.quantity, it2.subtotal, it2.tax, it2.total);
    printf("| %-11s | %6.2f | %8d | %8.2f | %6.2f | %6.2f |\n", it3.name, it3.price, it3.quantity, it3.subtotal, it3.tax, it3.total);
    printf("| %-31s | %8.2f | %6.2f | %6.2f |\n", "Total", it1.subtotal + it2.subtotal + it3.subtotal, it1.tax + it2.tax + it3.tax, it1.total + it2.total + it3.total);
    return 0;
}