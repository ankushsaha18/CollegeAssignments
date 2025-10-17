room_rates = {
    "standard": 100,
    "deluxe": 150,
    "suite": 250
}

room_type = input("Enter room type (Standard, Deluxe, Suite): ").lower()
nights = int(input("Enter number of nights: "))
season = input("Enter season (peak, off, regular): ").lower()
loyalty_member = input("Are you a loyalty member? (yes/no): ").lower()

if room_type not in room_rates:
    print("Invalid room type!")
else:
    base_cost = room_rates[room_type] * nights

    if nights > 7:
        base_cost *= 0.8  # 20% discount
    elif nights > 3:
        base_cost *= 0.9  # 10% discount

    if season == "peak":
        base_cost *= 1.2  # 20% increase
    elif season == "off":
        base_cost *= 0.85  # 15% decrease

    if loyalty_member == "yes":
        base_cost *= 0.95  # 5% discount

    print(f"Final booking cost: ${base_cost:.2f}")


'''
Enter number of nights: 4
Enter season (peak, off, regular): off
Are you a loyalty member? (yes/no): yes
Final booking cost: $436.05

'''