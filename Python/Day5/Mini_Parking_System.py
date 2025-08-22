parking = [0] * 20

def reset_parking():
    global parking
    parking = [0] * 20

def getParking():
    global parking
    return parking

def park_car():
    global parking
    for count in range(len(parking)):
        if parking[count] == 0:
            parking[count] = 1
            return f"Your car has been parked at {count+1}"
    return "Sorry! Parking lot is full."

def remove_car(slot):
    global parking
    if slot < 1 or slot > len(parking):
        return "Invalid slot number!"
    if parking[slot-1] == 0:
        return f"Slot {slot} is already empty."
    parking[slot-1] = 0
    return f"Car removed from slot {slot}"

def show_parking_status():
    global parking
    return " ".join(str(s) for s in parking)

def main():
    print("Welcome to the Mini Parking System")
    reset_parking()
    while True:
        print("\nMenu:")
        print("1. Park a car")
        print("2. Remove a car")
        print("3. Show parking status")
        print("4. Reset parking")
        print("5. Exit")
        choice = input("Enter your choice: ")
        if choice == "1":
            print(park_car())
        elif choice == "2":
            slot = int(input("Enter slot number to remove: "))
            print(remove_car(slot))
        elif choice == "3":
            print(show_parking_status())
        elif choice == "4":
            reset_parking()
            print("Parking reset successfully.")
        elif choice == "5":
            print("Goodbye!")
            break
        else:
            print("Invalid choice. Please try again.")

main()
